import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class toppings extends JPanel {

	/**
	 * Create the panel.
	 */
	public toppings() {
		setLayout(null);
		setBounds(0,0, 1108, 671);
		
		JLabel lblPA = new JLabel("Pineapple");
		lblPA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPA.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblPA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPA.setAlignmentY(0.0f);
		lblPA.setBounds(654, 500, 219, 40);
		add(lblPA);
		
		JLabel lblT = new JLabel("Tomatoes");
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		lblT.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblT.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblT.setAlignmentY(0.0f);
		lblT.setBounds(654, 439, 219, 40);
		add(lblT);
		
		JLabel lblM = new JLabel("Mushrooms");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblM.setAlignmentY(0.0f);
		lblM.setBounds(654, 378, 219, 40);
		add(lblM);
		
		JLabel lblO = new JLabel("Onions");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblO.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblO.setAlignmentY(0.0f);
		lblO.setBounds(654, 314, 219, 40);
		add(lblO);
		
		JLabel lblGP = new JLabel("Green Peppers");
		lblGP.setHorizontalAlignment(SwingConstants.CENTER);
		lblGP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblGP.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
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
		lblMeats.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblMeats.setBounds(234, 198, 219, 48);
		add(lblMeats);
		
		JLabel lblVeggies = new JLabel("Veggies");
		lblVeggies.setHorizontalAlignment(SwingConstants.CENTER);
		lblVeggies.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblVeggies.setBounds(654, 198, 219, 48);
		add(lblVeggies);
		
		JLabel lblP = new JLabel("Pepperoni");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblP.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblP.setAlignmentY(0.0f);
		lblP.setBounds(234, 249, 219, 40);
		add(lblP);
		
		JLabel lblS = new JLabel("Sausage");
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblS.setAlignmentY(0.0f);
		lblS.setBounds(234, 314, 219, 40);
		add(lblS);
		
		JLabel lblH = new JLabel("Ham");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblH.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblH.setAlignmentY(0.0f);
		lblH.setBounds(234, 378, 219, 40);
		add(lblH);
		
		JCheckBox cbP = new JCheckBox("");
		cbP.setBounds(200, 249, 28, 40);
		add(cbP);
		
		JCheckBox cbS = new JCheckBox("");
		cbS.setBounds(200, 314, 28, 40);
		add(cbS);
		
		JCheckBox cbH = new JCheckBox("");
		cbH.setBounds(200, 378, 28, 40);
		add(cbH);
		
		JCheckBox cbGP = new JCheckBox("");
		cbGP.setBounds(620, 249, 28, 40);
		add(cbGP);
		
		JCheckBox cbO = new JCheckBox("");
		cbO.setBounds(620, 314, 28, 40);
		add(cbO);
		
		JCheckBox cbM = new JCheckBox("");
		cbM.setBounds(620, 378, 28, 40);
		add(cbM);
		
		JCheckBox cbT = new JCheckBox("");
		cbT.setBounds(620, 439, 28, 40);
		add(cbT);
		
		JCheckBox cbPA = new JCheckBox("");
		cbPA.setBounds(620, 500, 28, 40);
		add(cbPA);
		
		JButton btnATC = new JButton("ADD TO CART");
		btnATC.setFocusable(false);
		btnATC.setForeground(Color.WHITE);
		btnATC.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnATC.setBorderPainted(false);
		btnATC.setBackground(Color.RED);
		btnATC.setBounds(820, 585, 201, 40);
		add(btnATC);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFocusable(false);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(91, 585, 201, 40);
		add(btnBack);

	}

}
