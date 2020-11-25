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
	
	/**
	 * Create the panel.
	 */
	public ReviewCart() {
		setBackground(SystemColor.control);
		setBounds(136, 0, 1108, 671);
		setLayout(null);
		

		JLabel lblTotal = new JLabel("Total:");
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
		model.addRow(new Object[] {"Pizza", "pizzam,ljnglkjszlgjolsrjgl;kirjzlgjrdzlkjglk;szrjglkjrdgljdlrjxgkldrjlgkjdrg", "1","10.20"});
		model.addRow(new Object[] {"Drink", "pizzam,ljnglkjszlgjolsrjgl;kirjzlgjrdzlkjglk;szrjglkjrdgljdlrjxgkldrjlgkjdrg", "1","10.20"});
		
		table = new JTable(model);
		table.setGridColor(Color.WHITE);
		table.setBackground(Color.WHITE);
		table.getTableHeader().setReorderingAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(948, 323, 89, 23);
		add(btnRemove);
		setVisible(false);
		
		//Removes selected row;
				btnRemove.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						model.removeRow(table.getSelectedRow());
					}
				});

	}
}
