package builder.view.editGame.theme;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import builder.view.editGame.BoardPanel;
import builder.view.editGame.TitlePanel;
import builder.view.editGame.lightning.LightningInfoPanel;
import player.models.Board;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class ThemeGamePanel extends JPanel {
	JPanel boardPanel;
	JPanel titlePanel;
	JPanel infoPanel;
	JPanel starPanel;
	
	/**
	 * constructor
	 * @param  levelNum int
	 * @param  add      boolean
	 */
	public ThemeGamePanel(int levelNum, boolean add) {
		this.setLayout(null);
		Board b = new Board();
		b.initialize();
		boardPanel = new BoardPanel(b);
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    infoPanel = new ThemeInfoPanel(b, levelNum, add);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    titlePanel = new TitlePanel("Theme");
	    add(titlePanel);
	    titlePanel.setBounds(40, 20, 600, 60);
	}
}


