package player.view.game.gamepanel;

import player.models.Level;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.TitlePanel;
import player.view.game.featurePanel.IFeaturePanel;
import player.view.game.submitbutton.CustomSubmitButton;

import javax.swing.*;

/**
 * Created by quyendinhthuchoang on 12/13/2016.
 */
public abstract class GamePanel extends JPanel{
    protected BoardPanel boardPanel;
    protected TitlePanel titlePanel;
    protected InfoPanel infoPanel;
    protected Level level;
    
    /**
     * Constructor
     * @param  l Level
     */
    public GamePanel(Level l) {
    	this.level = l;
		this.setLayout(null);
		
		boardPanel = new BoardPanel(level.getBoard());
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new InfoPanel(level);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 350);
    }

    // GETTERS AND SETTERS
    public BoardPanel getBoardPanel() {
        return boardPanel;
    }

    public InfoPanel getInfoPanel() {
        return infoPanel;
    }

    public TitlePanel getTitlePanel() {
        return titlePanel;
    }

    public abstract Level getLevel();

    public abstract IFeaturePanel getFeaturePanel();

    public abstract CustomSubmitButton getSubmitButton();
}
