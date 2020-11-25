import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class OrderConfirmed extends JPanel {

	/**
	 * Create the panel.
	 */
	public OrderConfirmed() {
		setFocusable(false);
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		JLabel lblOrderConfirmed = new JLabel("ORDER CONFIRMED");
		lblOrderConfirmed.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderConfirmed.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 70));
		lblOrderConfirmed.setBounds(10, 10, 1088, 130);
		add(lblOrderConfirmed);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 35));
		lblTotal.setBounds(363, 562, 152, 72);
		add(lblTotal);
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.setForeground(Color.WHITE);
		btnFinish.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnFinish.setFocusable(false);
		btnFinish.setBorderPainted(false);
		btnFinish.setBackground(Color.RED);
		btnFinish.setBounds(876, 615, 181, 35);
		add(btnFinish);
	}

}
