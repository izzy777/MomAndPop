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

public class sides extends JPanel {

	/**
	 * Create the panel.
	 */
	public sides() {
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		JLabel lblBreadstick = new JLabel("BreadStick");
		lblBreadstick.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreadstick.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBreadstick.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lblBreadstick.setAlignmentY(0.0f);
		lblBreadstick.setBounds(374, 118, 362, 107);
		add(lblBreadstick);
		
		JLabel lblBreadstickBites = new JLabel("BreadStick Bites");
		lblBreadstickBites.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreadstickBites.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBreadstickBites.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lblBreadstickBites.setAlignmentY(0.0f);
		lblBreadstickBites.setBounds(374, 274, 362, 107);
		add(lblBreadstickBites);
		
		JLabel lblBigChocolateCookie = new JLabel("Big Chocolate Cookie");
		lblBigChocolateCookie.setHorizontalAlignment(SwingConstants.CENTER);
		lblBigChocolateCookie.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBigChocolateCookie.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lblBigChocolateCookie.setAlignmentY(0.0f);
		lblBigChocolateCookie.setBounds(374, 451, 362, 107);
		add(lblBigChocolateCookie);
		
		JCheckBox cbBS = new JCheckBox("");
		cbBS.setFocusable(false);
		cbBS.setContentAreaFilled(false);
		cbBS.setBounds(331, 131, 37, 81);
		add(cbBS);
		
		JCheckBox cbBSB = new JCheckBox("");
		cbBSB.setFocusable(false);
		cbBSB.setContentAreaFilled(false);
		cbBSB.setBounds(331, 288, 37, 81);
		add(cbBSB);
		
		JCheckBox cbBCC = new JCheckBox("");
		cbBCC.setFocusable(false);
		cbBCC.setContentAreaFilled(false);
		cbBCC.setBounds(331, 458, 37, 81);
		add(cbBCC);
		
		JComboBox cbB = new JComboBox();
		cbB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbB.setBounds(784, 145, 50, 41);
		add(cbB);
		
		JComboBox cbBSb = new JComboBox();
		cbBSb.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbBSb.setBounds(784, 301, 50, 41);
		add(cbBSb);
		
		JComboBox cbBC = new JComboBox();
		cbBC.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbBC.setBounds(784, 482, 50, 41);
		add(cbBC);
		setVisible(false);
	}
}
