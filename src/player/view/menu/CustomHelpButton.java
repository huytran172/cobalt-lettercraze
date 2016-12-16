package player.view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import player.view.game.GameFrame;

public class CustomHelpButton extends JButton implements ActionListener {
	/**
	 * Constructor
	 */
	public CustomHelpButton() {
		setText("Help");
		addActionListener(this);
	}
	
	/**
	 * Show the HelpFrame
	 * @param e ActionEvent
	 */
	public void actionPerformed(ActionEvent e) {
		MenuScreenFrame currentFrame = (MenuScreenFrame) SwingUtilities.getRoot(this);
		currentFrame.dispose();
		HelpFrame hframe = new HelpFrame(currentFrame);
		hframe.setVisible(true);
	}
}
