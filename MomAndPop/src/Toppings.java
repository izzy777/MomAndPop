import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Toppings extends JPanel {
	int toppingNum;
	JCheckBox cbP;
	JCheckBox cbS;
	JCheckBox cbH;
	JCheckBox cbGP;
	JCheckBox cbO;
	JCheckBox cbM;
	JCheckBox cbT;
	JCheckBox cbPA;
	String desc = ", ";
	/**
	 * Create the panel.
	 */
	public Toppings() {
		setBackground(SystemColor.control);
		setLayout(null);
		setBounds(136, 0, 1108, 671);
		setVisible(false);
		
		JLabel lblPA = new JLabel("Pineapple");
		lblPA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPA.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblPA.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblPA.setAlignmentY(0.0f);
		lblPA.setBounds(654, 500, 219, 50);
		add(lblPA);
		
		JLabel lblT = new JLabel("Tomatoes");
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		lblT.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblT.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblT.setAlignmentY(0.0f);
		lblT.setBounds(654, 439, 219, 50);
		add(lblT);
		
		JLabel lblM = new JLabel("Mushrooms");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblM.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblM.setAlignmentY(0.0f);
		lblM.setBounds(654, 378, 219, 50);
		add(lblM);
		
		JLabel lblO = new JLabel("Onions");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblO.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblO.setAlignmentY(0.0f);
		lblO.setBounds(654, 314, 219, 50);
		add(lblO);
		
		JLabel lblGP = new JLabel("Green Peppers");
		lblGP.setHorizontalAlignment(SwingConstants.CENTER);
		lblGP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblGP.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblGP.setAlignmentY(0.0f);
		lblGP.setBounds(654, 249, 219, 50);
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
		
		JLabel lblS = new JLabel("Sausage");
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblS.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblS.setAlignmentY(0.0f);
		lblS.setBounds(234, 314, 219, 50);
		add(lblS);
		
		JLabel lblH = new JLabel("Ham");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblH.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblH.setAlignmentY(0.0f);
		lblH.setBounds(234, 378, 219, 50);
		add(lblH);
		
		cbP = new JCheckBox("");
		cbP.setContentAreaFilled(false);
		cbP.setBounds(200, 254, 21, 40);
		cbP.setFocusable(false);
		add(cbP);
		
		cbS = new JCheckBox("");
		cbS.setContentAreaFilled(false);
		cbS.setBounds(200, 319, 28, 40);
		add(cbS);
		
		cbH = new JCheckBox("");
		cbH.setContentAreaFilled(false);
		cbH.setBounds(200, 383, 28, 40);
		add(cbH);
		
		cbGP = new JCheckBox("");
		cbGP.setContentAreaFilled(false);
		cbGP.setBounds(620, 254, 28, 40);
		add(cbGP);
		
		cbO = new JCheckBox("");
		cbO.setContentAreaFilled(false);
		cbO.setBounds(620, 319, 28, 40);
		add(cbO);
		
		cbM = new JCheckBox("");
		cbM.setContentAreaFilled(false);
		cbM.setBounds(620, 383, 28, 40);
		add(cbM);
		
		cbT = new JCheckBox("");
		cbT.setContentAreaFilled(false);
		cbT.setBounds(620, 444, 28, 40);
		add(cbT);
		
		cbPA = new JCheckBox("");
		cbPA.setContentAreaFilled(false);
		cbPA.setBounds(620, 505, 28, 40);
		add(cbPA);
		
		JLabel lblFirstTopping = new JLabel("First Topping Free");
		lblFirstTopping.setForeground(Color.RED);
		lblFirstTopping.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstTopping.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 25));
		lblFirstTopping.setBounds(10, 74, 1088, 130);
		add(lblFirstTopping);
		
		JLabel lblP = new JLabel("Pepperoni");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblP.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		lblP.setAlignmentY(0.0f);
		lblP.setBounds(234, 249, 219, 50);
		add(lblP);
		
		

	}
	public int toppingCount() {
		int top = -1;
		if (cbP.isSelected() == true) top++;
		if (cbS.isSelected() == true) top++;
		if (cbH.isSelected() == true) top++;
		if (cbGP.isSelected() == true) top++;
		if (cbO.isSelected() == true) top++;
		if (cbM.isSelected() == true) top++;
		if (cbT.isSelected() == true) top++;
		if (cbPA.isSelected() == true) top++;
		
		return top;
	}
	public void clearTop() {
		cbP.setSelected(false);
		cbS.setSelected(false);
		cbH.setSelected(false);
		cbGP.setSelected(false);
		cbO.setSelected(false);
		cbM.setSelected(false);
		cbT.setSelected(false);
		cbPA.setSelected(false);
	}
	
	public String desc() {
		if (cbP.isSelected() == true) {
			desc += "Pepperoni, ";
		}
		if (cbS.isSelected() == true) {
			desc += "Sausage, ";
		}
		if (cbH.isSelected() == true) {
			desc += "Ham, ";
		}
		if (cbGP.isSelected() == true) {
			desc += "Green Peppers, ";		
		}
		if (cbO.isSelected() == true) {
			desc += "Onions, ";
		}
		if (cbM.isSelected() == true) {
			desc += "Mushrooms, ";
		}
		if (cbT.isSelected() == true) {
			desc += "Tomatoes, ";
		}
		if (cbPA.isSelected() == true) {
			desc += "Pineapples, ";
		}
		return desc;
	}
}
