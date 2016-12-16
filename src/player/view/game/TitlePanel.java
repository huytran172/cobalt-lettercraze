package player.view.game;

import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import player.models.Level;
import player.view.menu.MenuScreenFrame;
import player.view.menu.MenuScreenPanel;

public class TitlePanel extends JPanel{
	private JLabel label;
	private String mode;

	/**
	 * Create the panel.
	 */
	public TitlePanel(String mode, Level l) {
		this.mode = mode;
		//this.currentGameFrame = currentGameFrame;		

		JButton btnBack = new JButton("Back");
		add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameFrame currentFrame = (GameFrame) SwingUtilities.getRoot(btnBack);
				MenuScreenFrame menuFrame = currentFrame.getMenuFrame();
				((MenuScreenPanel) menuFrame.getContentPane()).repaintButtons();
				menuFrame.setVisible(true);
				menuFrame.revalidate();
				menuFrame.repaint();
				currentFrame.dispose();
				l.printToFile();
			}
		});

		label = new JLabel();
		label.setText("Mode: " + mode);
		label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 30));
		add(label);
	}

}
