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
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReviewCart extends JPanel {
	public JTable table;
	public DefaultTableModel model;
	double total;
	private JLabel lblTotal;
	/**
	 * Create the panel.
	 */
	public ReviewCart() {
		setBackground(SystemColor.control);
		setBounds(136, 0, 1108, 671);
		setLayout(null);
		

		lblTotal = new JLabel("Total:");
		lblTotal.setBounds(435, 608, 237, 31);
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		add(lblTotal);
		
		JLabel lblReviewCart = new JLabel("Review Cart");
		lblReviewCart.setBounds(435, 49, 237, 31);
		lblReviewCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblReviewCart.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		add(lblReviewCart);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(209, 141, 689, 388);
		add(scrollPane);
		
		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		model.addColumn("Item");
		model.addColumn("Description");
		model.addColumn("Quantity");
		model.addColumn("Price");
		
		table = new JTable(model);
		table.setGridColor(Color.WHITE);
		table.setBackground(Color.WHITE);
		table.getTableHeader().setReorderingAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFocusable(false);
		btnRemove.setForeground(Color.WHITE);
		btnRemove.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		btnRemove.setBorder(null);
		btnRemove.setBackground(Color.RED);
		btnRemove.setBounds(933, 498, 136, 31);
		add(btnRemove);
		setVisible(false);
		
		//Removes selected row;
		btnRemove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				model.removeRow(table.getSelectedRow());
				getSum();
				setTotal();
			}
		});
		
		
	}
	//set Total
	public void setTotal() {
		lblTotal.setText("Total: $" + total);
	}
	
	public void getSum() {
		total = 0;
		for(int i = 0; i < table.getRowCount(); i++) {
			total = total + Double.parseDouble(table.getValueAt(i, 3).toString());
		}
	}
}
