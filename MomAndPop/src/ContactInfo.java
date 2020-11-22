import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContactInfo extends JPanel {
	private JTextField tfFN;
	private JTextField tfLN;
	private JTextField tfE;
	private JTextField tfPN;
	private JTextField tfCardNum;
	private JTextField tfEM;
	private JTextField tfCVV;
	private JTextField tfEY;

	/**
	 * Create the panel.
	 */
	public ContactInfo() {
		setBackground(SystemColor.control);
		setBounds(136, 0, 1108, 671);
		setLayout(null);
		
		JLabel lblTitle = new JLabel("Contact Information");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblTitle.setBounds(373, 22, 361, 49);
		add(lblTitle);
		
		tfFN = new JTextField();
		tfFN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfFN.setColumns(10);
		tfFN.setBorder(new LineBorder(Color.BLACK));
		tfFN.setBounds(378, 82, 351, 36);
		add(tfFN);
		
		tfLN = new JTextField();
		tfLN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfLN.setColumns(10);
		tfLN.setBorder(new LineBorder(Color.BLACK));
		tfLN.setBounds(378, 154, 351, 36);
		add(tfLN);
		
		tfE = new JTextField();
		tfE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfE.setColumns(10);
		tfE.setBorder(new LineBorder(Color.BLACK));
		tfE.setBounds(378, 226, 351, 36);
		add(tfE);
		
		tfPN = new JTextField();
		tfPN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfPN.setColumns(10);
		tfPN.setBorder(new LineBorder(Color.BLACK));
		tfPN.setBounds(378, 298, 351, 36);
		add(tfPN);
		
		JLabel lblFN = new JLabel("First Name");
		lblFN.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblFN.setBounds(388, 129, 79, 14);
		add(lblFN);
		
		JLabel lblLS = new JLabel("Last Name");
		lblLS.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblLS.setBounds(388, 201, 79, 14);
		add(lblLS);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblEmail.setBounds(388, 273, 46, 14);
		add(lblEmail);
		
		JLabel lblPN = new JLabel("Phone Number");
		lblPN.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblPN.setBounds(388, 345, 121, 14);
		add(lblPN);
		
		JButton btnCC = new JButton("Cash/Check");
		btnCC.setFocusable(false);
		btnCC.setBounds(442, 370, 110, 36);
		add(btnCC);
		
		JButton btnC = new JButton("Card");
		btnC.setFocusable(false);
		btnC.setBounds(555, 370, 110, 36);
		add(btnC);
		
		JLabel lblPayment = new JLabel("Payment Information");
		lblPayment.setVisible(false);
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblPayment.setBounds(428, 411, 251, 27);
		add(lblPayment);
		
		JLabel lblCardNum = new JLabel("Card Number");
		lblCardNum.setVisible(false);
		lblCardNum.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblCardNum.setBounds(408, 491, 131, 14);
		add(lblCardNum);
		
		tfCardNum = new JTextField();
		tfCardNum.setVisible(false);
		tfCardNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCardNum.setColumns(10);
		tfCardNum.setBorder(new LineBorder(Color.BLACK));
		tfCardNum.setBounds(398, 444, 312, 36);
		add(tfCardNum);
		
		tfEM = new JTextField();
		tfEM.setVisible(false);
		tfEM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfEM.setColumns(10);
		tfEM.setBorder(new LineBorder(Color.BLACK));
		tfEM.setBounds(399, 516, 82, 36);
		add(tfEM);
		
		tfCVV = new JTextField();
		tfCVV.setVisible(false);
		tfCVV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCVV.setColumns(10);
		tfCVV.setBorder(new LineBorder(Color.BLACK));
		tfCVV.setBounds(631, 516, 79, 36);
		add(tfCVV);
		
		JLabel lblExpiration = new JLabel("Expiration Date (MM/YY)");
		lblExpiration.setVisible(false);
		lblExpiration.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblExpiration.setBounds(408, 563, 191, 14);
		add(lblExpiration);
		
		tfEY = new JTextField();
		tfEY.setVisible(false);
		tfEY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfEY.setColumns(10);
		tfEY.setBorder(new LineBorder(Color.BLACK));
		tfEY.setBounds(481, 516, 82, 36);
		add(tfEY);
		
		JLabel lblCVV = new JLabel("CVV");
		lblCVV.setVisible(false);
		lblCVV.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblCVV.setBounds(641, 563, 36, 14);
		add(lblCVV);
		
		
		//Card Button Clicked
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				lblPayment.setVisible(true);
				lblCardNum.setVisible(true);
				lblCVV.setVisible(true);
				lblExpiration.setVisible(true);
				tfCardNum.setVisible(true);
				tfEM.setVisible(true);
				tfEY.setVisible(true);
				tfCVV.setVisible(true);
			}
		});
		
		//Cash/Check Button Clicked
		btnCC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				lblPayment.setVisible(false);
				lblCardNum.setVisible(false);
				lblCVV.setVisible(false);
				lblExpiration.setVisible(false);
				tfCardNum.setVisible(false);
				tfEM.setVisible(false);
				tfEY.setVisible(false);
				tfCVV.setVisible(false);
			}
		});
	}
}
