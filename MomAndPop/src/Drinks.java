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
		
		JLabel lblAW = new JLabel("A&W");
		lblAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblAW.setBounds(748, 102, 155, 46);
		add(lblAW);
		
		JLabel lblSAW = new JLabel("S");
		lblSAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSAW.setBounds(748, 159, 21, 26);
		add(lblSAW);
		
		JRadioButton rbAWS = new JRadioButton("");
		AW.add(rbAWS);
		rbAWS.setBounds(748, 137, 21, 21);
		add(rbAWS);
		
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
		
		JComboBox cbQuantityPepsi = new JComboBox();
		cbQuantityPepsi.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityPepsi.setMaximumRowCount(9);
		cbQuantityPepsi.setFocusable(false);
		cbQuantityPepsi.setBounds(466, 131, 40, 31);
		add(cbQuantityPepsi);
		
		JButton btnAddToCartPepsi = new JButton("");
		btnAddToCartPepsi.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartPepsi.setForeground(Color.WHITE);
		btnAddToCartPepsi.setFocusable(false);
		btnAddToCartPepsi.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartPepsi.setBorderPainted(false);
		btnAddToCartPepsi.setBackground(Color.RED);
		btnAddToCartPepsi.setBounds(505, 131, 40, 31);
		add(btnAddToCartPepsi);
		
		JComboBox cbQuantityDietPepsi = new JComboBox();
		cbQuantityDietPepsi.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityDietPepsi.setMaximumRowCount(9);
		cbQuantityDietPepsi.setFocusable(false);
		cbQuantityDietPepsi.setBounds(466, 274, 40, 31);
		add(cbQuantityDietPepsi);
		
		JButton btnAddToCartDietPepsi = new JButton("");
		btnAddToCartDietPepsi.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartDietPepsi.setForeground(Color.WHITE);
		btnAddToCartDietPepsi.setFocusable(false);
		btnAddToCartDietPepsi.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartDietPepsi.setBorderPainted(false);
		btnAddToCartDietPepsi.setBackground(Color.RED);
		btnAddToCartDietPepsi.setBounds(505, 274, 40, 31);
		add(btnAddToCartDietPepsi);
		
		JComboBox cbQuantitySunkist = new JComboBox();
		cbQuantitySunkist.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantitySunkist.setMaximumRowCount(9);
		cbQuantitySunkist.setFocusable(false);
		cbQuantitySunkist.setBounds(466, 422, 40, 31);
		add(cbQuantitySunkist);
		
		JButton btnAddToCartSunkist = new JButton("");
		btnAddToCartSunkist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartSunkist.setForeground(Color.WHITE);
		btnAddToCartSunkist.setFocusable(false);
		btnAddToCartSunkist.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartSunkist.setBorderPainted(false);
		btnAddToCartSunkist.setBackground(Color.RED);
		btnAddToCartSunkist.setBounds(505, 422, 40, 31);
		add(btnAddToCartSunkist);
		
		JComboBox cbQuantityDietSunkist = new JComboBox();
		cbQuantityDietSunkist.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityDietSunkist.setMaximumRowCount(9);
		cbQuantityDietSunkist.setFocusable(false);
		cbQuantityDietSunkist.setBounds(466, 559, 40, 31);
		add(cbQuantityDietSunkist);
		
		JButton btnAddToCartDietSunkist = new JButton("");
		btnAddToCartDietSunkist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartDietSunkist.setForeground(Color.WHITE);
		btnAddToCartDietSunkist.setFocusable(false);
		btnAddToCartDietSunkist.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartDietSunkist.setBorderPainted(false);
		btnAddToCartDietSunkist.setBackground(Color.RED);
		btnAddToCartDietSunkist.setBounds(505, 559, 40, 31);
		add(btnAddToCartDietSunkist);
		
		JComboBox cbQuantityAW = new JComboBox();
		cbQuantityAW.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityAW.setMaximumRowCount(9);
		cbQuantityAW.setFocusable(false);
		cbQuantityAW.setBounds(980, 131, 40, 31);
		add(cbQuantityAW);
		
		JButton btnAddToCartAW = new JButton("");
		btnAddToCartAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartAW.setForeground(Color.WHITE);
		btnAddToCartAW.setFocusable(false);
		btnAddToCartAW.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartAW.setBorderPainted(false);
		btnAddToCartAW.setBackground(Color.RED);
		btnAddToCartAW.setBounds(1019, 131, 40, 31);
		add(btnAddToCartAW);
		
		JComboBox cbQuantityDietAW = new JComboBox();
		cbQuantityDietAW.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityDietAW.setMaximumRowCount(9);
		cbQuantityDietAW.setFocusable(false);
		cbQuantityDietAW.setBounds(980, 274, 40, 31);
		add(cbQuantityDietAW);
		
		JButton btnAddToCartDietAW = new JButton("");
		btnAddToCartDietAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartDietAW.setForeground(Color.WHITE);
		btnAddToCartDietAW.setFocusable(false);
		btnAddToCartDietAW.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartDietAW.setBorderPainted(false);
		btnAddToCartDietAW.setBackground(Color.RED);
		btnAddToCartDietAW.setBounds(1019, 274, 40, 31);
		add(btnAddToCartDietAW);
		
		JComboBox cbQuantitySierraMist = new JComboBox();
		cbQuantitySierraMist.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantitySierraMist.setMaximumRowCount(9);
		cbQuantitySierraMist.setFocusable(false);
		cbQuantitySierraMist.setBounds(980, 422, 40, 31);
		add(cbQuantitySierraMist);
		
		JButton btnAddToCartSierraMist = new JButton("");
		btnAddToCartSierraMist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartSierraMist.setForeground(Color.WHITE);
		btnAddToCartSierraMist.setFocusable(false);
		btnAddToCartSierraMist.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartSierraMist.setBorderPainted(false);
		btnAddToCartSierraMist.setBackground(Color.RED);
		btnAddToCartSierraMist.setBounds(1019, 422, 40, 31);
		add(btnAddToCartSierraMist);
		
		JComboBox cbQuantityLemonade = new JComboBox();
		cbQuantityLemonade.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbQuantityLemonade.setMaximumRowCount(9);
		cbQuantityLemonade.setFocusable(false);
		cbQuantityLemonade.setBounds(980, 559, 40, 31);
		add(cbQuantityLemonade);
		
		JButton btnAddToCartLemonade = new JButton("");
		btnAddToCartLemonade.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartLemonade.setForeground(Color.WHITE);
		btnAddToCartLemonade.setFocusable(false);
		btnAddToCartLemonade.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartLemonade.setBorderPainted(false);
		btnAddToCartLemonade.setBackground(Color.RED);
		btnAddToCartLemonade.setBounds(1019, 559, 40, 31);
		add(btnAddToCartLemonade);
		
		JLabel lblMAW = new JLabel("M");
		lblMAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblMAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMAW.setBounds(775, 159, 21, 26);
		add(lblMAW);
		
		JRadioButton rbAWM = new JRadioButton("");
		rbAWM.setBounds(775, 137, 21, 21);
		add(rbAWM);
		
		JLabel lblLAW = new JLabel("L");
		lblLAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblLAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLAW.setBounds(802, 159, 21, 26);
		add(lblLAW);
		
		JRadioButton rbAWL = new JRadioButton("");
		rbAWL.setBounds(802, 137, 21, 21);
		add(rbAWL);
		
		JLabel lbliconAW = new JLabel("");
		lbliconAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/A&W.png")));
		lbliconAW.setBounds(594, 102, 71, 94);
		add(lbliconAW);
		
		JLabel lbAW = new JLabel("");
		lbAW.setVerticalAlignment(SwingConstants.TOP);
		lbAW.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW.setAlignmentY(0.0f);
		lbAW.setBounds(574, 95, 362, 107);
		add(lbAW);
		
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
		
		JLabel lblSDietAW = new JLabel("S");
		lblSDietAW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSDietAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSDietAW.setBounds(748, 306, 21, 26);
		add(lblSDietAW);
		
		JLabel lbliconDietAW = new JLabel("");
		lbliconDietAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/diet-A&W.jpg")));
		lbliconDietAW.setBounds(594, 249, 71, 94);
		add(lbliconDietAW);
		
		JRadioButton rbDietAWS = new JRadioButton("");
		rbDietAWS.setBounds(748, 284, 21, 21);
		add(rbDietAWS);
		
		JLabel lblDietAW = new JLabel("Diet A&W");
		lblDietAW.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblDietAW.setBounds(748, 249, 155, 46);
		add(lblDietAW);
		
		JRadioButton rbDietAWL = new JRadioButton("");
		rbDietAWL.setBounds(802, 284, 21, 21);
		add(rbDietAWL);
		
		JRadioButton rbDietAWM = new JRadioButton("");
		rbDietAWM.setBounds(775, 284, 21, 21);
		add(rbDietAWM);
		
		JLabel lbAW_1 = new JLabel("");
		lbAW_1.setVerticalAlignment(SwingConstants.TOP);
		lbAW_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW_1.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW_1.setAlignmentY(0.0f);
		lbAW_1.setBounds(574, 242, 362, 107);
		add(lbAW_1);
		
		JLabel lbliconSierraMist = new JLabel("");
		lbliconSierraMist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/Sierra-mist.jpg")));
		lbliconSierraMist.setBounds(594, 395, 71, 94);
		add(lbliconSierraMist);
		
		JRadioButton rbSierraMistS = new JRadioButton("");
		rbSierraMistS.setBounds(748, 430, 21, 21);
		add(rbSierraMistS);
		
		JLabel lblSierraMist = new JLabel("Sierra Mist");
		lblSierraMist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSierraMist.setBounds(748, 395, 155, 46);
		add(lblSierraMist);
		
		JRadioButton rbSierraMistM = new JRadioButton("");
		rbSierraMistM.setBounds(775, 430, 21, 21);
		add(rbSierraMistM);
		
		JRadioButton rbSierraMistL = new JRadioButton("");
		rbSierraMistL.setBounds(802, 430, 21, 21);
		add(rbSierraMistL);
		
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
		
		JLabel lbAW_1_1 = new JLabel("");
		lbAW_1_1.setVerticalAlignment(SwingConstants.TOP);
		lbAW_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW_1_1.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW_1_1.setAlignmentY(0.0f);
		lbAW_1_1.setBounds(574, 388, 362, 107);
		add(lbAW_1_1);
		
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
		
		JRadioButton rbLemonadeS = new JRadioButton("");
		rbLemonadeS.setBounds(748, 568, 21, 21);
		add(rbLemonadeS);
		
		JRadioButton rbLemonadeM = new JRadioButton("");
		rbLemonadeM.setBounds(775, 568, 21, 21);
		add(rbLemonadeM);
		
		JRadioButton rbLemonadeL = new JRadioButton("");
		rbLemonadeL.setBounds(802, 568, 21, 21);
		add(rbLemonadeL);
		
		JLabel lblLemonade = new JLabel("Lemonade");
		lblLemonade.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblLemonade.setBounds(748, 533, 155, 46);
		add(lblLemonade);
		
		JLabel lbliconLemonade = new JLabel("");
		lbliconLemonade.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/lemonade.jpg")));
		lbliconLemonade.setBounds(594, 533, 71, 94);
		add(lbliconLemonade);
		
		JLabel lbAW_1_1_1 = new JLabel("");
		lbAW_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lbAW_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW_1_1_1.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW_1_1_1.setAlignmentY(0.0f);
		lbAW_1_1_1.setBounds(574, 526, 362, 107);
		add(lbAW_1_1_1);
		
		JLabel lbliconDietSunkist = new JLabel("");
		lbliconDietSunkist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/diet-sunkist.jpeg")));
		lbliconDietSunkist.setBounds(94, 533, 71, 94);
		add(lbliconDietSunkist);
		
		JRadioButton rbDietSunkistS = new JRadioButton("");
		rbDietSunkistS.setBounds(248, 568, 21, 21);
		add(rbDietSunkistS);
		
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
		
		JRadioButton rbDietSunkistL = new JRadioButton("");
		rbDietSunkistL.setBounds(302, 568, 21, 21);
		add(rbDietSunkistL);
		
		JRadioButton rbDietSunkistM = new JRadioButton("");
		rbDietSunkistM.setBounds(275, 568, 21, 21);
		add(rbDietSunkistM);
		
		JLabel lblDietSunkist = new JLabel("Diet Sunkist");
		lblDietSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblDietSunkist.setBounds(248, 533, 155, 46);
		add(lblDietSunkist);
		
		JLabel lbliconSunkist = new JLabel("");
		lbliconSunkist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/sunkist.jpg")));
		lbliconSunkist.setBounds(94, 395, 71, 94);
		add(lbliconSunkist);
		
		JLabel lblSunkist = new JLabel("Sunkist");
		lblSunkist.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSunkist.setBounds(248, 395, 155, 46);
		add(lblSunkist);
		
		JRadioButton rbSunkistS = new JRadioButton("");
		rbSunkistS.setBounds(248, 430, 21, 21);
		add(rbSunkistS);
		
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
		
		JRadioButton rbSunkistM = new JRadioButton("");
		rbSunkistM.setBounds(275, 430, 21, 21);
		add(rbSunkistM);
		
		JRadioButton rbSunkistL = new JRadioButton("");
		rbSunkistL.setBounds(302, 430, 21, 21);
		add(rbSunkistL);
		
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
		
		JRadioButton rbDietPepsiL = new JRadioButton("");
		rbDietPepsiL.setBounds(302, 284, 21, 21);
		add(rbDietPepsiL);
		
		JRadioButton rbDietPepsiM = new JRadioButton("");
		rbDietPepsiM.setBounds(275, 284, 21, 21);
		add(rbDietPepsiM);
		
		JRadioButton rbDietPepsiS = new JRadioButton("");
		rbDietPepsiS.setBounds(248, 284, 21, 21);
		add(rbDietPepsiS);
		
		JLabel lbliconDietPepsi = new JLabel("");
		lbliconDietPepsi.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/Diet-pepsi.jpg")));
		lbliconDietPepsi.setBounds(94, 249, 71, 94);
		add(lbliconDietPepsi);
		
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
		
		JRadioButton rbPepsiS = new JRadioButton("");
		rbPepsiS.setBounds(248, 137, 21, 21);
		add(rbPepsiS);
		
		JRadioButton rbPepsiM = new JRadioButton("");
		rbPepsiM.setBounds(275, 137, 21, 21);
		add(rbPepsiM);
		
		JRadioButton rbPepsiL = new JRadioButton("");
		rbPepsiL.setBounds(302, 137, 21, 21);
		add(rbPepsiL);
		
		JLabel lbliconPepsi = new JLabel("");
		lbliconPepsi.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/pepsi.jpg")));
		lbliconPepsi.setBounds(94, 102, 71, 94);
		add(lbliconPepsi);
		
		JLabel lblPespi = new JLabel("Pepsi");
		lblPespi.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblPespi.setBounds(248, 102, 155, 46);
		add(lblPespi);
		
		JLabel lbAW_2 = new JLabel("");
		lbAW_2.setVerticalAlignment(SwingConstants.TOP);
		lbAW_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW_2.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW_2.setAlignmentY(0.0f);
		lbAW_2.setBounds(74, 95, 362, 107);
		add(lbAW_2);
		
		JLabel lbAW_1_2 = new JLabel("");
		lbAW_1_2.setVerticalAlignment(SwingConstants.TOP);
		lbAW_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW_1_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW_1_2.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW_1_2.setAlignmentY(0.0f);
		lbAW_1_2.setBounds(74, 242, 362, 107);
		add(lbAW_1_2);
		
		JLabel lbAW_1_1_2 = new JLabel("");
		lbAW_1_1_2.setVerticalAlignment(SwingConstants.TOP);
		lbAW_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW_1_1_2.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW_1_1_2.setAlignmentY(0.0f);
		lbAW_1_1_2.setBounds(74, 388, 362, 107);
		add(lbAW_1_1_2);
		
		JLabel lbAW_1_1_1_1 = new JLabel("");
		lbAW_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lbAW_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbAW_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAW_1_1_1_1.setBorder(new LineBorder(new Color(192, 192, 192), 5, true));
		lbAW_1_1_1_1.setAlignmentY(0.0f);
		lbAW_1_1_1_1.setBounds(74, 526, 362, 107);
		add(lbAW_1_1_1_1);
		setVisible(false);

	}
}
