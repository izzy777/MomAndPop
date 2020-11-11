import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class login {

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
					login window = new login();
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
	public login() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(136, 0, 1098, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(442, 79, 214, 80);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 70));
		lblLogin.setHorizontalAlignment(JLabel.CENTER);
		
		emailTxt = new JTextField();
		emailTxt.setBorder(new LineBorder(Color.BLACK));
		emailTxt.setBounds(390, 313, 317, 36);
		panel.add(emailTxt);
		emailTxt.setColumns(10);
		
		passwordTxt = new JTextField();
		passwordTxt.setBorder(new LineBorder(Color.BLACK));
		passwordTxt.setColumns(10);
		passwordTxt.setBounds(390, 228, 317, 36);
		panel.add(passwordTxt);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblEmail.setBounds(400, 275, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPassword.setBounds(400, 360, 93, 14);
		panel.add(lblPassword);
	}
}
