package player.view.menu;

import player.view.game.GameFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class HelpPanel extends JPanel {
	private JLabel label;

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

		label = new JLabel();
		addImage(label);
	}

	public void addImage(JLabel label) {
		try {
			Image img = ImageIO.read(new File("Images/help.png"));
			label.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		this.add( label, BorderLayout.CENTER );
	}
}
