package turmite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class mainFrame extends JPanel implements ActionListener {

	public static boolean saveFlag, rdFlag, rcFlag, scDisableFlag, rpFlag;
	
	Random  r   = new Random();
	
	int x = (rpFlag) ? r.nextInt(width)      : width  / 2     ,
		y = (rpFlag) ? r.nextInt(height - 20): height / 2 - 10,
		d = 0              ,  //Memory for direction
		X = width  - 1     , // Maximum horizontal coordinate
		Y = height - 21    ;//  Maximum vertical   coordinate
	
	static final int   	BLK = -16777216		,  //is same as Color .[color] .getRGB() (an integer)
						WHT = -1			,
						RED = -65536		,
						ORN = -14336		,
						YEL = -256			,
						GRN = -16711936		,
						BLU = -16776961		,
						PUR = -65281		;
	static		Color 	c					, //memory for pixel color
						blk = Color.BLACK	,
						wht = Color.WHITE	,
						red = Color.RED		,
						orn = Color.ORANGE	,
						yel = Color.YELLOW	,
						grn = Color.GREEN	,
						blu = Color.BLUE	,
						pur = Color.MAGENTA	;
	
	private JButton Button;
	JButton btnEndLoop = new JButton("End Loop");

	static BufferedImage img;
	static int i2;
	static int  [] defA= {0, 1, 2, 3, 4, 5, 6, 7}, 					  //direction     array (initial)
			       dA  = new int  [8],            				     // direction     array ( final )
			       cA  = new int  [8],           				    //  color   id    array
			       tA  = {0, -1, -1, -1, -1, -1, -1, -1};          //   dupe   test   array
	static Color[] cAi = {blk, wht, red, orn, yel, grn, blu, pur},//    color literal array (initial)
			       cAf = new Color[8];        					 //     color literal array ( final )

	public static void main(String[] args)
	{		
		new mainFrame();
	}

	static int width; //These values will be slightly different from user input:
	static int height;// TODO: Get values for width and height from user in MenuGUI.

	static JFrame frame = new JFrame();

	int i, j;

	mainFrame() 
	{
		frame.addWindowListener(new java.awt.event.WindowAdapter()
		{
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent)
		    {
		        btnEndLoop.doClick();
		    }
		});
		System.out.println("x|" + x + " , y|" + y);
		
		//arrayMake();
		if (rdFlag)
		{
			Arrays.fill(dA, -1); //the arrays are initially filled with zeros.
			i = 0;				// zero will be detected as a duplicate, so fill it with something else.
			while (i <= 7)
			{
				i2 = r.nextInt(8);
				if (IntStream.of(dA).noneMatch(v -> v == i2))
				{//if dA does not contain i2
					System.out.print(i2 + " ");
					dA[i] = i2;
					i++;
				}
			}
			System.out.println();
		} else System.arraycopy(defA, 0, dA, 0, 8); //dA is set to default if rdFlag is false.
		System.out.println("dA Done.");
		
		if (rcFlag)
		{
			do
			{
				Arrays.fill(cA, -1); //The arrays are initially filled with zeros.
				i = 0;				// Zero will be detected as a duplicate, so fill it with something else.
				
				//Populate Color Array
				while (i <= 7)
				{
					i2 = r.nextInt(8);
					if (IntStream.of(cA).noneMatch(v -> v == i2))
					{
						System.out.print(i2 + " ");
						cA [i] = i2;
						i++;
					}
				} System.out.println();
				
				//Discontinue if user did not opt for "short circuit disable"
				if (!scDisableFlag)
					break;
				//Check for short circuit
				i = 0;
				j = 0;
				 //This loop takes an index, puts it into the test array (1), sets its value to the next color id (2), and then continues if the new index is not already in the test array (3).
				// If j is not 8 (meaning an index traveling along cA has not been able to reach all possible colors), then a new random cA must be generated.
				do {
					System.out.println(i + " , " + cA[i] + " | " + j); // i , cA[i] | j
					tA[j] = i; //(1)
					i = cA[i];// (2)
					j++;
				} while (IntStream.of(tA).noneMatch(v -> v == i));//(3)
			} while (j != 8); //This means a short circuit was detected.
			for(i = 0; i <= 7; i++)
				cAf[i] = cAi[cA[i]]; //Change from id to literal with cAi[cA[i]]. 
		} else System.arraycopy(cAi, 0, cAf, 0, 8); //cAf is set to default if rcFlag is false.
		System.out.println("cAf Done.");
		
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE);

		setPreferredSize(new Dimension(width - 10, height - 10));
		frame.setResizable(false);
		frame.setTitle("Turmite");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(this);
		setLayout(null);

		Button = new JButton("Start Loop");
		Button.setBounds(0, height - 20, width / 2, 20);
		Button.setPreferredSize(new Dimension(width / 2, 20));
		Button.addActionListener(this);
		Button.setActionCommand("");
		add(Button);

		btnEndLoop.setAction(action);
		btnEndLoop.setPreferredSize(new Dimension(width / 2, 20));
		btnEndLoop.setActionCommand("");
		btnEndLoop.setBounds(width / 2, height - 20, width / 2, 20);
		add(btnEndLoop);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //you cannot leave, eeediot. (jk, the [x] button presses the end button programmatically) 
	}
	
	private volatile boolean runFlag = false; //Ensures that the while loop can be stopped. 
	private final Action action = new SwingAction();

	public void startThread()
	{
		Thread t = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				runFlag = true;
				while(runFlag)
				{
					//loop();
					
					//for 4-directions
					//			switch (d) 
					//			{
					//			case 0 : x++; 		break;
					//			case 1 :      y++;	break;
					//			case 2 : x--;		break;
					//			case 3 :      y--; 	break;
					//			default:    		break;
					//			}

					//for 8-directions
					switch (d)
					{
					case 0 : x++; 		break;
					case 1 : x++; y++;	break;
					case 2 : 	  y++;	break;
					case 3 : x--; y++; 	break;
					case 4 : x--;		break;
					case 5 : x--; y--;	break;
					case 6 : 	  y--;	break;
					case 7 : x++; y--;	break;
					default:    		break;
					}
					//Check if the turmite is out of bounds.
					if (x < 0)  x = X;
					if (x > X)  x = 0;
					if (y < 0)  y = Y;
					if (y > Y)  y = 0;

					//old colorCheck
					/*if (WHT.getRGB() == img.getRGB(x , y))
						{
							c = BLK;

							if (d == 3)
								d =  0;
							else 
								d++;
						}
						else
						{ 
							c = WHT;

							if (d == 0)
								d =  3;
							else 
								d--;
						}*/

					switch (img.getRGB(x , y))
					{//Check color at the point (x , y), then change c to the color at cAf and d to the direction at dA.
					case BLK: c = cAf[1];	d += dA[0];	break;
					case WHT: c = cAf[2];	d += dA[1];	break;
					case RED: c = cAf[3];	d += dA[2];	break;
					case ORN: c = cAf[4];	d += dA[3];	break;
					case YEL: c = cAf[5];	d += dA[4];	break;
					case GRN: c = cAf[6];	d += dA[5];	break;
					case BLU: c = cAf[7];	d += dA[6];	break;
					case PUR: c = cAf[0];   d += dA[7];	break;
					default : 					        break;
					}

					d -= (d >= 8) ? 8 : 0; //loop d

					Graphics g = img.getGraphics();

					g.setColor(c);          //set color
					g.drawRect(x, y, 0, 0);// set pixel
					g.dispose();          //  go commit die (the processor won't miss it)
					
					frame.repaint();
				}
			}
		});t.start();
	}

	@Override
	public void paintComponent(Graphics g)
	{
		g.drawImage(img, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		Button.setEnabled(false);     //disable start button
		btnEndLoop.setEnabled(true); // enable  end   button
		runFlag = true; 			//  start   the   thread
		startThread();
	}
	private class SwingAction extends AbstractAction
	{ //handle end loop button
		public SwingAction()
		{
			putValue(NAME, "End Loop");
			putValue(SHORT_DESCRIPTION, "Ends Loop");
		}
		public void actionPerformed(ActionEvent e)
		{
			runFlag = false; //kill loop
			if (saveFlag)   // perform save if requested
				saveImage();
			System.exit(0);
		}
	}
	/**Saves the image to a file specified by the user.
	 *  @param img - the {@code BufferedImage}
	 *  @return tur.png - the resulting file*/
	public static void saveImage() { 
		System.out.println("Save Called");		
		try
		{
			ImageIO.write(img.getSubimage(0, 0, width, height - 20), "png", new File(MenuGUI.dir + "/tur.png"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}