import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class Toppings2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Toppings2() {
		setBackground(SystemColor.control);
		setLayout(null);
		setBounds(0, 0, 1108, 671);
		setVisible(false);
		
		JLabel lblPA = new JLabel("Pineapple");
		lblPA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPA.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblPA.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblPA.setAlignmentY(0.0f);
		lblPA.setBounds(654, 500, 219, 40);
		add(lblPA);
		
		JLabel lblT = new JLabel("Tomatoes");
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		lblT.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblT.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblT.setAlignmentY(0.0f);
		lblT.setBounds(654, 439, 219, 40);
		add(lblT);
		
		JLabel lblM = new JLabel("Mushrooms");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblM.setAlignmentY(0.0f);
		lblM.setBounds(654, 378, 219, 40);
		add(lblM);
		
		JLabel lblO = new JLabel("Onions");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblO.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblO.setAlignmentY(0.0f);
		lblO.setBounds(654, 314, 219, 40);
		add(lblO);
		
		JLabel lblGP = new JLabel("Green Peppers");
		lblGP.setHorizontalAlignment(SwingConstants.CENTER);
		lblGP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblGP.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblGP.setAlignmentY(0.0f);
		lblGP.setBounds(654, 249, 219, 40);
		add(lblGP);
		
		JLabel lblTopping = new JLabel("Toppings");
		lblTopping.setHorizontalAlignment(SwingConstants.CENTER);
		lblTopping.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 70));
		lblTopping.setBounds(10, 11, 1088, 130);
		add(lblTopping);
		
		JLabel lblMeats = new JLabel("Meats");
		lblMeats.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeats.setFont(new Font("Nirmala UI", Font.BOLD, 35));
		lblMeats.setBounds(234, 198, 219, 48);
		add(lblMeats);
		
		JLabel lblVeggies = new JLabel("Veggies");
		lblVeggies.setHorizontalAlignment(SwingConstants.CENTER);
		lblVeggies.setFont(new Font("Nirmala UI", Font.BOLD, 35));
		lblVeggies.setBounds(654, 198, 219, 48);
		add(lblVeggies);
		
		JLabel lblP = new JLabel("Pepperoni");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblP.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblP.setAlignmentY(0.0f);
		lblP.setBounds(234, 249, 219, 40);
		add(lblP);
		
		JLabel lblS = new JLabel("Sausage");
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblS.setAlignmentY(0.0f);
		lblS.setBounds(234, 314, 219, 40);
		add(lblS);
		
		JLabel lblH = new JLabel("Ham");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblH.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblH.setAlignmentY(0.0f);
		lblH.setBounds(234, 378, 219, 40);
		add(lblH);
		
		JCheckBox cbP = new JCheckBox("");
		cbP.setContentAreaFilled(false);
		cbP.setBounds(200, 249, 21, 40);
		cbP.setFocusable(false);
		add(cbP);
		
		JCheckBox cbS = new JCheckBox("");
		cbS.setContentAreaFilled(false);
		cbS.setBounds(200, 314, 28, 40);
		add(cbS);
		
		JCheckBox cbH = new JCheckBox("");
		cbH.setContentAreaFilled(false);
		cbH.setBounds(200, 378, 28, 40);
		add(cbH);
		
		JCheckBox cbGP = new JCheckBox("");
		cbGP.setContentAreaFilled(false);
		cbGP.setBounds(620, 249, 28, 40);
		add(cbGP);
		
		JCheckBox cbO = new JCheckBox("");
		cbO.setContentAreaFilled(false);
		cbO.setBounds(620, 314, 28, 40);
		add(cbO);
		
		JCheckBox cbM = new JCheckBox("");
		cbM.setContentAreaFilled(false);
		cbM.setBounds(620, 378, 28, 40);
		add(cbM);
		
		JCheckBox cbT = new JCheckBox("");
		cbT.setContentAreaFilled(false);
		cbT.setBounds(620, 439, 28, 40);
		add(cbT);
		
		JCheckBox cbPA = new JCheckBox("");
		cbPA.setContentAreaFilled(false);
		cbPA.setBounds(620, 500, 28, 40);
		add(cbPA);
		
		JButton btnATC = new JButton("ADD TO CART");
		btnATC.setFocusable(false);
		btnATC.setForeground(Color.WHITE);
		btnATC.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnATC.setBorderPainted(false);
		btnATC.setBackground(Color.RED);
		btnATC.setBounds(867, 600, 201, 40);
		add(btnATC);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFocusable(false);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(40, 600, 201, 40);
		add(btnBack);

	}
}
