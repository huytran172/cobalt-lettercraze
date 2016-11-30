package player.view.game;

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

	/**
	 * Create the panel.
	 */
	public TitlePanel(String mode) {
		this.mode = mode;
		//this.currentGameFrame = currentGameFrame;		
		
		JButton btnBack = new JButton("Back");
		add(btnBack);
		btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	GameFrame currentFrame = (GameFrame) SwingUtilities.getRoot(btnBack);
        		currentFrame.dispose();
        		MenuScreenFrame frame = new MenuScreenFrame();
				frame.setVisible(true);
            }
        });
		
		label = new JLabel();
		label.setText("Mode: " + mode);
		label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 50));
		add(label);
	}

}
