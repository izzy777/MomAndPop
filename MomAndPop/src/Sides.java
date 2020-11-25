import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Sides extends JPanel {
	
	public JCheckBox cbBS;
	public JCheckBox cbBSB;
	public JCheckBox cbBCC;
	JComboBox cbB;
	JComboBox cbBSb;
	JComboBox cbBC;
	/**
	 * Create the panel.
	 */
	public Sides() {
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		cbBS = new JCheckBox("");
		cbBS.setFocusable(false);
		cbBS.setContentAreaFilled(false);
		cbBS.setBounds(331, 131, 37, 81);
		add(cbBS);
	
		cbBSB = new JCheckBox("");
		cbBSB.setFocusable(false);
		cbBSB.setContentAreaFilled(false);
		cbBSB.setBounds(331, 288, 37, 81);
		add(cbBSB);
	
		cbBCC = new JCheckBox("");
		cbBCC.setFocusable(false);
		cbBCC.setContentAreaFilled(false);
		cbBCC.setBounds(331, 458, 37, 81);
		add(cbBCC);
		
		cbB = new JComboBox();
		cbB.setMaximumRowCount(9);
		cbB.setFocusable(false);
		cbB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbB.setBounds(784, 145, 50, 41);
		add(cbB);
		
		cbBSb = new JComboBox();
		cbBSb.setMaximumRowCount(9);
		cbBSb.setFocusable(false);
		cbBSb.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbBSb.setBounds(784, 301, 50, 41);
		add(cbBSb);
		
		cbBC = new JComboBox();
		cbBC.setMaximumRowCount(9);
		cbBC.setFocusable(false);
		cbBC.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbBC.setBounds(784, 482, 50, 41);
		add(cbBC);
		
		JLabel iconBSB = new JLabel("");
		iconBSB.setIcon(new ImageIcon(Sides.class.getResource("/imgs/BreadstickBites.jpg")));
		iconBSB.setBounds(387, 291, 77, 78);
		add(iconBSB);
		
		JLabel iconC = new JLabel("");
		iconC.setHorizontalAlignment(SwingConstants.CENTER);
		iconC.setIcon(new ImageIcon(Sides.class.getResource("/imgs/cookie.jpg")));
		iconC.setBounds(387, 466, 71, 78);
		add(iconC);
		
		JLabel iconBS = new JLabel("");
		iconBS.setHorizontalAlignment(SwingConstants.CENTER);
		iconBS.setIcon(new ImageIcon(Sides.class.getResource("/imgs/breadsticks.jpg")));
		iconBS.setBounds(387, 131, 77, 83);
		add(iconBS);
		
		JLabel lblBreadstickBites = new JLabel("    BreadStick Bites $2");
		lblBreadstickBites.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreadstickBites.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBreadstickBites.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblBreadstickBites.setAlignmentY(0.0f);
		lblBreadstickBites.setBounds(374, 274, 362, 107);
		add(lblBreadstickBites);
		
		JLabel lblBigChocolateCookie = new JLabel("    Big Chocolate Cookie $4");
		lblBigChocolateCookie.setHorizontalAlignment(SwingConstants.CENTER);
		lblBigChocolateCookie.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBigChocolateCookie.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblBigChocolateCookie.setAlignmentY(0.0f);
		lblBigChocolateCookie.setBounds(374, 451, 362, 107);
		add(lblBigChocolateCookie);
		
		JLabel lblBreadstick = new JLabel("BreadStick $4");
		lblBreadstick.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreadstick.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBreadstick.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblBreadstick.setAlignmentY(0.0f);
		lblBreadstick.setBounds(374, 119, 362, 107);
		add(lblBreadstick);
		setVisible(false);
			
	}
	public void clearAll() {
		cbBS.setSelected(false);
		cbBSB.setSelected(false);
		cbBCC.setSelected(false);
		cbB.setSelectedIndex(0);
		cbBSb.setSelectedIndex(0);
		cbBC.setSelectedIndex(0);
	}
}
