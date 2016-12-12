package player.view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import player.view.game.GameFrame;

public class CustomHelpButton extends JButton implements ActionListener {
	
	// TODO: add image to the custom help button
	// according to the design
	public CustomHelpButton() {
		setText("Help");
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		MenuScreenFrame currentFrame = (MenuScreenFrame) SwingUtilities.getRoot(this);
		currentFrame.dispose();
		HelpFrame hframe = new HelpFrame();
		hframe.setVisible(true);
	}
}
