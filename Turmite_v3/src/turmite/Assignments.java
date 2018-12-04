package turmite;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class Assignments {

	public static boolean showFlag;
	private JFrame frmAssignments;
	private JTextPane txtDir;
	private JPanel panelBlkTo;
	private JPanel panelWhtTo;
	private JPanel panelRedTo;
	private JPanel panelOrnTo;
	private JPanel panelYelTo;
	private JPanel panelGrnTo;
	private JPanel panelBluTo;
	private JPanel panelPurTo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (Throwable e)
		{
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Assignments window = new Assignments();
					window.getFrmAssignments().setVisible(showFlag);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assignments()
	{		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		setFrmAssignments(new JFrame());
		getFrmAssignments().setTitle("Assignments");
		getFrmAssignments().setResizable(false);
		getFrmAssignments().setBounds(100, 100, 270, 418);
		getFrmAssignments().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrmAssignments().getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 264, 389);
		getFrmAssignments().getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panelBlk = new JPanel();
		panelBlk.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.DARK_GRAY, null, null));
		panelBlk.setBackground(Color.BLACK);
		panelBlk.setBounds(36, 36, 30, 30);
		panel.add(panelBlk);
		
		JPanel panelWht = new JPanel();
		panelWht.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelWht.setBackground(Color.WHITE);
		panelWht.setBounds(36, 77, 30, 30);
		panel.add(panelWht);
		
		JPanel panelRed = new JPanel();
		panelRed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelRed.setBackground(Color.RED);
		panelRed.setBounds(36, 118, 30, 30);
		panel.add(panelRed);
		
		JPanel panelOrn = new JPanel();
		panelOrn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelOrn.setBackground(Color.ORANGE);
		panelOrn.setBounds(36, 159, 30, 30);
		panel.add(panelOrn);
		
		JPanel panelYel = new JPanel();
		panelYel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelYel.setBackground(Color.YELLOW);
		panelYel.setBounds(36, 200, 30, 30);
		panel.add(panelYel);
		
		JPanel panelGrn = new JPanel();
		panelGrn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelGrn.setBackground(Color.GREEN);
		panelGrn.setBounds(36, 241, 30, 30);
		panel.add(panelGrn);
		
		JPanel panelBlu = new JPanel();
		panelBlu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBlu.setBackground(Color.BLUE);
		panelBlu.setBounds(36, 282, 30, 30);
		panel.add(panelBlu);
		
		JPanel panelPur = new JPanel();
		panelPur.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPur.setBackground(Color.MAGENTA);
		panelPur.setBounds(36, 323, 30, 30);
		panel.add(panelPur);
		
		JPanel panelDiv = new JPanel();
		panelDiv.setBackground(Color.GRAY);
		panelDiv.setBounds(101, 11, 1, 365);
		panel.add(panelDiv);
		
		txtDir = new JTextPane();
		txtDir.setSelectedTextColor(Color.BLACK);
		txtDir.setSelectionColor(Color.LIGHT_GRAY);
		txtDir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtDir.setEditable(false);
		txtDir.setText(" "+mainFrame.dA[0]+"\r\n\r\n "+mainFrame.dA[1]+"\r\n\r\n "+mainFrame.dA[2]+"\r\n\r\n "+mainFrame.dA[3]+"\r\n\r\n "+mainFrame.dA[4]+"\r\n\r\n "+mainFrame.dA[5]+"\r\n\r\n "+mainFrame.dA[6]+"\r\n\r\n "+mainFrame.dA[7]);
		txtDir.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtDir.setBackground(Color.LIGHT_GRAY);
		txtDir.setBounds(136, 34, 22, 319);
		panel.add(txtDir);
		
		panelBlkTo = new JPanel();
		panelBlkTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBlkTo.setBackground(mainFrame.cAf[0]);
		panelBlkTo.setBounds(200, 36, 30, 30);
		panel.add(panelBlkTo);
		
		panelWhtTo = new JPanel();
		panelWhtTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelWhtTo.setBackground(mainFrame.cAf[1]);
		panelWhtTo.setBounds(200, 77, 30, 30);
		panel.add(panelWhtTo);
		
		panelRedTo = new JPanel();
		panelRedTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelRedTo.setBackground(mainFrame.cAf[2]);
		panelRedTo.setBounds(200, 118, 30, 30);
		panel.add(panelRedTo);
		
		panelOrnTo = new JPanel();
		panelOrnTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelOrnTo.setBackground(mainFrame.cAf[3]);
		panelOrnTo.setBounds(200, 159, 30, 30);
		panel.add(panelOrnTo);
		
		panelYelTo = new JPanel();
		panelYelTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelYelTo.setBackground(mainFrame.cAf[4]);
		panelYelTo.setBounds(200, 200, 30, 30);
		panel.add(panelYelTo);
		
		panelGrnTo = new JPanel();
		panelGrnTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelGrnTo.setBackground(mainFrame.cAf[5]);
		panelGrnTo.setBounds(200, 241, 30, 30);
		panel.add(panelGrnTo);
		
		panelBluTo = new JPanel();
		panelBluTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBluTo.setBackground(mainFrame.cAf[6]);
		panelBluTo.setBounds(200, 282, 30, 30);
		panel.add(panelBluTo);
		
		panelPurTo = new JPanel();
		panelPurTo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPurTo.setBackground(mainFrame.cAf[7]);
		panelPurTo.setBounds(200, 323, 30, 30);
		panel.add(panelPurTo);
		
		//IMPORTANT: ALLOW THIS WINDOW TO BE CALLED FROM OTHER WINDOWS BY `new Assignments();` 
		getFrmAssignments().setVisible(showFlag);
		
	}
	public JTextPane getTxtDir()
	{
		return txtDir;
	}
	public String getTxtDirContent()
	{
		return txtDir.getText();
	}
	public void setTxtDirContent(String text)
	{
		txtDir.setText(text);
	}
	public JPanel getPanelBlkTo()
	{
		return panelBlkTo;
	}
	public Color getPanelBlkToColor()
	{
		return panelBlkTo.getBackground();
	}
	public void setPanelBlkToColor(Color background)
	{
		panelBlkTo.setBackground(background);
	}
	public JPanel getPanelWhtTo()
	{
		return panelWhtTo;
	}
	public Color getPanelWhtToColor()
	{
		return panelWhtTo.getBackground();
	}
	public void setPanelWhtToColor(Color background_1)
	{
		panelWhtTo.setBackground(background_1);
	}
	public JPanel getPanelRedTo()
	{
		return panelRedTo;
	}
	public Color getPanelRedToColor()
	{
		return panelRedTo.getBackground();
	}
	public void setPanelRedToColor(Color background_2)
	{
		panelRedTo.setBackground(background_2);
	}
	public JPanel getPanelOrnTo()
	{
		return panelOrnTo;
	}
	public Color getPanelOrnToColor()
	{
		return panelOrnTo.getBackground();
	}
	public void setPanelOrnToColor(Color background_3)
	{
		panelOrnTo.setBackground(background_3);
	}
	public JPanel getPanelYelTo()
	{
		return panelYelTo;
	}
	public Color getPanelYelToColor()
	{
		return panelYelTo.getBackground();
	}
	public void setPanelYelToColor(Color background_4)
	{
		panelYelTo.setBackground(background_4);
	}
	public JPanel getPanelGrnTo()
	{
		return panelGrnTo;
	}
	public Color getPanelGrnToColor()
	{
		return panelGrnTo.getBackground();
	}
	public void setPanelGrnToColor(Color background_5)
	{
		panelGrnTo.setBackground(background_5);
	}
	public JPanel getPanelBluTo()
	{
		return panelBluTo;
	}
	public Color getPanelBluToColor()
	{
		return panelBluTo.getBackground();
	}
	public void setPanelBluToColor(Color background_6)
	{
		panelBluTo.setBackground(background_6);
	}
	public JPanel getPanelPurTo()
	{
		return panelPurTo;
	}
	public Color getPanelPurToColor()
	{
		return panelPurTo.getBackground();
	}
	public void setPanelPurToColor(Color background_7)
	{
		panelPurTo.setBackground(background_7);
	}

	public JFrame getFrmAssignments()
	{
		return frmAssignments;
	}
	@SuppressWarnings("hiding")
	public void setFrmAssignments(JFrame frmAssignments)
	{
		this.frmAssignments = frmAssignments;
	}
}
