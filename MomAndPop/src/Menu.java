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
import javax.swing.JComboBox;

public class Menu {

	private JFrame frmMomAndPop;
	PizzaType pizzaTypePnl;
	Toppings topPnl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMomAndPop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame of main menu
		frmMomAndPop = new JFrame();
		frmMomAndPop.setTitle("Mom and Pop Pizzeria");
		frmMomAndPop.getContentPane().setBackground(Color.RED);
		frmMomAndPop.setBounds(100, 100, 1250, 700);
		frmMomAndPop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMomAndPop.getContentPane().setLayout(null);
		frmMomAndPop.setBackground(Color.RED);
		frmMomAndPop.setResizable(false);
		
		//main menu panel
		JPanel menu = new JPanel();
		menu.setBorder(null);
		menu.setBounds(136, 0, 1108, 671);
		frmMomAndPop.getContentPane().add(menu);
		menu.setLayout(null);
		
		//PizzaType Next Button
		JButton btnNext = new JButton("NEXT");
		btnNext.setVisible(false);
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnNext.setFocusable(false);
		btnNext.setBorderPainted(false);
		btnNext.setBackground(Color.RED);
		btnNext.setBounds(867, 600, 201, 40);
		
		JLabel menuTxt = new JLabel("CHOOSE A CATEGORY ON THE LEFT TO GET STARTED");
		menuTxt.setVisible(true);
		menuTxt.setFont(new Font("Nirmala UI", Font.BOLD, 33));
		menuTxt.setHorizontalAlignment(SwingConstants.CENTER);
		menuTxt.setBounds(0, 274, 1108, 123);
		menu.add(menuTxt);
		
		//Add to Cart Button on Toppings Page
		JButton btnATC = new JButton("ADD TO CART");
		btnATC.setVisible(false);
		btnATC.setForeground(Color.WHITE);
		btnATC.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnATC.setFocusable(false);
		btnATC.setBorderPainted(false);
		btnATC.setBackground(Color.RED);
		btnATC.setBounds(867, 600, 201, 40);
		
		//Back Button on Pizza Type Page
		JButton btnPTBack = new JButton("BACK");
		btnPTBack.setVisible(false);
		btnPTBack.setForeground(Color.WHITE);
		btnPTBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPTBack.setFocusable(false);
		btnPTBack.setBorderPainted(false);
		btnPTBack.setBackground(Color.RED);
		btnPTBack.setBounds(37, 600, 201, 40);

		
		JButton btnPizza = new JButton("Pizza");
		btnPizza.setIcon(new ImageIcon(Menu.class.getResource("/imgs/pizza.png")));
		btnPizza.setRequestFocusEnabled(false);
		btnPizza.setForeground(Color.WHITE);
		btnPizza.setBackground(Color.RED);
		btnPizza.setBorderPainted(false);
		btnPizza.setFocusable(false);
		btnPizza.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnPizza.setBounds(0, 198, 136, 39);

		frmMomAndPop.getContentPane().add(btnPizza);
		
		JButton btnSides = new JButton("Sides");
		btnSides.setIcon(new ImageIcon(Menu.class.getResource("/imgs/sides.png")));
		btnSides.setForeground(Color.WHITE);
		btnSides.setRequestFocusEnabled(false);
		btnSides.setBackground(Color.RED);
		btnSides.setBorderPainted(false);
		btnSides.setFocusable(false);
		btnSides.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnSides.setBounds(0, 248, 136, 39);
		frmMomAndPop.getContentPane().add(btnSides);
		
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.setIcon(new ImageIcon(Menu.class.getResource("/imgs/drinks.png")));
		btnDrinks.setForeground(Color.WHITE);
		btnDrinks.setRequestFocusEnabled(false);
		btnDrinks.setBackground(Color.RED);
		btnDrinks.setBorderPainted(false);
		btnDrinks.setFocusable(false);
		btnDrinks.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnDrinks.setBounds(0, 298, 136, 39);
		frmMomAndPop.getContentPane().add(btnDrinks);
		
		JButton btnCheckout = new JButton();
		btnCheckout.setIcon(new ImageIcon(Menu.class.getResource("/imgs/cart.png")));
		btnCheckout.setFocusable(false);
		btnCheckout.setRequestFocusEnabled(false);
		btnCheckout.setBorder(null);
		btnCheckout.setBorderPainted(false);
		btnCheckout.setBackground(Color.RED);
		btnCheckout.setBounds(0, 609, 136, 62);
		frmMomAndPop.getContentPane().add(btnCheckout);
		
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon(Menu.class.getResource("/imgs/logo.png")));
		logo.setBounds(0, 0, 136, 124);
		frmMomAndPop.getContentPane().add(logo);
		
		//These are pages
		//Pizza Type: Size, Crust, Sauce, Cheese
		pizzaTypePnl = new PizzaType();
		pizzaTypePnl.setBounds(136, 0, 1108, 671);
		pizzaTypePnl.add(btnNext);
		frmMomAndPop.getContentPane().add(pizzaTypePnl);
		
		//Toppings: Meats and Veggies
		topPnl = new Toppings();
		topPnl.setVisible(false);
		topPnl.setBounds(136, 0, 1108, 671);
		topPnl.add(btnATC);
		topPnl.add(btnPTBack);
		frmMomAndPop.getContentPane().add(topPnl);
		

		//PizzaType Next Button
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				topPnl.setVisible(true);
				pizzaTypePnl.setVisible(false);
				btnPTBack.setVisible(true);
				btnATC.setVisible(true);
			}
		});
		
		//Back Button on Pizza Topping Page Method
		btnPTBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				pizzaTypePnl.setVisible(true);
				topPnl.setVisible(false);
				
			}
		});
		
		//If Pizza was click
		btnPizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//Change/reset colors
				btnPizza.setBackground(Color.decode("#FF3030"));
				btnSides.setBackground(Color.red);
				btnDrinks.setBackground(Color.red);
				btnCheckout.setBackground(Color.red);
				
				//shows toppings
				pizzaTypePnl.setVisible(true);
				btnNext.setVisible(true);
				menu.setVisible(false);
			}
		});
		//If Sides was clicked
		btnSides.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				btnSides.setBackground(Color.decode("#FF3030"));
				btnPizza.setBackground(Color.red);
				btnDrinks.setBackground(Color.red);
				btnCheckout.setBackground(Color.red);
			}
		});
		//If Drinks was clicked
		btnDrinks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				btnDrinks.setBackground(Color.decode("#FF3030"));
				btnSides.setBackground(Color.red);
				btnPizza.setBackground(Color.red);
				btnCheckout.setBackground(Color.red);
			}
		});
		//If Checkout was clicked
		btnCheckout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				btnCheckout.setBackground(Color.decode("#FF3030"));
				btnSides.setBackground(Color.red);
				btnDrinks.setBackground(Color.red);
				btnPizza.setBackground(Color.red);
			}
		});
		
	}
	
	public void addPanel(JPanel a) {
		frmMomAndPop.getContentPane().add(a);
	}
}
