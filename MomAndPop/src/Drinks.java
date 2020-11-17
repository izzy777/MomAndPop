import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Component;

public class Drinks extends JPanel {

	/**
	 * Create the panel.
	 */
	public Drinks() {
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		JLabel lbPepsi = new JLabel("Pepsi");
		lbPepsi.setVerticalAlignment(SwingConstants.TOP);
		lbPepsi.setVerticalTextPosition(SwingConstants.NORTH_EAST);
		lbPepsi.setHorizontalTextPosition(SwingConstants.NORTH_EAST);
		lbPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lbPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbPepsi.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbPepsi.setAlignmentY(Component.TOP_ALIGNMENT);
		
		lbPepsi.setBounds(68, 108, 362, 107);
		add(lbPepsi);
		
		JLabel lbAW = new JLabel("A&W");
		lbAW.setVerticalAlignment(SwingConstants.TOP);
		lbAW.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW.setAlignmentY(0.0f);
		lbAW.setBounds(567, 108, 362, 107);
		add(lbAW);
		
		JLabel lbDAW = new JLabel("Diet A&W");
		lbDAW.setVerticalAlignment(SwingConstants.TOP);
		lbDAW.setHorizontalAlignment(SwingConstants.CENTER);
		lbDAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbDAW.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbDAW.setAlignmentY(0.0f);
		lbDAW.setBounds(567, 255, 362, 107);
		add(lbDAW);
		
		JLabel lbDP = new JLabel("Diet Pepsi");
		lbDP.setVerticalAlignment(SwingConstants.TOP);
		lbDP.setHorizontalAlignment(SwingConstants.CENTER);
		lbDP.setHorizontalTextPosition(SwingConstants.LEFT);
		lbDP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbDP.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbDP.setAlignmentY(4f);
		lbDP.setBounds(68, 255, 362, 107);
		add(lbDP);
		
		JLabel lbSK = new JLabel("Sunkist");
		lbSK.setVerticalAlignment(SwingConstants.TOP);
		lbSK.setHorizontalAlignment(SwingConstants.CENTER);
		lbSK.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbSK.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbSK.setAlignmentY(0.0f);
		lbSK.setBounds(68, 401, 362, 107);
		add(lbSK);
		
		JLabel lbSM = new JLabel("Sierra Mist");
		lbSM.setVerticalAlignment(SwingConstants.TOP);
		lbSM.setHorizontalAlignment(SwingConstants.CENTER);
		lbSM.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbSM.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbSM.setAlignmentY(0.0f);
		lbSM.setBounds(567, 401, 362, 107);
		add(lbSM);
		
		JLabel lbDSK = new JLabel("Diet Sunkist");
		lbDSK.setVerticalAlignment(SwingConstants.TOP);
		lbDSK.setHorizontalAlignment(SwingConstants.CENTER);
		lbDSK.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbDSK.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbDSK.setAlignmentY(0.0f);
		lbDSK.setBounds(68, 539, 362, 107);
		add(lbDSK);
		
		JLabel lbLMN = new JLabel("Lemonade");
		lbLMN.setVerticalAlignment(SwingConstants.TOP);
		lbLMN.setHorizontalAlignment(SwingConstants.CENTER);
		lbLMN.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbLMN.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbLMN.setAlignmentY(0.0f);
		lbLMN.setBounds(567, 539, 362, 107);
		add(lbLMN);
		
		JRadioButton rbPM = new JRadioButton("");
		rbPM.setBounds(242, 154, 21, 21);
		add(rbPM);
		
		JRadioButton rbPS = new JRadioButton("");
		rbPS.setBounds(219, 154, 21, 21);
		add(rbPS);
		
		JRadioButton rbAWM = new JRadioButton("");
		rbAWM.setBounds(746, 154, 21, 21);
		add(rbAWM);
		
		JRadioButton rbAWL = new JRadioButton("");
		rbAWL.setBounds(769, 154, 21, 21);
		add(rbAWL);
		
		JRadioButton rbPL = new JRadioButton("");
		rbPL.setBounds(265, 154, 21, 21);
		add(rbPL);
		
		JRadioButton rbDPL = new JRadioButton("");
		rbDPL.setBounds(265, 297, 21, 21);
		add(rbDPL);
		
		JRadioButton rbDPM = new JRadioButton("");
		rbDPM.setBounds(242, 297, 21, 21);
		add(rbDPM);
		
		JRadioButton rbDAWL = new JRadioButton("");
		rbDAWL.setBounds(769, 297, 21, 21);
		add(rbDAWL);
		
		JRadioButton rbDAWM = new JRadioButton("");
		rbDAWM.setBounds(746, 297, 21, 21);
		add(rbDAWM);
		
		JRadioButton rbDAWS = new JRadioButton("");
		rbDAWS.setBounds(723, 297, 21, 21);
		add(rbDAWS);
		
		JRadioButton rbSL = new JRadioButton("");
		rbSL.setBounds(265, 441, 21, 21);
		add(rbSL);
		
		JRadioButton rbSM = new JRadioButton("");
		rbSM.setBounds(242, 441, 21, 21);
		add(rbSM);
		
		JRadioButton rbSS = new JRadioButton("");
		rbSS.setBounds(219, 441, 21, 21);
		add(rbSS);
		
		JRadioButton rbDSM = new JRadioButton("");
		rbDSM.setBounds(242, 575, 21, 21);
		add(rbDSM);
		
		JRadioButton rbDSS = new JRadioButton("");
		rbDSS.setBounds(219, 575, 21, 21);
		add(rbDSS);
		
		JRadioButton rbDSL = new JRadioButton("");
		rbDSL.setBounds(265, 575, 21, 21);
		add(rbDSL);
		
		JRadioButton rbSMS = new JRadioButton("");
		rbSMS.setBounds(723, 441, 21, 21);
		add(rbSMS);
		
		JRadioButton rbSML = new JRadioButton("");
		rbSML.setBounds(769, 441, 21, 21);
		add(rbSML);
		
		JRadioButton rbSMM = new JRadioButton("");
		rbSMM.setBounds(746, 441, 21, 21);
		add(rbSMM);
		
		JRadioButton rbLS = new JRadioButton("");
		rbLS.setBounds(723, 575, 21, 21);
		add(rbLS);
		
		JRadioButton rbLM = new JRadioButton("");
		rbLM.setBounds(746, 575, 21, 21);
		add(rbLM);
		
		JRadioButton rbLL = new JRadioButton("");
		rbLL.setBounds(769, 575, 21, 21);
		add(rbLL);
		
		JLabel lblNewLabel = new JLabel("S");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel.setBounds(226, 181, 14, 26);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("S");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(727, 180, 14, 26);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("S");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(729, 326, 14, 26);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("S");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(730, 468, 14, 26);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("S");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(222, 467, 14, 26);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("S");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(221, 600, 14, 26);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("S");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(726, 600, 14, 26);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("S");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(224, 320, 14, 26);
		add(lblNewLabel_7);
		
		JLabel lblM = new JLabel("M");
		lblM.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM.setBounds(242, 178, 26, 32);
		add(lblM);
		
		JLabel lblM_1 = new JLabel("M");
		lblM_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM_1.setBounds(746, 178, 21, 32);
		add(lblM_1);
		
		JLabel lblM_2 = new JLabel("M");
		lblM_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM_2.setBounds(241, 317, 18, 32);
		add(lblM_2);
		
		JLabel lblM_3 = new JLabel("M");
		lblM_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM_3.setBounds(746, 324, 21, 32);
		add(lblM_3);
		
		JLabel lblM_4 = new JLabel("M");
		lblM_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM_4.setBounds(241, 465, 26, 32);
		add(lblM_4);
		
		JLabel lblM_5 = new JLabel("M");
		lblM_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM_5.setBounds(748, 465, 26, 32);
		add(lblM_5);
		
		JLabel lblM_6 = new JLabel("M");
		lblM_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM_6.setBounds(241, 597, 21, 32);
		add(lblM_6);
		
		JLabel lblM_7 = new JLabel("M");
		lblM_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM_7.setBounds(745, 597, 26, 32);
		add(lblM_7);
		
		JLabel lblL_2 = new JLabel("L");
		lblL_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL_2.setBounds(777, 324, 26, 32);
		add(lblL_2);
		
		JLabel lblL_1 = new JLabel("L");
		lblL_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL_1.setBounds(774, 179, 26, 32);
		add(lblL_1);
		
		JLabel lblL = new JLabel("L");
		lblL.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL.setBounds(270, 177, 26, 32);
		add(lblL);
		
		JLabel lblL_3 = new JLabel("L");
		lblL_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL_3.setBounds(270, 317, 26, 32);
		add(lblL_3);
		
		JLabel lblL_4 = new JLabel("L");
		lblL_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL_4.setBounds(272, 464, 26, 32);
		add(lblL_4);
		
		JLabel lblL_5 = new JLabel("L");
		lblL_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL_5.setBounds(778, 465, 21, 32);
		add(lblL_5);
		
		JLabel lblL_6 = new JLabel("L");
		lblL_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL_6.setBounds(272, 596, 21, 32);
		add(lblL_6);
		
		JLabel lblL_7 = new JLabel("L");
		lblL_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblL_7.setBounds(774, 595, 26, 32);
		add(lblL_7);
		
		JRadioButton rbAWS = new JRadioButton("");
		rbAWS.setBounds(723, 154, 21, 21);
		add(rbAWS);
		
		JRadioButton rbDPS = new JRadioButton("");
		rbDPS.setBounds(219, 297, 21, 21);
		add(rbDPS);
		setVisible(false);
	}
}
