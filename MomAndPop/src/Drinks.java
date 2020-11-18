import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class Drinks extends JPanel {
	private final ButtonGroup pepsi = new ButtonGroup();
	private final ButtonGroup dietPepsi = new ButtonGroup();
	private final ButtonGroup sunkist = new ButtonGroup();
	private final ButtonGroup dietSunkist = new ButtonGroup();
	private final ButtonGroup AW = new ButtonGroup();
	private final ButtonGroup dietAW = new ButtonGroup();
	private final ButtonGroup sierraMist = new ButtonGroup();
	private final ButtonGroup lemonade = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public Drinks() {
		setFocusable(false);
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		JLabel lblS7 = new JLabel("S");
		lblS7.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS7.setBounds(726, 590, 14, 26);
		add(lblS7);
		
		JLabel lblL7 = new JLabel("L");
		lblL7.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL7.setBounds(774, 587, 26, 32);
		add(lblL7);
		
		JRadioButton rbLS = new JRadioButton("");
		lemonade.add(rbLS);
		rbLS.setBounds(722, 565, 21, 21);
		add(rbLS);
		
		JLabel lblM7 = new JLabel("M");
		lblM7.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM7.setBounds(748, 589, 19, 31);
		add(lblM7);
		
		JRadioButton rbLL = new JRadioButton("");
		lemonade.add(rbLL);
		rbLL.setBounds(768, 565, 21, 21);
		add(rbLL);
		
		JRadioButton rbLM = new JRadioButton("");
		lemonade.add(rbLM);
		rbLM.setBounds(745, 565, 21, 21);
		add(rbLM);
		
		JLabel lblM6 = new JLabel("M");
		lblM6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM6.setBounds(748, 452, 19, 31);
		add(lblM6);
		
		JRadioButton rbSMS = new JRadioButton("");
		sierraMist.add(rbSMS);
		rbSMS.setBounds(722, 428, 21, 21);
		add(rbSMS);
		
		JLabel lblL6 = new JLabel("L");
		lblL6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL6.setBounds(774, 450, 26, 32);
		add(lblL6);
		
		JLabel lblS6 = new JLabel("S");
		lblS6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS6.setBounds(726, 453, 14, 26);
		add(lblS6);
		
		JRadioButton rbSML = new JRadioButton("");
		sierraMist.add(rbSML);
		rbSML.setBounds(768, 428, 21, 21);
		add(rbSML);
		
		JRadioButton rbSMM = new JRadioButton("");
		sierraMist.add(rbSMM);
		rbSMM.setBounds(745, 428, 21, 21);
		add(rbSMM);
		
		JRadioButton rbDAWM = new JRadioButton("");
		dietAW.add(rbDAWM);
		rbDAWM.setBounds(745, 284, 21, 21);
		add(rbDAWM);
		
		JLabel lblS5 = new JLabel("S");
		lblS5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS5.setBounds(726, 305, 14, 26);
		add(lblS5);
		
		JRadioButton rbDAWL = new JRadioButton("");
		dietAW.add(rbDAWL);
		rbDAWL.setBounds(768, 284, 21, 21);
		add(rbDAWL);
		
		JLabel lblL5 = new JLabel("L");
		lblL5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL5.setBounds(774, 302, 26, 32);
		add(lblL5);
		
		JLabel lblM5 = new JLabel("M");
		lblM5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM5.setBounds(748, 304, 19, 31);
		add(lblM5);
		
		JRadioButton rbDAWS = new JRadioButton("");
		dietAW.add(rbDAWS);
		rbDAWS.setBounds(722, 284, 21, 21);
		add(rbDAWS);
		
		JRadioButton rbAWM = new JRadioButton("");
		AW.add(rbAWM);
		rbAWM.setBounds(745, 141, 21, 21);
		add(rbAWM);
		
		JRadioButton rbAWL = new JRadioButton("");
		AW.add(rbAWL);
		rbAWL.setBounds(768, 141, 21, 21);
		add(rbAWL);
		
		JLabel lblL4 = new JLabel("L");
		lblL4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL4.setBounds(774, 163, 26, 32);
		add(lblL4);
		
		JLabel lblS4 = new JLabel("S");
		lblS4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS4.setBounds(726, 166, 14, 26);
		add(lblS4);
		
		JLabel lblM4 = new JLabel("M");
		lblM4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM4.setBounds(748, 165, 19, 31);
		add(lblM4);
		
		JRadioButton rbAWS = new JRadioButton("");
		AW.add(rbAWS);
		rbAWS.setBounds(719, 141, 21, 21);
		add(rbAWS);
		
		JRadioButton rbDSL = new JRadioButton("");
		dietSunkist.add(rbDSL);
		rbDSL.setBounds(267, 569, 21, 21);
		add(rbDSL);
		
		JLabel lblM3 = new JLabel("M");
		lblM3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM3.setBounds(247, 593, 19, 31);
		add(lblM3);
		
		JLabel lblL3 = new JLabel("L");
		lblL3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL3.setBounds(273, 591, 26, 32);
		add(lblL3);
		
		JRadioButton rbDSS = new JRadioButton("");
		dietSunkist.add(rbDSS);
		rbDSS.setBounds(221, 569, 21, 21);
		add(rbDSS);
		
		JRadioButton rbDSM = new JRadioButton("");
		dietSunkist.add(rbDSM);
		rbDSM.setBounds(244, 569, 21, 21);
		add(rbDSM);
		
		JLabel lblS3 = new JLabel("S");
		lblS3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS3.setBounds(225, 594, 14, 26);
		add(lblS3);
		
		JLabel lblM2 = new JLabel("M");
		lblM2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM2.setBounds(247, 456, 19, 31);
		add(lblM2);
		
		JRadioButton rbSM = new JRadioButton("");
		sunkist.add(rbSM);
		rbSM.setBounds(244, 432, 21, 21);
		add(rbSM);
		
		JRadioButton rbSS = new JRadioButton("");
		sunkist.add(rbSS);
		rbSS.setBounds(221, 432, 21, 21);
		add(rbSS);
		
		JLabel lblS2 = new JLabel("S");
		lblS2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS2.setBounds(225, 457, 14, 26);
		add(lblS2);
		
		JLabel lblL2 = new JLabel("L");
		lblL2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL2.setBounds(273, 454, 26, 32);
		add(lblL2);
		
		JRadioButton rbSL = new JRadioButton("");
		sunkist.add(rbSL);
		rbSL.setBounds(267, 432, 21, 21);
		add(rbSL);
		
		JLabel lblS1 = new JLabel("S");
		lblS1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS1.setBounds(225, 309, 14, 26);
		add(lblS1);
		
		JRadioButton rbDPL = new JRadioButton("");
		dietPepsi.add(rbDPL);
		rbDPL.setBounds(267, 284, 21, 21);
		add(rbDPL);
		
		JLabel lblM1 = new JLabel("M");
		lblM1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM1.setBounds(247, 308, 19, 31);
		add(lblM1);
		
		JRadioButton rbDPS = new JRadioButton("");
		dietPepsi.add(rbDPS);
		rbDPS.setBounds(221, 284, 21, 21);
		add(rbDPS);
		
		JLabel lblL1 = new JLabel("L");
		lblL1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL1.setBounds(273, 306, 26, 32);
		add(lblL1);
		
		JRadioButton rbDPM = new JRadioButton("");
		dietPepsi.add(rbDPM);
		rbDPM.setBounds(244, 284, 21, 21);
		add(rbDPM);
		
		JRadioButton rbPM = new JRadioButton("");
		pepsi.add(rbPM);
		rbPM.setBounds(245, 141, 21, 21);
		add(rbPM);
		
		JRadioButton rbPS = new JRadioButton("");
		pepsi.add(rbPS);
		rbPS.setBounds(221, 141, 21, 21);
		add(rbPS);
		
		JRadioButton rbPL = new JRadioButton("");
		pepsi.add(rbPL);
		rbPL.setBounds(268, 141, 21, 21);
		add(rbPL);
		
		JLabel lblS = new JLabel("S");
		lblS.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS.setBounds(226, 166, 14, 26);
		add(lblS);
		
		JLabel lblM = new JLabel("M");
		lblM.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM.setBounds(248, 165, 19, 31);
		add(lblM);
		
		JLabel lblL = new JLabel("L");
		lblL.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL.setBounds(274, 163, 26, 32);
		add(lblL);
		
		JLabel text = new JLabel("ALL DRINK SIZES $1");
		text.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		text.setBounds(43, 32, 256, 26);
		add(text);
		
		JLabel lblQ = new JLabel("Quantity");
		lblQ.setForeground(Color.DARK_GRAY);
		lblQ.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 16));
		lblQ.setBounds(473, 63, 64, 26);
		add(lblQ);
		
		JLabel lblQ1 = new JLabel("Quantity");
		lblQ1.setForeground(Color.DARK_GRAY);
		lblQ1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 16));
		lblQ1.setBounds(985, 63, 64, 26);
		add(lblQ1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb1.setMaximumRowCount(9);
		cb1.setFocusable(false);
		cb1.setBounds(466, 131, 40, 31);
		add(cb1);
		
		JButton btnP = new JButton("");
		btnP.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnP.setForeground(Color.WHITE);
		btnP.setFocusable(false);
		btnP.setBounds(new Rectangle(100, 0, 0, 0));
		btnP.setBorderPainted(false);
		btnP.setBackground(Color.RED);
		btnP.setBounds(505, 131, 40, 31);
		add(btnP);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb2.setMaximumRowCount(9);
		cb2.setFocusable(false);
		cb2.setBounds(466, 274, 40, 31);
		add(cb2);
		
		JButton btnDP = new JButton("");
		btnDP.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnDP.setForeground(Color.WHITE);
		btnDP.setFocusable(false);
		btnDP.setBounds(new Rectangle(100, 0, 0, 0));
		btnDP.setBorderPainted(false);
		btnDP.setBackground(Color.RED);
		btnDP.setBounds(505, 274, 40, 31);
		add(btnDP);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb3.setMaximumRowCount(9);
		cb3.setFocusable(false);
		cb3.setBounds(466, 422, 40, 31);
		add(cb3);
		
		JButton btnS = new JButton("");
		btnS.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnS.setForeground(Color.WHITE);
		btnS.setFocusable(false);
		btnS.setBounds(new Rectangle(100, 0, 0, 0));
		btnS.setBorderPainted(false);
		btnS.setBackground(Color.RED);
		btnS.setBounds(505, 422, 40, 31);
		add(btnS);
		
		JComboBox cb4 = new JComboBox();
		cb4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb4.setMaximumRowCount(9);
		cb4.setFocusable(false);
		cb4.setBounds(466, 559, 40, 31);
		add(cb4);
		
		JButton btnDS = new JButton("");
		btnDS.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnDS.setForeground(Color.WHITE);
		btnDS.setFocusable(false);
		btnDS.setBounds(new Rectangle(100, 0, 0, 0));
		btnDS.setBorderPainted(false);
		btnDS.setBackground(Color.RED);
		btnDS.setBounds(505, 559, 40, 31);
		add(btnDS);
		
		JComboBox cb5 = new JComboBox();
		cb5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb5.setMaximumRowCount(9);
		cb5.setFocusable(false);
		cb5.setBounds(980, 131, 40, 31);
		add(cb5);
		
		JButton btnAW = new JButton("");
		btnAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAW.setForeground(Color.WHITE);
		btnAW.setFocusable(false);
		btnAW.setBounds(new Rectangle(100, 0, 0, 0));
		btnAW.setBorderPainted(false);
		btnAW.setBackground(Color.RED);
		btnAW.setBounds(1019, 131, 40, 31);
		add(btnAW);
		
		JComboBox cb6 = new JComboBox();
		cb6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb6.setMaximumRowCount(9);
		cb6.setFocusable(false);
		cb6.setBounds(980, 274, 40, 31);
		add(cb6);
		
		JButton btnDAW = new JButton("");
		btnDAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnDAW.setForeground(Color.WHITE);
		btnDAW.setFocusable(false);
		btnDAW.setBounds(new Rectangle(100, 0, 0, 0));
		btnDAW.setBorderPainted(false);
		btnDAW.setBackground(Color.RED);
		btnDAW.setBounds(1019, 274, 40, 31);
		add(btnDAW);
		
		JComboBox cb7 = new JComboBox();
		cb7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb7.setMaximumRowCount(9);
		cb7.setFocusable(false);
		cb7.setBounds(980, 422, 40, 31);
		add(cb7);
		
		JButton btnSM = new JButton("");
		btnSM.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnSM.setForeground(Color.WHITE);
		btnSM.setFocusable(false);
		btnSM.setBounds(new Rectangle(100, 0, 0, 0));
		btnSM.setBorderPainted(false);
		btnSM.setBackground(Color.RED);
		btnSM.setBounds(1019, 422, 40, 31);
		add(btnSM);
		
		JComboBox cb8 = new JComboBox();
		cb8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb8.setMaximumRowCount(9);
		cb8.setFocusable(false);
		cb8.setBounds(980, 559, 40, 31);
		add(cb8);
		
		JButton btnL = new JButton("");
		btnL.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnL.setForeground(Color.WHITE);
		btnL.setFocusable(false);
		btnL.setBounds(new Rectangle(100, 0, 0, 0));
		btnL.setBorderPainted(false);
		btnL.setBackground(Color.RED);
		btnL.setBounds(1019, 559, 40, 31);
		add(btnL);
		
		JLabel lbDAW = new JLabel("Diet A&W");
		lbDAW.setVerticalAlignment(SwingConstants.TOP);
		lbDAW.setHorizontalAlignment(SwingConstants.CENTER);
		lbDAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbDAW.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbDAW.setAlignmentY(0.0f);
		lbDAW.setBounds(574, 242, 362, 107);
		add(lbDAW);
		
		JLabel lbSK = new JLabel("Sunkist");
		lbSK.setVerticalAlignment(SwingConstants.TOP);
		lbSK.setHorizontalAlignment(SwingConstants.CENTER);
		lbSK.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbSK.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbSK.setAlignmentY(0.0f);
		lbSK.setBounds(74, 388, 362, 107);
		add(lbSK);
		
		JLabel lbDSK = new JLabel("Diet Sunkist");
		lbDSK.setVerticalAlignment(SwingConstants.TOP);
		lbDSK.setHorizontalAlignment(SwingConstants.CENTER);
		lbDSK.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbDSK.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbDSK.setAlignmentY(0.0f);
		lbDSK.setBounds(74, 526, 362, 107);
		add(lbDSK);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ryeon\\eclipse-workspace\\MomAndPop\\MomAndPop\\src\\imgs\\pepsi.jpg"));
		lblNewLabel.setBounds(94, 102, 71, 78);
		add(lblNewLabel);
		
		JLabel lbPepsi = new JLabel("Pepsi");
		lbPepsi.setVerticalAlignment(SwingConstants.TOP);
		lbPepsi.setHorizontalTextPosition(SwingConstants.CENTER);
		lbPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lbPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbPepsi.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbPepsi.setAlignmentY(0.0f);
		lbPepsi.setBounds(74, 88, 362, 107);
		add(lbPepsi);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/A&W.png")));
		lblNewLabel_1.setBounds(594, 104, 71, 78);
		add(lblNewLabel_1);
		
		JLabel lbAW = new JLabel("A&W");
		lbAW.setVerticalAlignment(SwingConstants.TOP);
		lbAW.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW.setAlignmentY(0.0f);
		lbAW.setBounds(574, 95, 362, 107);
		add(lbAW);
		
		JLabel lbDP = new JLabel("Diet Pepsi");
		lbDP.setVerticalAlignment(SwingConstants.TOP);
		lbDP.setHorizontalTextPosition(SwingConstants.LEFT);
		lbDP.setHorizontalAlignment(SwingConstants.CENTER);
		lbDP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbDP.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbDP.setAlignmentY(4.0f);
		lbDP.setBounds(74, 242, 362, 107);
		add(lbDP);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/Diet-pepsi.jpg")));
		lblNewLabel_2.setBounds(94, 253, 71, 78);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/diet-A&W.jpg")));
		lblNewLabel_3.setBounds(594, 258, 71, 78);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/sunkist.jpg")));
		lblNewLabel_3_1.setBounds(94, 405, 71, 78);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/diet-sunkist.jpeg")));
		lblNewLabel_3_2.setBounds(94, 542, 71, 78);
		add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBounds(608, 542, 71, 78);
		add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/Sierra-mist.jpg")));
		lblNewLabel_3_4.setBounds(594, 405, 71, 78);
		add(lblNewLabel_3_4);
		
		JLabel lbLMN = new JLabel("Lemonade");
		lbLMN.setVerticalAlignment(SwingConstants.TOP);
		lbLMN.setHorizontalAlignment(SwingConstants.CENTER);
		lbLMN.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbLMN.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbLMN.setAlignmentY(0.0f);
		lbLMN.setBounds(574, 526, 362, 107);
		add(lbLMN);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/lemonade.jpg")));
		lblNewLabel_3_5.setBounds(608, 542, 71, 78);
		add(lblNewLabel_3_5);
		
		JLabel lbSM = new JLabel("Sierra Mist");
		lbSM.setVerticalAlignment(SwingConstants.TOP);
		lbSM.setHorizontalAlignment(SwingConstants.CENTER);
		lbSM.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbSM.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbSM.setAlignmentY(0.0f);
		lbSM.setBounds(574, 388, 362, 107);
		add(lbSM);
		setVisible(false);

	}

}
