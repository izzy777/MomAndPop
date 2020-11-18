import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Delivery extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Delivery() {
		setFocusable(false);
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		JLabel lblDelivery = new JLabel("Delivery");
		lblDelivery.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelivery.setFont(new Font("Dialog", Font.PLAIN, 70));
		lblDelivery.setBounds(395, 42, 317, 80);
		add(lblDelivery);
		
		JLabel lblDeliveryInformation = new JLabel("Delivery Information\r\n");
		lblDeliveryInformation.setFont(new Font("Dialog", Font.BOLD, 17));
		lblDeliveryInformation.setBounds(469, 148, 169, 30);
		add(lblDeliveryInformation);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(Color.BLACK));
		textField.setBounds(395, 209, 317, 36);
		add(textField);
		
		JLabel lblStreetAdress = new JLabel("Street Adress");
		lblStreetAdress.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblStreetAdress.setBounds(405, 255, 98, 14);
		add(lblStreetAdress);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.BLACK));
		textField_1.setBounds(395, 307, 317, 36);
		add(textField_1);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblCity.setBounds(405, 353, 65, 14);
		add(lblCity);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(Color.BLACK));
		textField_2.setBounds(395, 409, 91, 36);
		add(textField_2);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblState.setBounds(405, 455, 65, 14);
		add(lblState);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(Color.BLACK));
		textField_3.setBounds(608, 409, 91, 36);
		add(textField_3);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblZipCode.setBounds(618, 458, 65, 14);
		add(lblZipCode);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBack.setFocusable(false);
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(116, 588, 137, 36);
		add(btnBack);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.setForeground(Color.WHITE);
		btnPlaceOrder.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPlaceOrder.setFocusable(false);
		btnPlaceOrder.setBorderPainted(false);
		btnPlaceOrder.setBackground(Color.RED);
		btnPlaceOrder.setBounds(696, 588, 169, 36);
		add(btnPlaceOrder);
	}
}
