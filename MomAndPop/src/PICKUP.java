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

public class PICKUP extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PICKUP() {
		setFocusable(false);
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		
		JLabel lblPickup = new JLabel("PICKUP");
		lblPickup.setHorizontalAlignment(SwingConstants.CENTER);
		lblPickup.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 70));
		lblPickup.setBounds(10, 10, 1088, 130);
		add(lblPickup);
		
		JButton btnNewButton = new JButton("ASAP");
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnNewButton.setBounds(355, 207, 181, 31);
		add(btnNewButton);
		
		JButton btnSchedulePickup = new JButton("Schedule Pickup");
		btnSchedulePickup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSchedulePickup.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnSchedulePickup.setBounds(534, 207, 181, 31);
		add(btnSchedulePickup);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(Color.BLACK));
		textField.setBounds(534, 265, 181, 36);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.BLACK));
		textField_1.setBounds(355, 265, 181, 36);
		add(textField_1);
		
		JLabel lblDatemmddyy = new JLabel("Date (MM/DD/YY)");
		lblDatemmddyy.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatemmddyy.setBounds(365, 314, 157, 20);
		add(lblDatemmddyy);
		
		JLabel lblTimehhmmampm = new JLabel("Time (HH:MM)(AM/PM)");
		lblTimehhmmampm.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTimehhmmampm.setBounds(544, 314, 157, 20);
		add(lblTimehhmmampm);
	}
}
