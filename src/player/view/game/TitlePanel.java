package player.view.game;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

public class TitlePanel extends JPanel implements ActionListener {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TitlePanel(String mode) {
		JButton btnBack = new JButton("Back");
		add(btnBack);
		btnBack.addActionListener(null);
		
		textField = new JTextField();
		textField.setText("Mode: " + mode);
		add(textField);
		textField.setColumns(10);
	}
	
	public void actionPerformed(ActionEvent e) {
		GameFrame gframe = new GameFrame();
		gframe.setVisible(true);
	}

}
