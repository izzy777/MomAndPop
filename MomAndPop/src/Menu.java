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

public class Menu extends JFrame {

	PizzaType pizzaTypePnl;
	Toppings topPnl;
	Sides side;
	Drinks drinks;
	ReviewCart cart;
	ContactInfo ci;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the frame.
	 */
	public Menu() {
		//frame of main menu
		setTitle("Mom and Pop Pizzeria");
		getContentPane().setBackground(Color.RED);
		setBounds(100, 100, 1250, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBackground(Color.RED);
		setResizable(false);
		
		//main menu panel
		JPanel menu = new JPanel();
		menu.setBackground(new Color(250, 235, 215));
		menu.setBorder(null);
		menu.setBounds(136, 0, 1108, 671);
		getContentPane().add(menu);
		menu.setLayout(null);
		
		//PizzaType Next Button
		JButton btnNext = new JButton("NEXT");
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnNext.setFocusable(false);
		btnNext.setBorderPainted(false);
		btnNext.setBackground(Color.RED);
		btnNext.setBounds(867, 600, 201, 40);
		
		JLabel menuTxt = new JLabel("CHOOSE A CATEGORY ON THE LEFT TO GET STARTED");
		menuTxt.setFont(new Font("Nirmala UI", Font.BOLD, 33));
		menuTxt.setHorizontalAlignment(SwingConstants.CENTER);
		menuTxt.setBounds(0, 274, 1108, 123);
		menu.add(menuTxt);
		
		//Delivery Button on Contact Info
		JButton btnDelivery = new JButton("Delivery");
		btnDelivery.setForeground(Color.WHITE);
		btnDelivery.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnDelivery.setFocusable(false);
		btnDelivery.setBorderPainted(false);
		btnDelivery.setBackground(Color.RED);
		btnDelivery.setBounds(867, 600, 201, 40);
		
		//Pick Up Button on Contact Info
		JButton btnPickup = new JButton("Pickup");
		btnPickup.setForeground(Color.WHITE);
		btnPickup.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPickup.setFocusable(false);
		btnPickup.setBorderPainted(false);
		btnPickup.setBackground(Color.RED);
		btnPickup.setBounds(453, 600, 201, 40);
		
		//Back Button on Contact Info
		JButton btnCIBack = new JButton("Back");
		btnCIBack.setForeground(Color.WHITE);
		btnCIBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnCIBack.setFocusable(false);
		btnCIBack.setBorderPainted(false);
		btnCIBack.setBackground(Color.RED);
		btnCIBack.setBounds(37, 600, 201, 40);
		
		//Add to Cart Button on Toppings Page
		JButton btnATC = new JButton("ADD TO CART");
		btnATC.setForeground(Color.WHITE);
		btnATC.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnATC.setFocusable(false);
		btnATC.setBorderPainted(false);
		btnATC.setBackground(Color.RED);
		btnATC.setBounds(867, 600, 201, 40);
		
		//Add to Cart Button on Sides Page
		JButton btnSATC = new JButton("ADD TO CART");
		btnSATC.setForeground(Color.WHITE);
		btnSATC.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnSATC.setFocusable(false);
		btnSATC.setBorderPainted(false);
		btnSATC.setBackground(Color.RED);
		btnSATC.setBounds(867, 600, 201, 40);
		
		//Continue Button for Review Cart Page
		JButton btnContinue = new JButton("Continue");
		btnContinue.setForeground(Color.WHITE);
		btnContinue.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnContinue.setFocusable(false);
		btnContinue.setBorderPainted(false);
		btnContinue.setBackground(Color.RED);
		btnContinue.setBounds(867, 600, 201, 40);
		
		//Back Button on Pizza Type Page
		JButton btnPTBack = new JButton("BACK");
		btnPTBack.setForeground(Color.WHITE);
		btnPTBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPTBack.setFocusable(false);
		btnPTBack.setBorderPainted(false);
		btnPTBack.setBackground(Color.RED);
		btnPTBack.setBounds(37, 600, 201, 40);

		//Pizza Side Button
		JButton btnPizza = new JButton("Pizza");
		btnPizza.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnPizza.setIcon(new ImageIcon(Menu.class.getResource("/imgs/pizza.png")));
		btnPizza.setRequestFocusEnabled(false);
		btnPizza.setForeground(Color.WHITE);
		btnPizza.setBackground(Color.RED);
		btnPizza.setBorderPainted(false);
		btnPizza.setFocusable(false);
		btnPizza.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnPizza.setBounds(0, 198, 136, 39);
		getContentPane().add(btnPizza);
		
		//Sides Side Button
		JButton btnSides = new JButton("Sides");
		btnSides.setIcon(new ImageIcon(Menu.class.getResource("/imgs/sides.png")));
		btnSides.setForeground(Color.WHITE);
		btnSides.setRequestFocusEnabled(false);
		btnSides.setBackground(Color.RED);
		btnSides.setBorderPainted(false);
		btnSides.setFocusable(false);
		btnSides.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnSides.setBounds(0, 248, 136, 39);
		getContentPane().add(btnSides);
		
		//Drinks Side Button
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.setIcon(new ImageIcon(Menu.class.getResource("/imgs/drinks.png")));
		btnDrinks.setForeground(Color.WHITE);
		btnDrinks.setRequestFocusEnabled(false);
		btnDrinks.setBackground(Color.RED);
		btnDrinks.setBorderPainted(false);
		btnDrinks.setFocusable(false);
		btnDrinks.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnDrinks.setBounds(0, 298, 136, 39);
		getContentPane().add(btnDrinks);
		
		//Checkout Bottom Left Button
		JButton btnCheckout = new JButton();
		btnCheckout.setIcon(new ImageIcon(Menu.class.getResource("/imgs/cart.png")));
		btnCheckout.setFocusable(false);
		btnCheckout.setRequestFocusEnabled(false);
		btnCheckout.setBorder(null);
		btnCheckout.setBorderPainted(false);
		btnCheckout.setBackground(Color.RED);
		btnCheckout.setBounds(0, 609, 136, 62);
		getContentPane().add(btnCheckout);
		
		//Logo
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon(Menu.class.getResource("/imgs/logo.png")));
		logo.setBounds(0, 0, 136, 124);
		getContentPane().add(logo);
		
		//These are pages
		//Pizza Type: Size, Crust, Sauce, Cheese
		pizzaTypePnl = new PizzaType();
		pizzaTypePnl.setBounds(136, 0, 1108, 671);
		pizzaTypePnl.add(btnNext);
		getContentPane().add(pizzaTypePnl);		
		
		//Toppings: Meats and Veggies
		topPnl = new Toppings();
		topPnl.setVisible(false);
		topPnl.setBounds(136, 0, 1108, 671);
		topPnl.add(btnATC);
		topPnl.add(btnPTBack);
		getContentPane().add(topPnl);
		
		//Sides
		side = new Sides();
		side.setVisible(false);
		side.setBounds(136, 0, 1108, 671);
		side.add(btnSATC);
		getContentPane().add(side);
		
		//Drinks
		drinks = new Drinks();
		drinks.setVisible(false);
		drinks.setBounds(136, 0, 1108, 671);
		getContentPane().add(drinks);
		
		//Cart
		cart = new ReviewCart();
		cart.setVisible(false);
		cart.setBounds(136, 0, 1108, 671);
		cart.add(btnContinue);
		getContentPane().add(cart);
		
		//Contact Information
		ci = new ContactInfo();
		ci.setVisible(false);
		ci.setBounds(136, 0, 1108, 671);
		ci.add(btnCIBack);
		ci.add(btnDelivery);
		ci.add(btnPickup);
		getContentPane().add(ci);

	
		//If Pizza was click
		btnPizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//Change/reset colors
				btnPizza.setBackground(Color.decode("#FF3030"));
				btnSides.setBackground(Color.red);
				btnDrinks.setBackground(Color.red);
				btnCheckout.setBackground(Color.red);
				
				//Shows toppings
				pizzaTypePnl.setVisible(true);
				menu.setVisible(false);
				side.setVisible(false);
				drinks.setVisible(false);
				cart.setVisible(false);
				topPnl.setVisible(false);
				ci.setVisible(false);
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
				
				//Shows sides
				side.setVisible(true);
				pizzaTypePnl.setVisible(false);
				menu.setVisible(false);
				cart.setVisible(false);
				drinks.setVisible(false);
				topPnl.setVisible(false);
				ci.setVisible(false);
				
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
				
				//shows drinks
				drinks.setVisible(true);
				pizzaTypePnl.setVisible(false);
				menu.setVisible(false);
				side.setVisible(false);
				cart.setVisible(false);
				topPnl.setVisible(false);
				ci.setVisible(false);
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
				
				//shows cart page
				cart.setVisible(true);
				drinks.setVisible(false);
				pizzaTypePnl.setVisible(false);
				menu.setVisible(false);
				side.setVisible(false);
				topPnl.setVisible(false);
				ci.setVisible(false);
				
			}
		});	
		
		//PizzaType Next Button
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				topPnl.setVisible(true);
				pizzaTypePnl.setVisible(false);
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
		
		//Continue Button on Review Cart Page
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				ci.setVisible(true);
				cart.setVisible(false);
				
				
			}
		});
		
		//Back Button on Contact Information
		btnCIBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				ci.setVisible(false);
				cart.setVisible(true);
			}
		});
		
		//Add to Cart Button for Pizza
		btnATC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String desc = "Small";
				desc = desc + "hello";
				double base = pizzaTypePnl.base;
				double mul = pizzaTypePnl.multiplier;
				int top = topPnl.toppingCount();
				double price = mul * top + base;
				cart.model.addRow(new Object[] {"Pizza", desc, "1", price});
			}
		});
	}
}
