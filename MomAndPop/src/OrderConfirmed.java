import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderConfirmed extends JPanel {
	JScrollPane scrollPane;
	JLabel lblTotal;

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
		
		lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		lblTotal.setBounds(435, 608, 237, 31);
		add(lblTotal);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(209, 141, 689, 388);
		add(scrollPane);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnFinish.setForeground(Color.WHITE);
		btnFinish.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnFinish.setFocusable(false);
		btnFinish.setBorderPainted(false);
		btnFinish.setBackground(Color.RED);
		btnFinish.setBounds(867, 600, 201, 40);
		add(btnFinish);
	}
}
