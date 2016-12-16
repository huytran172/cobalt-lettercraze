package player.view.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import player.models.Board;
import player.models.Level;
import player.view.menu.MenuScreenFrame;
import player.view.menu.MenuScreenPanel;

public class CustomSkipButton extends JButton implements ActionListener{
	private Level level;
    private InfoPanel infoPanel;

    
    public CustomSkipButton(Level level, InfoPanel infoPanel) {
        this.level = level;
        this.infoPanel = infoPanel;
        setText("Skip");
        addActionListener(this);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		//currentFrame.dispose();
	}
}