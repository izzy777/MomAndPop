import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Topping {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Topping window = new Topping();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Topping() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 1250, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBackground(Color.RED);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(136, 0, 1098, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTopping = new JLabel("Toppings");
		lblTopping.setBounds(390, 68, 317, 80);
		panel.add(lblTopping);
		lblTopping.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 70));
		lblTopping.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel lblNewLabel = new JLabel("Meats");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblNewLabel.setBounds(256, 188, 199, 48);
		panel.add(lblNewLabel);
		
		JLabel lblVeggies = new JLabel("Veggies");
		lblVeggies.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblVeggies.setBounds(626, 188, 199, 48);
		panel.add(lblVeggies);
		
		JLabel lblNewLabel_1 = new JLabel("Pepperni");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(198, 255, 219, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sausage");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_1.setAlignmentY(0.0f);
		lblNewLabel_1_1.setBounds(198, 320, 219, 40);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ham");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setAlignmentY(0.0f);
		lblNewLabel_1_1_1.setBounds(198, 384, 219, 40);
		panel.add(lblNewLabel_1_1_1);
		
		JCheckBox PepperoniChkBox = new JCheckBox("");
		PepperoniChkBox.setBounds(164, 255, 28, 40);
		panel.add(PepperoniChkBox);
		
		JCheckBox SausageChkBox_1 = new JCheckBox("");
		SausageChkBox_1.setBounds(164, 320, 28, 40);
		panel.add(SausageChkBox_1);
		
		JCheckBox HamChkBox_2 = new JCheckBox("");
		HamChkBox_2.setBounds(164, 384, 28, 40);
		panel.add(HamChkBox_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Green Peppers");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_2.setAlignmentY(0.0f);
		lblNewLabel_1_2.setBounds(618, 247, 219, 40);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Onions");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_3.setAlignmentY(0.0f);
		lblNewLabel_1_3.setBounds(618, 320, 219, 40);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Mushrooms");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_4.setAlignmentY(0.0f);
		lblNewLabel_1_4.setBounds(618, 384, 219, 40);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Tomatoes");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_5.setAlignmentY(0.0f);
		lblNewLabel_1_5.setBounds(618, 445, 219, 40);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Pineapple");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_6.setAlignmentY(0.0f);
		lblNewLabel_1_6.setBounds(618, 506, 219, 40);
		panel.add(lblNewLabel_1_6);
		
		JCheckBox PeppersChkBox_2_1 = new JCheckBox("");
		PeppersChkBox_2_1.setBounds(584, 247, 28, 40);
		panel.add(PeppersChkBox_2_1);
		
		JCheckBox OnionChkBox_2_1_1 = new JCheckBox("");
		OnionChkBox_2_1_1.setBounds(584, 320, 28, 40);
		panel.add(OnionChkBox_2_1_1);
		
		JCheckBox MushroomChkBox_2_1_2 = new JCheckBox("");
		MushroomChkBox_2_1_2.setBounds(584, 384, 28, 40);
		panel.add(MushroomChkBox_2_1_2);
		
		JCheckBox tomatoesChkBox_2_1_3 = new JCheckBox("");
		tomatoesChkBox_2_1_3.setBounds(584, 445, 28, 40);
		panel.add(tomatoesChkBox_2_1_3);
		
		JCheckBox PineappleChkBox_2_1_4 = new JCheckBox("");
		PineappleChkBox_2_1_4.setBounds(584, 506, 28, 40);
		panel.add(PineappleChkBox_2_1_4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Back");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1.setAlignmentY(0.0f);
		lblNewLabel_1_1_1_1.setBounds(26, 576, 219, 40);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Add To Cart");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		lblNewLabel_1_1_1_2.setAlignmentY(0.0f);
		lblNewLabel_1_1_1_2.setBounds(778, 576, 219, 40);
		panel.add(lblNewLabel_1_1_1_2);

	}
}
