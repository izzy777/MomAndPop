import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ReviewCart extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ReviewCart() {
		setBackground(SystemColor.control);
		setLayout(null);
		setBounds(136, 0, 1108, 671);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(199, 150, 710, 371);
		add(scrollPane);
		
		table = new JTable();

		table.setEditingColumn(1);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item", "Description", "Quantity", "Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Nirmala UI", Font.PLAIN, 25));
		lblTotal.setBounds(435, 629, 237, 31);
		add(lblTotal);
		
		JLabel lblReviewCart = new JLabel("Review Cart");
		lblReviewCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblReviewCart.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblReviewCart.setBounds(435, 49, 237, 31);
		add(lblReviewCart);
		setVisible(false);

	}
}
