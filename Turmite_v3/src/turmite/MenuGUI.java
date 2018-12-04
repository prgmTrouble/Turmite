package turmite;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MenuGUI extends JDialog {

	public static String dir;
	private JFrame frmOptions;
	private final JPanel panel = new JPanel();
	private final JCheckBox chckbxYeetRandom = new JCheckBox("yeet");
	private final Action action = new SwingAction();
	private JPanel panel_2;
	private JCheckBox chckbxRandomPos;
	private JCheckBox chckbxRandomDirectionAssignments;
	private JCheckBox chckbxRandomColorAssignments;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JPanel panel_3;
	private JFileChooser fileChooser;
	private JCheckBox chckbxYeetSave;
	private final Action action_1 = new SwingAction_1();
	private JCheckBox chckbxShowAssignments;
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	private final Action action_7 = new SwingAction_7();
	private final Action action_8 = new SwingAction_8();
	private JCheckBox chckbxDisableAssignmentRedundancy;

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
					MenuGUI window = new MenuGUI();
					window.frmOptions.setVisible(true);
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
	public MenuGUI()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmOptions = new JFrame();
		frmOptions.setResizable(false);
		frmOptions.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmOptions.setTitle("Options");
		frmOptions.setBounds(100, 100, 488, 446);
		frmOptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOptions.getContentPane().setLayout(null);
		panel.setToolTipText("");
		panel.setBounds(0, 0, 250, 184);
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 5), new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Enable Random", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel.setBackground(Color.LIGHT_GRAY);
		frmOptions.getContentPane().add(panel);
		panel.setLayout(null);
		chckbxYeetRandom.setToolTipText("Just press it.");
		chckbxYeetRandom.setAction(action);
		chckbxYeetRandom.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		chckbxYeetRandom.setBounds(106, 26, 50, 23);
		chckbxYeetRandom.setBackground(Color.LIGHT_GRAY);

		panel.add(chckbxYeetRandom);

		panel_2 = new JPanel();
		panel_2.setEnabled(false);
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 3), new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Random Options", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 56, 230, 118);
		panel.add(panel_2);
		panel_2.setLayout(null);

		chckbxRandomPos = new JCheckBox("Random Pos 0");
		chckbxRandomPos.setAction(action_5);
		chckbxRandomPos.setBounds(18, 16, 193, 23);
		chckbxRandomPos.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxRandomPos.setToolTipText("If not selected, the turmite will start at (0 , 0)");
		chckbxRandomPos.setBackground(Color.LIGHT_GRAY);
		chckbxRandomPos.setEnabled(false);
		panel_2.add(chckbxRandomPos);

		chckbxRandomColorAssignments = new JCheckBox("Random Color Assignments");
		chckbxRandomColorAssignments.setAction(action_6);
		chckbxRandomColorAssignments.setToolTipText("If not selected, the turmite will assign the default direction modifier to each color.");
		chckbxRandomColorAssignments.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxRandomColorAssignments.setEnabled(false);
		chckbxRandomColorAssignments.setBackground(Color.LIGHT_GRAY);
		chckbxRandomColorAssignments.setBounds(18, 39, 193, 23);
		panel_2.add(chckbxRandomColorAssignments);

		chckbxRandomDirectionAssignments = new JCheckBox("Random Direction Assignments");
		chckbxRandomDirectionAssignments.setAction(action_7);
		chckbxRandomDirectionAssignments.setToolTipText("If not selected, the turmite will change the pixel color to the default next color.");
		chckbxRandomDirectionAssignments.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxRandomDirectionAssignments.setEnabled(false);
		chckbxRandomDirectionAssignments.setBackground(Color.LIGHT_GRAY);
		chckbxRandomDirectionAssignments.setBounds(18, 63, 193, 23);
		panel_2.add(chckbxRandomDirectionAssignments);
		
		chckbxDisableAssignmentRedundancy = new JCheckBox("Disable Assignment Redundancy");
		chckbxDisableAssignmentRedundancy.setAction(action_8);
		chckbxDisableAssignmentRedundancy.setToolTipText("Makes sure short circuts cannot happen.");
		chckbxDisableAssignmentRedundancy.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxDisableAssignmentRedundancy.setEnabled(false);
		chckbxDisableAssignmentRedundancy.setBackground(Color.LIGHT_GRAY);
		chckbxDisableAssignmentRedundancy.setBounds(18, 88, 193, 23);
		panel_2.add(chckbxDisableAssignmentRedundancy);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(250, 0, 234, 84);
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 5), new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_1.setBackground(Color.LIGHT_GRAY);
		frmOptions.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		txtWidth = new JTextField();
		txtWidth.setToolTipText("Width of toroidal map. Default is 500px.");
		txtWidth.setName("width");
		txtWidth.setBounds(22, 41, 90, 20);
		txtWidth.setText("500");
		panel_1.add(txtWidth);
		txtWidth.setColumns(10);

		txtHeight = new JTextField();
		txtHeight.setToolTipText("Height of toroidal map. Default is 500px.");
		txtHeight.setName("height");
		txtHeight.setText("500");
		txtHeight.setColumns(10);
		txtHeight.setBounds(124, 41, 90, 20);
		panel_1.add(txtHeight);

		JLabel lblWidth = new JLabel("Width");
		lblWidth.setBounds(22, 24, 55, 16);
		panel_1.add(lblWidth);

		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(124, 24, 55, 16);
		panel_1.add(lblHeight);

		panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 4), new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Other", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(250, 79, 233, 105);
		frmOptions.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		chckbxYeetSave = new JCheckBox("yeetSave");
		chckbxYeetSave.setToolTipText("Yeets the generated image into your preferred directory.");
		chckbxYeetSave.setAction(action_1);
		chckbxYeetSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		chckbxYeetSave.setActionCommand("yeetSave");
		chckbxYeetSave.setBackground(Color.LIGHT_GRAY);
		chckbxYeetSave.setBounds(16, 32, 189, 23);
		panel_3.add(chckbxYeetSave);

		chckbxShowAssignments = new JCheckBox("Show Assignments");
		chckbxShowAssignments.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		chckbxShowAssignments.setAction(action_2);
		chckbxShowAssignments.setBackground(Color.LIGHT_GRAY);
		chckbxShowAssignments.setBounds(16, 58, 189, 23);
		panel_3.add(chckbxShowAssignments);

		fileChooser = new JFileChooser();
		fileChooser.setDialogType(1);
		fileChooser.setEnabled(false);
		fileChooser.setOpaque(true);
		fileChooser.setFileSelectionMode(1);
		fileChooser.setForeground(Color.LIGHT_GRAY);
		fileChooser.setBackground(Color.LIGHT_GRAY);
		fileChooser.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 3), new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Save Image", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		fileChooser.setControlButtonsAreShown(false);
		fileChooser.setDialogTitle("Save Image");
		fileChooser.setName("Save");
		fileChooser.setBounds(2, 184, 480, 195);
		fileChooser.setCurrentDirectory(new File("C://Users/cole_/Documents/"));
		frmOptions.getContentPane().add(fileChooser);

		JButton btnClose = new JButton("Close");
		btnClose.setAction(action_4);
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(383, 390, 91, 23);
		frmOptions.getContentPane().add(btnClose);

		JButton btnStart = new JButton("Start");
		btnStart.setBackground(Color.WHITE);
		btnStart.setAction(action_3);
		btnStart.setBounds(282, 390, 91, 23);
		frmOptions.getContentPane().add(btnStart);
	}
	private class SwingAction extends AbstractAction
	{
		public SwingAction()
		{
			putValue(NAME, "yeet");
			putValue(SHORT_DESCRIPTION, "Just press it.");
		}
		public void actionPerformed(ActionEvent e)
		{
			setPanel_2Enabled(getChckbxYeetSelected());
			setChckbxRandomColorAssignmentsEnabled(getChckbxYeetSelected());
			setChckbxRandomDirectionAssignmentsEnabled(getChckbxYeetSelected());
			setChckbxRandomPosEnabled(getChckbxYeetSelected());
			setChckbxDisableAssignmentRedundancyEnabled(getChckbxYeetSelected());
		}
	}
	public boolean getPanel_2Enabled()
	{
		return panel_2.isEnabled();
	}
	public void setPanel_2Enabled(boolean enabled)
	{
		panel_2.setEnabled(enabled);
	}
	public boolean getChckbxYeetSelected()
	{
		return chckbxYeetRandom.isSelected();
	}
	public void setChckbxYeetSelected(boolean selected)
	{
		chckbxYeetRandom.setSelected(selected);
	}
	public boolean getChckbxRandomPosEnabled()
	{
		return chckbxRandomPos.isEnabled();
	}
	public void setChckbxRandomPosEnabled(boolean enabled_1)
	{
		chckbxRandomPos.setEnabled(enabled_1);
	}
	public boolean getChckbxRandomDirectionAssignmentsSelected()
	{
		return chckbxRandomDirectionAssignments.isSelected();
	}
	public void setChckbxRandomDirectionAssignmentsSelected(boolean selected_1)
	{
		chckbxRandomDirectionAssignments.setSelected(selected_1);
	}
	public boolean getChckbxRandomColorAssignmentsSelected()
	{
		return chckbxRandomColorAssignments.isSelected();
	}
	public void setChckbxRandomColorAssignmentsSelected(boolean selected_2)
	{
		chckbxRandomColorAssignments.setSelected(selected_2);
	}
	public boolean getChckbxRandomPosSelected()
	{
		return chckbxRandomPos.isSelected();
	}
	public void setChckbxRandomPosSelected(boolean selected_3)
	{
		chckbxRandomPos.setSelected(selected_3);
	}
	public boolean getChckbxRandomColorAssignmentsEnabled()
	{
		return chckbxRandomColorAssignments.isEnabled();
	}
	public void setChckbxRandomColorAssignmentsEnabled(boolean enabled_2)
	{
		chckbxRandomColorAssignments.setEnabled(enabled_2);
	}
	public boolean getChckbxRandomDirectionAssignmentsEnabled()
	{
		return chckbxRandomDirectionAssignments.isEnabled();
	}
	public void setChckbxRandomDirectionAssignmentsEnabled(boolean enabled_3)
	{
		chckbxRandomDirectionAssignments.setEnabled(enabled_3);
	}
	public boolean getChckbxYeetSaveSelected()
	{
		mainFrame.saveFlag = chckbxYeetSave.isSelected();
		return chckbxYeetSave.isSelected();
	}
	public void setChckbxYeetSaveSelected(boolean selected_4)
	{
		chckbxYeetSave.setSelected(selected_4);
	}
	private class SwingAction_1 extends AbstractAction
	{
		public SwingAction_1()
		{
			putValue(NAME, "Save Image");
			putValue(SHORT_DESCRIPTION, "Yeets the generated image into your preferred directory.");
		}
		public void actionPerformed(ActionEvent e)
		{
			setFileChooserEnabled(getChckbxYeetSaveSelected());
		}
	}
	private class SwingAction_2 extends AbstractAction
	{
		public SwingAction_2()
		{
			putValue(NAME, "Show Assignments");
			putValue(SHORT_DESCRIPTION, "Shows the assignment details for colors and directions.");
		}
		public void actionPerformed(ActionEvent e)
		{
			Assignments.showFlag = chckbxShowAssignments.isSelected();
		}
	}
	private class SwingAction_3 extends AbstractAction
	{
		public SwingAction_3()
		{
			putValue(NAME, "Start");
			putValue(SHORT_DESCRIPTION, "Yeet the application.");
		}
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				mainFrame.height = Integer.parseUnsignedInt(txtHeight.getText()) + 20;
				mainFrame.width  = Integer.parseUnsignedInt(txtWidth .getText())     ;
			}catch (NumberFormatException e1)
			{
				mainFrame.height = 520;
				mainFrame.width  = 500;
			}
			if (mainFrame.saveFlag)
				dir = fileChooser.getSelectedFile().toString();
			new mainFrame();
			frmOptions.setVisible(false);
			new Assignments();
			System.out.println(mainFrame.dA[0] + " , " + mainFrame.dA[1] + " , " + mainFrame.dA[2] + " , " + mainFrame.dA[3] + " , " + mainFrame.dA[4] + " , " + mainFrame.dA[5] + " , " + mainFrame.dA[6] + " , " + mainFrame.dA[7] + " | " + mainFrame.cAf[0] + " , " + mainFrame.cAf[1] + " , " + mainFrame.cAf[2] + " , " + mainFrame.cAf[3] + " , " + mainFrame.cAf[4] + " , " + mainFrame.cAf[5] + " , " + mainFrame.cAf[6] + " , " + mainFrame.cAf[7] + " | " + mainFrame.rdFlag + " , " + mainFrame.rcFlag);
		}
	}
	private class SwingAction_4 extends AbstractAction
	{
		public SwingAction_4()
		{
			putValue(NAME, "Close");
			putValue(SHORT_DESCRIPTION, "Yoink the application.");
		}
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	public boolean getFileChooserEnabled()
	{
		return fileChooser.isEnabled();
	}
	public void setFileChooserEnabled(boolean enabled_4)
	{
		fileChooser.setEnabled(enabled_4);
	}

	private class SwingAction_5 extends AbstractAction
	{
		public SwingAction_5()
		{
			putValue(NAME, "Random Pos 0");
			putValue(SHORT_DESCRIPTION, "If not selected, the turmite will start at (0 , 0)");
		}
		public void actionPerformed(ActionEvent e)
		{
			mainFrame.rpFlag = getChckbxRandomPosSelected() && getChckbxYeetSelected();
		}
	}
	private class SwingAction_6 extends AbstractAction
	{
		public SwingAction_6()
		{
			putValue(NAME, "Random Color Assignments");
			putValue(SHORT_DESCRIPTION, "If not selected, the turmite will assign the default direction modifier to each color.");
		}
		public void actionPerformed(ActionEvent e)
		{
			mainFrame.rcFlag = getChckbxRandomColorAssignmentsSelected() && getChckbxYeetSelected();
			if (!getChckbxRandomColorAssignmentsSelected() && getChckbxDisableAssignmentRedundancySelected())
			{
				setChckbxDisableAssignmentRedundancySelected(false);
				mainFrame.scDisableFlag = false;
			}
		}
	}
	private class SwingAction_7 extends AbstractAction
	{
		public SwingAction_7()
		{
			putValue(NAME, "Random Direction Assignments");
			putValue(SHORT_DESCRIPTION, "If not selected, the turmite will change the pixel color to the default next color.");
		}
		public void actionPerformed(ActionEvent e)
		{
			mainFrame.rdFlag = getChckbxRandomDirectionAssignmentsSelected() && getChckbxYeetSelected();
		}
	}
	private class SwingAction_8 extends AbstractAction
	{
		public SwingAction_8()
		{
			putValue(NAME, "Disable Assignment Redundancy");
			putValue(SHORT_DESCRIPTION, "Makes sure short circuts cannot happen.");
		}
		public void actionPerformed(ActionEvent e)
		{
			mainFrame.scDisableFlag = getChckbxDisableAssignmentRedundancySelected() && getChckbxYeetSelected();
			if (!getChckbxRandomColorAssignmentsSelected() && getChckbxDisableAssignmentRedundancySelected())
			{
				setChckbxRandomColorAssignmentsSelected(true);
				mainFrame.rcFlag = true;
			}
		}
	}
	public boolean getChckbxDisableAssignmentRedundancyEnabled()
	{
		return chckbxDisableAssignmentRedundancy.isEnabled();
	}
	public void setChckbxDisableAssignmentRedundancyEnabled(boolean enabled_5)
	{
		chckbxDisableAssignmentRedundancy.setEnabled(enabled_5);
	}
	public boolean getChckbxDisableAssignmentRedundancySelected()
	{
		return chckbxDisableAssignmentRedundancy.isSelected();
	}
	public void setChckbxDisableAssignmentRedundancySelected(boolean selected_5)
	{
		chckbxDisableAssignmentRedundancy.setSelected(selected_5);
	}
}
