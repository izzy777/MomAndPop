import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	private JFrame frame;
	private JTextField emailTxt;
	private JTextField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		panel.setBounds(136, 0, 1108, 671);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(395, 79, 317, 80);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 70));
		lblLogin.setHorizontalAlignment(JLabel.CENTER);
		
		emailTxt = new JTextField();
		emailTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emailTxt.setBorder(new LineBorder(Color.BLACK));
		emailTxt.setBounds(395, 313, 317, 36);
		panel.add(emailTxt);
		emailTxt.setColumns(10);
		
		passwordTxt = new JTextField();
		passwordTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordTxt.setBorder(new LineBorder(Color.BLACK));
		passwordTxt.setColumns(10);
		passwordTxt.setBounds(395, 228, 317, 36);
		panel.add(passwordTxt);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblEmail.setBounds(400, 275, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblPassword.setBounds(400, 360, 93, 14);
		panel.add(lblPassword);
		
		//Login button
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(Color.RED);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(395, 398, 137, 36);
		btnLogin.setFocusable(false);
		panel.add(btnLogin);
		
		//Sign up button
		JButton btnSignUp = new JButton("Sign Up");

		btnSignUp.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnSignUp.setBorderPainted(false);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(Color.RED);
		btnSignUp.setBounds(575, 398, 137, 36);
		btnSignUp.setFocusable(false);
		panel.add(btnSignUp);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(Login.class.getResource("/imgs/mom&poplogoresized.png")));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(0, 0, 136, 124);
		frame.getContentPane().add(logo);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(Login.class.getResource("/imgs/logobackground.png")));
		logo_1.setHorizontalAlignment(SwingConstants.CENTER);
		logo_1.setBounds(0, 0, 136, 141);
		frame.getContentPane().add(logo_1);
		
		//Action when Signup button is pressed
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnSignUp) {
					SignUp su = new SignUp();
					su.setVisible(true);
					frame.dispose();
				}
					
			}
		});
		
		//Action when Login button is pressed
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnLogin) {
					Menu m = new Menu();
					m.setVisible(true);
					frame.dispose();
				}
					
			}
		});
	}
}
