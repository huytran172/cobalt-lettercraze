package player.view.menu;

import player.view.game.GameFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HelpPanel() {
		
		JButton btnBack = new JButton("Back");
		btnBack.setVerticalAlignment(SwingConstants.BOTTOM);
		add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				HelpFrame currentFrame = (HelpFrame) SwingUtilities.getRoot(btnBack);
				currentFrame.dispose();
				MenuScreenFrame frame = new MenuScreenFrame();
				frame.setVisible(true);
			}
		});

	}

}
