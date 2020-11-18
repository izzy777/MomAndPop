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

	/**
	 * Create the panel.
	 */
	public Sides() {
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
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
		cbB.setFocusable(false);
		cbB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbB.setBounds(784, 145, 50, 41);
		add(cbB);
		
		JComboBox cbBSb = new JComboBox();
		cbBSb.setFocusable(false);
		cbBSb.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbBSb.setBounds(784, 301, 50, 41);
		add(cbBSb);
		
		JComboBox cbBC = new JComboBox();
		cbBC.setFocusable(false);
		cbBC.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbBC.setBounds(784, 482, 50, 41);
		add(cbBC);
		
		JLabel lblBreadstickBites = new JLabel("BreadStick Bites");
		lblBreadstickBites.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreadstickBites.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBreadstickBites.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lblBreadstickBites.setAlignmentY(0.0f);
		lblBreadstickBites.setBounds(374, 274, 362, 107);
		add(lblBreadstickBites);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sides.class.getResource("/imgs/cookie.jpg")));
		lblNewLabel_3.setBounds(387, 470, 71, 78);
		add(lblNewLabel_3);
		
		JLabel lblBigChocolateCookie = new JLabel("Big Chocolate Cookie");
		lblBigChocolateCookie.setHorizontalAlignment(SwingConstants.CENTER);
		lblBigChocolateCookie.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBigChocolateCookie.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lblBigChocolateCookie.setAlignmentY(0.0f);
		lblBigChocolateCookie.setBounds(374, 451, 362, 107);
		add(lblBigChocolateCookie);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Sides.class.getResource("/imgs/BreadstickBites.jpg")));
		lblNewLabel_3_1.setBounds(387, 291, 86, 78);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(Sides.class.getResource("/imgs/breadsticks.jpg")));
		lblNewLabel_3_2.setBounds(402, 143, 71, 69);
		add(lblNewLabel_3_2);
		
		JLabel lblBreadstick = new JLabel("BreadStick");
		lblBreadstick.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreadstick.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBreadstick.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lblBreadstick.setAlignmentY(0.0f);
		lblBreadstick.setBounds(374, 119, 362, 107);
		add(lblBreadstick);
		setVisible(false);
			
	}
}
