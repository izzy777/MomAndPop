import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Toppings extends JPanel {
	private final ButtonGroup sizeBtnGrp = new ButtonGroup();
	private final ButtonGroup crustBtnGrp = new ButtonGroup();
	private final ButtonGroup sauceBtnGrp = new ButtonGroup();
	private final ButtonGroup cheeseBtnGrp = new ButtonGroup();
	Toppings2 top2Pnl;

	/**
	 * Create the panel.
	 */
	public Toppings() {
		setBackground(SystemColor.control);
		setBounds(0, 0, 1108, 671);
		setLayout(null);
		setVisible(false);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setForeground(Color.DARK_GRAY);
		lblSize.setHorizontalAlignment(SwingConstants.CENTER);
		lblSize.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblSize.setBounds(133, 133, 219, 48);
		add(lblSize);
		
		JLabel lblCrust = new JLabel("Crust");
		lblCrust.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrust.setForeground(Color.DARK_GRAY);
		lblCrust.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblCrust.setBounds(445, 133, 219, 48);
		add(lblCrust);
		
		JLabel lblSauce = new JLabel("Sauce");
		lblSauce.setHorizontalAlignment(SwingConstants.CENTER);
		lblSauce.setForeground(Color.DARK_GRAY);
		lblSauce.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblSauce.setBounds(774, 133, 219, 48);
		add(lblSauce);
		
		JLabel lblCheese = new JLabel("Cheese");
		lblCheese.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheese.setForeground(Color.DARK_GRAY);
		lblCheese.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblCheese.setBounds(774, 356, 219, 48);
		add(lblCheese);
		
		JRadioButton rbtnS = new JRadioButton("");
		sizeBtnGrp.add(rbtnS);
		rbtnS.setBounds(117, 211, 21, 23);
		add(rbtnS);
		
		JRadioButton rbtnM = new JRadioButton("");
		sizeBtnGrp.add(rbtnM);
		rbtnM.setBounds(117, 300, 21, 23);
		add(rbtnM);
		
		JRadioButton rbtnL = new JRadioButton("");
		sizeBtnGrp.add(rbtnL);
		rbtnL.setBounds(117, 388, 21, 23);
		add(rbtnL);
		
		JRadioButton rbtnXL = new JRadioButton("");
		sizeBtnGrp.add(rbtnXL);
		rbtnXL.setBounds(117, 470, 21, 23);
		add(rbtnXL);
		
		JLabel lblS = new JLabel("<html>Small $4<br>(0.50\u00A2 per topping)</br></html>");
		lblS.setName("");
		lblS.setHorizontalTextPosition(SwingConstants.CENTER);
		lblS.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblS.setForeground(Color.DARK_GRAY);
		lblS.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setBounds(152, 192, 183, 62);
		add(lblS);
		
		JLabel lblM = new JLabel("<html>Medium $6<br>(0.75\u00A2 per topping)</br></html>");
		lblM.setName("");
		lblM.setHorizontalTextPosition(SwingConstants.CENTER);
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setForeground(Color.DARK_GRAY);
		lblM.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblM.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblM.setBounds(152, 280, 183, 62);
		add(lblM);
		
		JLabel lblL = new JLabel("<html>Large $8<br>($1 per topping)</br></html>");
		lblL.setName("");
		lblL.setHorizontalTextPosition(SwingConstants.CENTER);
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setForeground(Color.DARK_GRAY);
		lblL.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblL.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblL.setBounds(152, 366, 183, 62);
		add(lblL);
		
		JLabel lblXL = new JLabel("<html>Extra Large $10<br>($1.25 per topping)</br></html>");
		lblXL.setName("");
		lblXL.setHorizontalTextPosition(SwingConstants.CENTER);
		lblXL.setHorizontalAlignment(SwingConstants.CENTER);
		lblXL.setForeground(Color.DARK_GRAY);
		lblXL.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblXL.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblXL.setBounds(152, 450, 183, 62);
		add(lblXL);
		
		JLabel lblCT = new JLabel("Thin\r\n");
		lblCT.setName("");
		lblCT.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCT.setHorizontalAlignment(SwingConstants.CENTER);
		lblCT.setForeground(Color.DARK_GRAY);
		lblCT.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblCT.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblCT.setBounds(469, 192, 183, 62);
		add(lblCT);
		
		JRadioButton rbtnCS = new JRadioButton("");
		crustBtnGrp.add(rbtnCS);
		rbtnCS.setBounds(434, 211, 21, 23);
		add(rbtnCS);
		
		JRadioButton rbtnCM = new JRadioButton("");
		crustBtnGrp.add(rbtnCM);
		rbtnCM.setBounds(434, 300, 21, 23);
		add(rbtnCM);
		
		JLabel lblCR = new JLabel("Regular");
		lblCR.setName("");
		lblCR.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCR.setHorizontalAlignment(SwingConstants.CENTER);
		lblCR.setForeground(Color.DARK_GRAY);
		lblCR.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblCR.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblCR.setBounds(469, 280, 183, 62);
		add(lblCR);
		
		JLabel lblCP = new JLabel("Pan");
		lblCP.setName("");
		lblCP.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCP.setHorizontalAlignment(SwingConstants.CENTER);
		lblCP.setForeground(Color.DARK_GRAY);
		lblCP.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblCP.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblCP.setBounds(469, 366, 183, 62);
		add(lblCP);
		
		JRadioButton rbtnCL = new JRadioButton("");
		crustBtnGrp.add(rbtnCL);
		rbtnCL.setBounds(434, 388, 21, 23);
		add(rbtnCL);
		
		JLabel lblNT = new JLabel("No Tomatoes");
		lblNT.setName("");
		lblNT.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNT.setHorizontalAlignment(SwingConstants.CENTER);
		lblNT.setForeground(Color.DARK_GRAY);
		lblNT.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNT.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblNT.setBounds(798, 280, 183, 62);
		add(lblNT);
		
		JRadioButton rbtnNT = new JRadioButton("");
		sauceBtnGrp.add(rbtnNT);
		rbtnNT.setBounds(763, 300, 21, 23);
		add(rbtnNT);
		
		JRadioButton rbtnT = new JRadioButton("");
		sauceBtnGrp.add(rbtnT);
		rbtnT.setBounds(763, 211, 21, 23);
		add(rbtnT);
		
		JLabel lblT = new JLabel("Tomatoes");
		lblT.setName("");
		lblT.setHorizontalTextPosition(SwingConstants.CENTER);
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		lblT.setForeground(Color.DARK_GRAY);
		lblT.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblT.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblT.setBounds(798, 192, 183, 62);
		add(lblT);
		
		JLabel lblNC = new JLabel("No Cheese");
		lblNC.setName("");
		lblNC.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNC.setHorizontalAlignment(SwingConstants.CENTER);
		lblNC.setForeground(Color.DARK_GRAY);
		lblNC.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNC.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblNC.setBounds(798, 503, 183, 62);
		add(lblNC);
		
		JRadioButton rbtnNC = new JRadioButton("");
		cheeseBtnGrp.add(rbtnNC);
		rbtnNC.setBounds(763, 523, 21, 23);
		add(rbtnNC);
		
		JRadioButton rbtnC = new JRadioButton("");
		cheeseBtnGrp.add(rbtnC);
		rbtnC.setBounds(763, 434, 21, 23);
		add(rbtnC);
		
		JLabel lblC = new JLabel("Cheese");
		lblC.setName("");
		lblC.setHorizontalTextPosition(SwingConstants.CENTER);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setForeground(Color.DARK_GRAY);
		lblC.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblC.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		lblC.setBounds(798, 415, 183, 62);
		add(lblC);
		
		top2Pnl = new Toppings2();
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

			}
		});
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnNext.setFocusable(false);
		btnNext.setBorderPainted(false);
		btnNext.setBackground(Color.RED);
		btnNext.setBounds(867, 600, 201, 40);
		add(btnNext);
		
	}
}
