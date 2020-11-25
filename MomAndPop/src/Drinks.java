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
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Drinks extends JPanel {
	private final ButtonGroup AW = new ButtonGroup();
	private final ButtonGroup Pepsi = new ButtonGroup();
	private final ButtonGroup dietPepsi = new ButtonGroup();
	private final ButtonGroup Sunkist = new ButtonGroup();
	private final ButtonGroup dietSunkist = new ButtonGroup();
	private final ButtonGroup dietAW = new ButtonGroup();
	private final ButtonGroup sierraMist = new ButtonGroup();
	private final ButtonGroup Lemonade = new ButtonGroup();
	
	//ComboBoxes
	public JComboBox cbQuantityPepsi;
	public JComboBox cbQuantityDietPepsi;
	public JComboBox cbQuantitySunkist;
	public JComboBox cbQuantityDietSunkist;
	public JComboBox cbQuantityAW;
	public JComboBox cbQuantityDietAW;
	public JComboBox cbQuantitySierraMist;
	public JComboBox cbQuantityLemonade;
	
	//RadioButtons
	public JRadioButton rbPepsiS;
	public JRadioButton rbPepsiM;
	public JRadioButton rbPepsiL;
	public JRadioButton rbDietPepsiS;
	public JRadioButton rbDietPepsiM;
	public JRadioButton rbDietPepsiL;
	public JRadioButton rbSunkistS;
	public JRadioButton rbSunkistM;
	public JRadioButton rbSunkistL;
	public JRadioButton rbDietSunkistS;
	public JRadioButton rbDietSunkistM;
	public JRadioButton rbDietSunkistL;
	public JRadioButton rbAWS;
	public JRadioButton rbAWM;
	public JRadioButton rbAWL;
	public JRadioButton rbDietAWS;
	public JRadioButton rbDietAWM;
	public JRadioButton rbDietAWL;
	public JRadioButton rbSierraMistS;
	public JRadioButton rbSierraMistM;
	public JRadioButton rbSierraMistL;
	public JRadioButton rbLemonadeS;
	public JRadioButton rbLemonadeM;
	public JRadioButton rbLemonadeL;
	
	
	public String size;
	private JLabel borderDAW;

	/**
	 * Create the panel.
	 */
	public Drinks() {
		setFocusable(false);
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		JLabel lblPespi = new JLabel("Pepsi");
		lblPespi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblPespi.setBounds(248, 102, 155, 46);
		add(lblPespi);

		JLabel lblAW = new JLabel("A&W");
		lblAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblAW.setBounds(748, 102, 155, 46);
		add(lblAW);

		JLabel lblSAW = new JLabel("S");
		lblSAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSAW.setBounds(748, 159, 21, 26);
		add(lblSAW);

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

		

		JLabel lblMAW = new JLabel("M");
		lblMAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblMAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMAW.setBounds(775, 159, 21, 26);
		add(lblMAW);

		JLabel lblLAW = new JLabel("L");
		lblLAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblLAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLAW.setBounds(802, 159, 21, 26);
		add(lblLAW);

		JLabel lblSDietAW = new JLabel("S");
		lblSDietAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSDietAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSDietAW.setBounds(748, 306, 21, 26);
		add(lblSDietAW);

		JLabel lblLDietAW = new JLabel("L");
		lblLDietAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblLDietAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLDietAW.setBounds(802, 306, 21, 26);
		add(lblLDietAW);

		JLabel lblMDietAW = new JLabel("M");
		lblMDietAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblMDietAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMDietAW.setBounds(775, 306, 21, 26);
		add(lblMDietAW);

		JLabel lblDietAW = new JLabel("Diet A&W");
		lblDietAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblDietAW.setBounds(748, 249, 155, 46);
		add(lblDietAW);

		JLabel lblSierraMist = new JLabel("Sierra Mist");
		lblSierraMist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSierraMist.setBounds(748, 395, 155, 46);
		add(lblSierraMist);

		JLabel lblLSierraMist = new JLabel("L");
		lblLSierraMist.setHorizontalAlignment(SwingConstants.CENTER);
		lblLSierraMist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLSierraMist.setBounds(802, 452, 21, 26);
		add(lblLSierraMist);

		JLabel lblMSierraMist = new JLabel("M");
		lblMSierraMist.setHorizontalAlignment(SwingConstants.CENTER);
		lblMSierraMist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMSierraMist.setBounds(775, 452, 21, 26);
		add(lblMSierraMist);

		JLabel lblSSierraMist = new JLabel("S");
		lblSSierraMist.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSierraMist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSSierraMist.setBounds(748, 452, 21, 26);
		add(lblSSierraMist);

		JLabel lblLLemonade = new JLabel("L");
		lblLLemonade.setHorizontalAlignment(SwingConstants.CENTER);
		lblLLemonade.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLLemonade.setBounds(802, 590, 21, 26);
		add(lblLLemonade);

		JLabel lblMLemonade = new JLabel("M");
		lblMLemonade.setHorizontalAlignment(SwingConstants.CENTER);
		lblMLemonade.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMLemonade.setBounds(775, 590, 21, 26);
		add(lblMLemonade);

		JLabel lblSLemonade = new JLabel("S");
		lblSLemonade.setHorizontalAlignment(SwingConstants.CENTER);
		lblSLemonade.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSLemonade.setBounds(748, 590, 21, 26);
		add(lblSLemonade);

		JLabel lblLemonade = new JLabel("Lemonade");
		lblLemonade.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLemonade.setBounds(748, 533, 155, 46);
		add(lblLemonade);

		JLabel lblSDietSunkist = new JLabel("S");
		lblSDietSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		lblSDietSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSDietSunkist.setBounds(248, 590, 21, 26);
		add(lblSDietSunkist);

		JLabel lblMDietSunkist = new JLabel("M");
		lblMDietSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		lblMDietSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMDietSunkist.setBounds(275, 590, 21, 26);
		add(lblMDietSunkist);

		JLabel lblLDietSunkist = new JLabel("L");
		lblLDietSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		lblLDietSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLDietSunkist.setBounds(302, 590, 21, 26);
		add(lblLDietSunkist);

		JLabel lblDietSunkist = new JLabel("Diet Sunkist");
		lblDietSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblDietSunkist.setBounds(248, 533, 155, 46);
		add(lblDietSunkist);

		JLabel lblSunkist = new JLabel("Sunkist");
		lblSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSunkist.setBounds(248, 395, 155, 46);
		add(lblSunkist);

		JLabel lblSSunkist = new JLabel("S");
		lblSSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSSunkist.setBounds(248, 452, 21, 26);
		add(lblSSunkist);

		JLabel lblMSunkist = new JLabel("M");
		lblMSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		lblMSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMSunkist.setBounds(275, 452, 21, 26);
		add(lblMSunkist);

		JLabel lblLSunkist = new JLabel("L");
		lblLSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		lblLSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLSunkist.setBounds(302, 452, 21, 26);
		add(lblLSunkist);

		JLabel lblSDietPepsi = new JLabel("S");
		lblSDietPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSDietPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSDietPepsi.setBounds(248, 306, 21, 26);
		add(lblSDietPepsi);

		JLabel lblMDietPepsi = new JLabel("M");
		lblMDietPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lblMDietPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMDietPepsi.setBounds(275, 306, 21, 26);
		add(lblMDietPepsi);

		JLabel lblLDietPepsi = new JLabel("L");
		lblLDietPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lblLDietPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLDietPepsi.setBounds(302, 306, 21, 26);
		add(lblLDietPepsi);

		JLabel lblDietPepsi = new JLabel("Diet Pepsi");
		lblDietPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblDietPepsi.setBounds(248, 249, 155, 46);
		add(lblDietPepsi);

		JLabel lblLPepsi = new JLabel("L");
		lblLPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lblLPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLPepsi.setBounds(302, 159, 21, 26);
		add(lblLPepsi);

		JLabel lblMPepsi = new JLabel("M");
		lblMPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lblMPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMPepsi.setBounds(275, 159, 21, 26);
		add(lblMPepsi);

		JLabel lblSPepsi = new JLabel("S");
		lblSPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSPepsi.setBounds(248, 159, 21, 26);
		add(lblSPepsi);

		
		//--------------------------------------------------------ComboBoxes--------------------------------------------------------
		//Pepsi
		cbQuantityPepsi = new JComboBox();
		cbQuantityPepsi.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityPepsi.setMaximumRowCount(9);
		cbQuantityPepsi.setFocusable(false);
		cbQuantityPepsi.setBounds(466, 131, 40, 31);
		add(cbQuantityPepsi);

		//Diet Pepsi
		cbQuantityDietPepsi = new JComboBox();
		cbQuantityDietPepsi.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityDietPepsi.setMaximumRowCount(9);
		cbQuantityDietPepsi.setFocusable(false);
		cbQuantityDietPepsi.setBounds(466, 274, 40, 31);
		add(cbQuantityDietPepsi);
		
		//Sunkist
		cbQuantitySunkist = new JComboBox();
		cbQuantitySunkist.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantitySunkist.setMaximumRowCount(9);
		cbQuantitySunkist.setFocusable(false);
		cbQuantitySunkist.setBounds(466, 422, 40, 31);
		add(cbQuantitySunkist);
		
		//Diet Sunkist
		cbQuantityDietSunkist = new JComboBox();
		cbQuantityDietSunkist.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityDietSunkist.setMaximumRowCount(9);
		cbQuantityDietSunkist.setFocusable(false);
		cbQuantityDietSunkist.setBounds(466, 559, 40, 31);
		add(cbQuantityDietSunkist);
		
		//Root Beer
		cbQuantityAW = new JComboBox();
		cbQuantityAW.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityAW.setMaximumRowCount(9);
		cbQuantityAW.setFocusable(false);
		cbQuantityAW.setBounds(980, 131, 40, 31);
		add(cbQuantityAW);
		
		//Diet Root Beer
		cbQuantityDietAW = new JComboBox();
		cbQuantityDietAW.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		cbQuantityDietAW.setMaximumRowCount(9);
		cbQuantityDietAW.setFocusable(false);
		cbQuantityDietAW.setBounds(980, 274, 40, 31);
		add(cbQuantityDietAW);

		//Sierra Mist
		cbQuantitySierraMist = new JComboBox();
		cbQuantitySierraMist.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantitySierraMist.setMaximumRowCount(9);
		cbQuantitySierraMist.setFocusable(false);
		cbQuantitySierraMist.setBounds(980, 422, 40, 31);
		add(cbQuantitySierraMist);

		//Lemonade
		cbQuantityLemonade = new JComboBox();
		cbQuantityLemonade.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityLemonade.setMaximumRowCount(9);
		cbQuantityLemonade.setFocusable(false);
		cbQuantityLemonade.setBounds(980, 559, 40, 31);
		add(cbQuantityLemonade);
		
		//--------------------------------------------------------Icon--------------------------------------------------------
		//Pepsi
		JLabel iconP = new JLabel("");
		iconP.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/pepsi.jpg")));
		iconP.setBounds(94, 102, 71, 94);
		add(iconP);
		
		//Diet Pepsi
		JLabel iconDP = new JLabel("");
		iconDP.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/Diet-pepsi.jpg")));
		iconDP.setBounds(94, 249, 71, 94);
		add(iconDP);
		
		//Sunkist
		JLabel iconS = new JLabel("");
		iconS.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/sunkist.jpg")));
		iconS.setBounds(94, 395, 71, 94);
		add(iconS);
		
		//Diet Sunkist
		JLabel iconDS = new JLabel("");
		iconDS.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/diet-sunkist.jpeg")));
		iconDS.setBounds(94, 533, 71, 94);
		add(iconDS);
		
		//Root Beer
		JLabel iconAW = new JLabel("");
		iconAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/A&W.png")));
		iconAW.setBounds(594, 102, 71, 94);
		add(iconAW);
		
		//Diet Root Beer
		JLabel iconDAW = new JLabel("");
		iconDAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/diet-A&W.jpg")));
		iconDAW.setBounds(594, 249, 71, 94);
		add(iconDAW);
		
		//Sierra Mist
		JLabel iconSM = new JLabel("");
		iconSM.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/Sierra-mist.jpg")));
		iconSM.setBounds(594, 395, 71, 94);
		add(iconSM);
		
		//Lemonade
		JLabel iconL = new JLabel("");
		iconL.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/lemonade.jpg")));
		iconL.setBounds(594, 533, 71, 94);
		add(iconL);

		
		//--------------------------------------------------------Radio Button Group--------------------------------------------------------
		//Pepsi
		rbPepsiS = new JRadioButton("");
		Pepsi.add(rbPepsiS);
		rbPepsiS.setBounds(248, 137, 21, 21);
		add(rbPepsiS);

		rbPepsiM = new JRadioButton("");
		Pepsi.add(rbPepsiM);
		rbPepsiM.setBounds(275, 137, 21, 21);
		add(rbPepsiM);

		rbPepsiL = new JRadioButton("");
		Pepsi.add(rbPepsiL);
		rbPepsiL.setBounds(302, 137, 21, 21);
		add(rbPepsiL);
		
		//Diet Pepsi
		rbDietPepsiL = new JRadioButton("");
		dietPepsi.add(rbDietPepsiL);
		rbDietPepsiL.setBounds(302, 284, 21, 21);
		add(rbDietPepsiL);

		rbDietPepsiM = new JRadioButton("");
		dietPepsi.add(rbDietPepsiM);
		rbDietPepsiM.setBounds(275, 284, 21, 21);
		add(rbDietPepsiM);

		rbDietPepsiS = new JRadioButton("");
		dietPepsi.add(rbDietPepsiS);
		rbDietPepsiS.setBounds(248, 284, 21, 21);
		add(rbDietPepsiS);
		
		//Sunkist
		rbSunkistS = new JRadioButton("");
		Sunkist.add(rbSunkistS);
		rbSunkistS.setBounds(248, 430, 21, 21);
		add(rbSunkistS);
		
		rbSunkistM = new JRadioButton("");
		Sunkist.add(rbSunkistM);
		rbSunkistM.setBounds(275, 430, 21, 21);
		add(rbSunkistM);

		rbSunkistL = new JRadioButton("");
		Sunkist.add(rbSunkistL);
		rbSunkistL.setBounds(302, 430, 21, 21);
		add(rbSunkistL);
		
		//Diet Sunkist
		rbDietSunkistL = new JRadioButton("");
		dietSunkist.add(rbDietSunkistL);
		rbDietSunkistL.setBounds(302, 568, 21, 21);
		add(rbDietSunkistL);

		rbDietSunkistM = new JRadioButton("");
		dietSunkist.add(rbDietSunkistM);
		rbDietSunkistM.setBounds(275, 568, 21, 21);
		add(rbDietSunkistM);
		
		rbDietSunkistS = new JRadioButton("");
		dietSunkist.add(rbDietSunkistS);
		rbDietSunkistS.setBounds(248, 568, 21, 21);
		add(rbDietSunkistS);
		
		//Root Beer
		rbAWM = new JRadioButton("");
		AW.add(rbAWM);
		rbAWM.setBounds(775, 137, 21, 21);
		add(rbAWM);
		
		rbAWL = new JRadioButton("");
		AW.add(rbAWL);
		rbAWL.setBounds(802, 137, 21, 21);
		add(rbAWL);
		
		rbAWS = new JRadioButton("");
		AW.add(rbAWS);
		rbAWS.setBounds(748, 137, 21, 21);
		add(rbAWS);
		
		//Diet Root Beer
		rbDietAWL = new JRadioButton("");
		dietAW.add(rbDietAWL);
		rbDietAWL.setBounds(802, 284, 21, 21);
		add(rbDietAWL);

		rbDietAWM = new JRadioButton("");
		dietAW.add(rbDietAWM);
		rbDietAWM.setBounds(775, 284, 21, 21);
		add(rbDietAWM);
		
		rbDietAWS = new JRadioButton("");
		dietAW.add(rbDietAWS);
		rbDietAWS.setBounds(748, 284, 21, 21);
		add(rbDietAWS);
		
		//Sierra Mist
		rbSierraMistS = new JRadioButton("");
		sierraMist.add(rbSierraMistS);
		rbSierraMistS.setBounds(748, 430, 21, 21);
		add(rbSierraMistS);

		rbSierraMistM = new JRadioButton("");
		sierraMist.add(rbSierraMistM);
		rbSierraMistM.setBounds(775, 430, 21, 21);
		add(rbSierraMistM);

		rbSierraMistL = new JRadioButton("");
		sierraMist.add(rbSierraMistL);
		rbSierraMistL.setBounds(802, 430, 21, 21);
		add(rbSierraMistL);
		
		//Lemonade
		rbLemonadeS = new JRadioButton("");
		Lemonade.add(rbLemonadeS);
		rbLemonadeS.setBounds(748, 568, 21, 21);
		add(rbLemonadeS);

		rbLemonadeM = new JRadioButton("");
		Lemonade.add(rbLemonadeM);
		rbLemonadeM.setBounds(775, 568, 21, 21);
		add(rbLemonadeM);

		rbLemonadeL = new JRadioButton("");
		Lemonade.add(rbLemonadeL);
		rbLemonadeL.setBounds(802, 568, 21, 21);
		add(rbLemonadeL);
		
		
		//--------------------------------------------------------Border--------------------------------------------------------
		//Pepsi
		JLabel borderPepsi = new JLabel("");
		borderPepsi.setVerticalAlignment(SwingConstants.TOP);
		borderPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		borderPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderPepsi.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderPepsi.setAlignmentY(0.0f);
		borderPepsi.setBounds(74, 95, 362, 107);
		add(borderPepsi);
		
		//Diet Pepsi
		JLabel borderDietPepsi = new JLabel("");
		borderDietPepsi.setVerticalAlignment(SwingConstants.TOP);
		borderDietPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		borderDietPepsi.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderDietPepsi.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderDietPepsi.setAlignmentY(0.0f);
		borderDietPepsi.setBounds(74, 242, 362, 107);
		add(borderDietPepsi);
		
		//Sunkist
		JLabel borderSunkist = new JLabel("");
		borderSunkist.setVerticalAlignment(SwingConstants.TOP);
		borderSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		borderSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderSunkist.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderSunkist.setAlignmentY(0.0f);
		borderSunkist.setBounds(74, 388, 362, 107);
		add(borderSunkist);
		
		//Diet Sunkist
		JLabel borderDietSunkist = new JLabel("");
		borderDietSunkist.setVerticalAlignment(SwingConstants.TOP);
		borderDietSunkist.setHorizontalAlignment(SwingConstants.CENTER);
		borderDietSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderDietSunkist.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderDietSunkist.setAlignmentY(0.0f);
		borderDietSunkist.setBounds(74, 526, 362, 107);
		add(borderDietSunkist);
		setVisible(false);
		
		//Lemonade
		JLabel borderLemonade = new JLabel("");
		borderLemonade.setVerticalAlignment(SwingConstants.TOP);
		borderLemonade.setHorizontalAlignment(SwingConstants.CENTER);
		borderLemonade.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderLemonade.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderLemonade.setAlignmentY(0.0f);
		borderLemonade.setBounds(574, 526, 362, 107);
		add(borderLemonade);
		
		//Sierra Mist
		JLabel borderSierraMist = new JLabel("");
		borderSierraMist.setVerticalAlignment(SwingConstants.TOP);
		borderSierraMist.setHorizontalAlignment(SwingConstants.CENTER);
		borderSierraMist.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderSierraMist.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderSierraMist.setAlignmentY(0.0f);
		borderSierraMist.setBounds(574, 388, 362, 107);
		add(borderSierraMist);
		
		//Root Beer
		JLabel borderAW = new JLabel("");
		borderAW.setVerticalAlignment(SwingConstants.TOP);
		borderAW.setHorizontalAlignment(SwingConstants.CENTER);
		borderAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderAW.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderAW.setAlignmentY(0.0f);
		borderAW.setBounds(574, 95, 362, 107);
		add(borderAW);
		
		//Diet Root Beer
		borderDAW = new JLabel("");
		borderDAW.setVerticalAlignment(SwingConstants.TOP);
		borderDAW.setHorizontalAlignment(SwingConstants.CENTER);
		borderDAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		borderDAW.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		borderDAW.setAlignmentY(0.0f);
		borderDAW.setBounds(574, 242, 362, 107);
		add(borderDAW);

	}	
	
	//--------------------------------------------------------Setter and Getter Method--------------------------------------------------------
	//Pepsi
	public String getPepsiSize() {
		if(rbPepsiS.isSelected() == true) size = "Small";
		if(rbPepsiM.isSelected() == true) size = "Medium";
		if(rbPepsiL.isSelected() == true) size = "Large";
		return size;
	}
	
	//Diet Pepsi
	public String getDietPepsiSize() {
		if(rbDietPepsiS.isSelected() == true) size = "Small";
		if(rbDietPepsiM.isSelected() == true) size = "Medium";
		if(rbDietPepsiL.isSelected() == true) size = "Large";
		return size;
	}
	
	//Sunkist
	public String getSunkistSize() {
		if(rbSunkistS.isSelected() == true) size = "Small";
		if(rbSunkistM.isSelected() == true) size = "Medium";
		if(rbSunkistL.isSelected() == true) size = "Large";
		return size;
	}
	
	//Diet Sunkist
	public String getDietSunkistSize() {
		if(rbDietSunkistS.isSelected() == true) size = "Small";
		if(rbDietSunkistM.isSelected() == true) size = "Medium";
		if(rbDietSunkistL.isSelected() == true) size = "Large";
		return size;
	}
	
	//Root Beer
	public String getRootBeerSize() {
		if(rbAWS.isSelected() == true) size = "Small";
		if(rbAWM.isSelected() == true) size = "Medium";
		if(rbAWL.isSelected() == true) size = "Large";
		return size;
	}
	
	//Diet Root Beer
	public String getDietRootBeerSize() {
		if(rbDietAWS.isSelected() == true) size = "Small";
		if(rbDietAWM.isSelected() == true) size = "Medium";
		if(rbDietAWL.isSelected() == true) size = "Large";
		return size;
	}
	
	//Sierra Mist
	public String getSierraMistSize() {
		if(rbSierraMistS.isSelected() == true) size = "Small";
		if(rbSierraMistM.isSelected() == true) size = "Medium";
		if(rbSierraMistL.isSelected() == true) size = "Large";
		return size;
	}
	
	//Lemonade
	public String getLemonadeSize() {
		if(rbLemonadeS.isSelected() == true) size = "Small";
		if(rbLemonadeM.isSelected() == true) size = "Medium";
		if(rbLemonadeL.isSelected() == true) size = "Large";
		return size;
	}
	
	//--------------------------------------------------------Clear Radio Buttons--------------------------------------------------------
	//Pepsi
	public void rbPepsi() {
		Pepsi.clearSelection();
	}
	
	//Diet Pepsi
	public void rbDietPepsi() {
		dietPepsi.clearSelection();
	}
	
	//Sunkist
	public void rbSunkist() {
		Sunkist.clearSelection();
	}
	
	//Diet Sunkist
	public void rbDietSunkist() {
		dietSunkist.clearSelection();
	}
	
	//Root Beer
	public void rbRootBeer() {
		AW.clearSelection();
	}
	
	//Diet Root Beer
	public void rbDietRootBeer() {
		dietAW.clearSelection();
	}
	
	//Sierra Mist
	public void rbSierraMist() {
		sierraMist.clearSelection();
	}
	
	//Lemonade
	public void rbLemonade() {
		Lemonade.clearSelection();
	}
}
