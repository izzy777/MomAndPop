import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PickUp extends JPanel {
	private JTextField tfTime;
	private JTextField tfDate;

	/**
	 * Create the panel.
	 */
	public PickUp() {
		setFocusable(false);
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		JLabel lblPickup = new JLabel("PICKUP");
		lblPickup.setHorizontalAlignment(SwingConstants.CENTER);
		lblPickup.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 70));
		lblPickup.setBounds(10, 10, 1088, 130);
		add(lblPickup);
		
		JButton btnASAP = new JButton("ASAP");
		btnASAP.setFocusable(false);
		btnASAP.setBorder(null);
		btnASAP.setBackground(Color.RED);
		btnASAP.setForeground(Color.WHITE);
		btnASAP.setFont(new Font("Nirmala UI", Font.BOLD, 17));
		btnASAP.setBounds(374, 207, 181, 31);
		add(btnASAP);
		
		JButton btnSchedule = new JButton("Schedule Pickup");
		btnSchedule.setFocusable(false);
		btnSchedule.setBorder(null);
		btnSchedule.setBackground(Color.RED);
		btnSchedule.setForeground(Color.WHITE);
		btnSchedule.setFont(new Font("Nirmala UI", Font.BOLD, 17));
		btnSchedule.setBounds(557, 207, 181, 31);
		add(btnSchedule);
		
		tfTime = new JTextField();
		tfTime.setVisible(false);
		tfTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTime.setColumns(10);
		tfTime.setBorder(new LineBorder(Color.BLACK));
		tfTime.setBounds(553, 266, 181, 36);
		add(tfTime);
		
		tfDate = new JTextField();
		tfDate.setVisible(false);
		tfDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfDate.setColumns(10);
		tfDate.setBorder(new LineBorder(Color.BLACK));
		tfDate.setBounds(374, 266, 181, 36);
		add(tfDate);
		
		JLabel lblDate = new JLabel("Date (MM/DD/YY)");
		lblDate.setVisible(false);
		lblDate.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDate.setBounds(384, 315, 157, 20);
		add(lblDate);
		
		JLabel lblTime = new JLabel("Time (HH:MM)(AM/PM)");
		lblTime.setVisible(false);
		lblTime.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTime.setBounds(563, 315, 157, 20);
		add(lblTime);
		
		JLabel lblText = new JLabel("Select an Option");
		lblText.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setBounds(303, 165, 501, 31);
		add(lblText);
		
		JLabel lblASAP = new JLabel("Come in then next 20-30 Minutes");
		lblASAP.setVisible(false);
		lblASAP.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblASAP.setBounds(303, 359, 501, 52);
		add(lblASAP);
		
		//ASAP Button Clicked
		btnASAP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				btnASAP.setBackground(new Color(139, 0, 0));
				btnSchedule.setBackground(Color.red);
				tfTime.setVisible(false);
				tfDate.setVisible(false);
				lblDate.setVisible(false);
				lblTime.setVisible(false);
				lblASAP.setVisible(true);
			}
		});
		
		//Schedule Button Clicked
		btnSchedule.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				btnSchedule.setBackground(new Color(139, 0, 0));
				btnASAP.setBackground(Color.red);
				tfTime.setVisible(true);
				tfDate.setVisible(true);
				lblDate.setVisible(true);
				lblTime.setVisible(true);
				lblASAP.setVisible(false);
			}
		});
	}
}
