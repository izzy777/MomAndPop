import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.Component;

public class menu {

	private JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
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
	public menu() {
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
		panel.setBorder(null);
		panel.setBounds(136, 0, 1108, 671);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A CATEGORY ON THE LEFT TO GET STARTED");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 274, 1108, 123);
		panel.add(lblNewLabel);
		
		JButton btnPizza = new JButton("Pizza");
		
		btnPizza.setRequestFocusEnabled(false);
		btnPizza.setForeground(Color.WHITE);
		btnPizza.setBackground(Color.RED);
		btnPizza.setBorderPainted(false);
		btnPizza.setFocusable(false);
		btnPizza.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnPizza.setBounds(0, 198, 136, 39);
		btnPizza.setIcon(new ImageIcon(this.getClass().getResource("pizza.png")));
		frame.getContentPane().add(btnPizza);
		
		JButton btnSides = new JButton("Sides");
		btnSides.setForeground(Color.WHITE);
		btnSides.setRequestFocusEnabled(false);
		btnSides.setBackground(Color.RED);
		btnSides.setBorderPainted(false);
		btnSides.setFocusable(false);
		btnSides.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnSides.setBounds(0, 248, 136, 39);
		btnSides.setIcon(new ImageIcon(this.getClass().getResource("sides.png")));
		frame.getContentPane().add(btnSides);
		
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.setForeground(Color.WHITE);
		btnDrinks.setRequestFocusEnabled(false);
		btnDrinks.setBackground(Color.RED);
		btnDrinks.setBorderPainted(false);
		btnDrinks.setFocusable(false);
		btnDrinks.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnDrinks.setBounds(0, 298, 136, 39);
		btnDrinks.setIcon(new ImageIcon(this.getClass().getResource("drinks.png")));
		frame.getContentPane().add(btnDrinks);
		
		JButton btnCheckout = new JButton();
		btnCheckout.setFocusable(false);
		btnCheckout.setRequestFocusEnabled(false);
		btnCheckout.setBorder(null);
		btnCheckout.setBorderPainted(false);
		btnCheckout.setBackground(Color.RED);
		btnCheckout.setBounds(0, 609, 136, 51);
		btnCheckout.setIcon(new ImageIcon(this.getClass().getResource("cart.png")));
		frame.getContentPane().add(btnCheckout);
		
		// Changes the color of selected.
		//If Pizza was click
		btnPizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnPizza.setBackground(Color.decode("#FF3030"));
				btnSides.setBackground(Color.red);
				btnDrinks.setBackground(Color.red);
				btnCheckout.setBackground(Color.red);
			}
		});
		//If Sides was clicked
		btnSides.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnSides.setBackground(Color.decode("#FF3030"));
				btnPizza.setBackground(Color.red);
				btnDrinks.setBackground(Color.red);
				btnCheckout.setBackground(Color.red);
			}
		});
		//If Drinks was clicked
		btnDrinks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnDrinks.setBackground(Color.decode("#FF3030"));
				btnSides.setBackground(Color.red);
				btnPizza.setBackground(Color.red);
				btnCheckout.setBackground(Color.red);
			}
		});
		//If Checkout was clicked
		btnCheckout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnCheckout.setBackground(Color.decode("#FF3030"));
				btnSides.setBackground(Color.red);
				btnDrinks.setBackground(Color.red);
				btnPizza.setBackground(Color.red);
			}
		});
		
	}
}
