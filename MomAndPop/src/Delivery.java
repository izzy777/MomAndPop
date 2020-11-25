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
	private JTextField txtFieldAddress;
	private JTextField txtFieldCity;
	private JTextField txtFieldState;
	private JTextField txtFieldZipCode;

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
		lblDelivery.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 70));
		lblDelivery.setBounds(395, 42, 317, 80);
		add(lblDelivery);
		
		JLabel lblDeliveryInformation = new JLabel("Delivery Information\r\n");
		lblDeliveryInformation.setFont(new Font("Nirmala UI", Font.BOLD, 17));
		lblDeliveryInformation.setBounds(469, 148, 169, 30);
		add(lblDeliveryInformation);
		
		txtFieldAddress = new JTextField();
		txtFieldAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFieldAddress.setColumns(10);
		txtFieldAddress.setBorder(new LineBorder(Color.BLACK));
		txtFieldAddress.setBounds(395, 209, 317, 36);
		add(txtFieldAddress);
		
		JLabel lblStreetAdress = new JLabel("Street Adress");
		lblStreetAdress.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblStreetAdress.setBounds(405, 255, 98, 14);
		add(lblStreetAdress);
		
		txtFieldCity = new JTextField();
		txtFieldCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFieldCity.setColumns(10);
		txtFieldCity.setBorder(new LineBorder(Color.BLACK));
		txtFieldCity.setBounds(395, 307, 317, 36);
		add(txtFieldCity);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblCity.setBounds(405, 353, 65, 14);
		add(lblCity);
		
		txtFieldState = new JTextField();
		txtFieldState.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFieldState.setColumns(10);
		txtFieldState.setBorder(new LineBorder(Color.BLACK));
		txtFieldState.setBounds(395, 409, 91, 36);
		add(txtFieldState);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblState.setBounds(405, 455, 65, 14);
		add(lblState);
		
		txtFieldZipCode = new JTextField();
		txtFieldZipCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFieldZipCode.setColumns(10);
		txtFieldZipCode.setBorder(new LineBorder(Color.BLACK));
		txtFieldZipCode.setBounds(608, 409, 91, 36);
		add(txtFieldZipCode);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblZipCode.setBounds(618, 458, 65, 14);
		add(lblZipCode);
	}
}
