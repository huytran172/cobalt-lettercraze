package builder.view.editGame;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StarPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public StarPanel() {
		setLayout(null);
		
		JLabel lblStar = new JLabel("1 Star:");
		lblStar.setBounds(60, 27, 61, 16);
		add(lblStar);
		
		textField = new JTextField();
		textField.setBounds(106, 22, 72, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblStars = new JLabel("2 Stars:");
		lblStars.setBounds(197, 27, 61, 16);
		add(lblStars);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(248, 22, 72, 26);
		add(textField_1);
		
		JLabel lblStars_1 = new JLabel("3 Stars:");
		lblStars_1.setBounds(332, 27, 61, 16);
		add(lblStars_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(378, 22, 72, 26);
		add(textField_2);

	}
}
