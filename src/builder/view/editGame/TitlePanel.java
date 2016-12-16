package builder.view.editGame;

import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import player.view.menu.MenuScreenFrame;

public class TitlePanel extends JPanel{
	private JLabel label;
	private String mode;
	//private GameFrame currentGameFrame;

	/**
	 * Create the panel.
	 */
	public TitlePanel(String mode) {
		this.mode = mode;
		label = new JLabel();
		label.setText("Mode: " + mode);
		label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 30));
		add(label);
	}

}
