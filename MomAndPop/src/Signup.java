import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Signup {

	private JFrame frame;
	private JTextField emailTxt;
	private JTextField passwordTxt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
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
		panel.setBounds(136, 0, 1098, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSignup = new JLabel("SIGN UP");
		lblSignup.setBounds(390, 68, 317, 80);
		panel.add(lblSignup);
		lblSignup.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 70));
		lblSignup.setHorizontalAlignment(JLabel.CENTER);
		
		emailTxt = new JTextField();
		emailTxt.setBorder(new LineBorder(Color.BLACK));
		emailTxt.setBounds(630, 335, 317, 36);
		panel.add(emailTxt);
		emailTxt.setColumns(10);
		
		passwordTxt = new JTextField();
		passwordTxt.setBorder(new LineBorder(Color.BLACK));
		passwordTxt.setColumns(10);
		passwordTxt.setBounds(630, 228, 317, 36);
		panel.add(passwordTxt);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblEmail.setBounds(640, 275, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPassword.setBounds(640, 377, 93, 14);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new LineBorder(Color.BLACK));
		textField.setBounds(144, 228, 317, 36);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.BLACK));
		textField_1.setBounds(144, 335, 317, 36);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(Color.BLACK));
		textField_2.setBounds(144, 422, 317, 36);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(Color.BLACK));
		textField_3.setBounds(630, 422, 317, 36);
		panel.add(textField_3);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblConfirmPassword.setBounds(640, 469, 98, 14);
		panel.add(lblConfirmPassword);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblFirstName.setBounds(164, 277, 66, 14);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblLastName.setBounds(154, 378, 76, 14);
		panel.add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblPhoneNumber.setBounds(154, 469, 98, 14);
		panel.add(lblPhoneNumber);

	}

}
