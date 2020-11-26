import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel panel;
	private JTextField txtFN;
	private JTextField txtLN;
	private JTextField txtPN;
	private JTextField txtCP;
	private JTextField txtP;
	private JTextField txtE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		getContentPane().setBackground(Color.RED);
		setBackground(Color.red);
		setBounds(100, 100, 1250, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Mom and Pop Pizzeria");
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(SignUp.class.getResource("/imgs/mom&poplogoresized.png")));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(0, 0, 136, 124);
		getContentPane().add(logo);
		
		panel = new JPanel();
		panel.setBounds(136, 0, 1098, 661);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JLabel lblSignup = new JLabel("SIGN UP");
		lblSignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignup.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 70));
		lblSignup.setBounds(390, 71, 317, 80);
		panel.add(lblSignup);
		
		txtFN = new JTextField();
		txtFN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFN.setColumns(10);
		txtFN.setBorder(new LineBorder(Color.BLACK));
		txtFN.setBounds(144, 231, 317, 36);
		panel.add(txtFN);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblFirstName.setBounds(154, 278, 98, 14);
		panel.add(lblFirstName);
		
		txtLN = new JTextField();
		txtLN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLN.setColumns(10);
		txtLN.setBorder(new LineBorder(Color.BLACK));
		txtLN.setBounds(144, 338, 317, 36);
		panel.add(txtLN);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblLastName.setBounds(154, 381, 76, 14);
		panel.add(lblLastName);
		
		txtPN = new JTextField();
		txtPN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPN.setColumns(10);
		txtPN.setBorder(new LineBorder(Color.BLACK));
		txtPN.setBounds(144, 435, 317, 36);
		panel.add(txtPN);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblPhoneNumber.setBounds(154, 482, 148, 14);
		panel.add(lblPhoneNumber);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnSignUp.setFocusable(false);
		btnSignUp.setBorderPainted(false);
		btnSignUp.setBackground(Color.RED);
		btnSignUp.setBounds(480, 530, 137, 36);
		panel.add(btnSignUp);
		
		txtCP = new JTextField();
		txtCP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCP.setColumns(10);
		txtCP.setBorder(new LineBorder(Color.BLACK));
		txtCP.setBounds(630, 435, 317, 36);
		panel.add(txtCP);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblConfirmPassword.setBounds(640, 482, 148, 14);
		panel.add(lblConfirmPassword);
		
		txtP = new JTextField();
		txtP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtP.setColumns(10);
		txtP.setBorder(new LineBorder(Color.BLACK));
		txtP.setBounds(630, 338, 317, 36);
		panel.add(txtP);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblPassword.setBounds(640, 380, 93, 14);
		panel.add(lblPassword);
		
		txtE = new JTextField();
		txtE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtE.setColumns(10);
		txtE.setBorder(new LineBorder(Color.BLACK));
		txtE.setBounds(630, 231, 317, 36);
		panel.add(txtE);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblEmail.setBounds(640, 278, 46, 14);
		panel.add(lblEmail);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(SignUp.class.getResource("/imgs/logobackground.png")));
		logo_1.setHorizontalAlignment(SwingConstants.CENTER);
		logo_1.setBounds(0, 0, 136, 146);
		getContentPane().add(logo_1);
		
		//Action when SignUp button is pressed
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnSignUp) {
					Menu m = new Menu();
					m.setVisible(true);
					dispose();
				}
			}
		});
		
	}
}
