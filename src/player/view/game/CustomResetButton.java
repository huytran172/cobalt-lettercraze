package player.view.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import player.models.Board;
import player.models.Level;
import player.models.Word;
import player.models.score.Score;
import player.view.game.featurePanel.IFeaturePanel;
import player.view.game.gamepanel.GamePanel;

public class CustomResetButton extends JButton implements ActionListener{
    private Level level;
    private WordPanel wordPanel;
    private Board board;
    private BoardPanel boardPanel;
    private InfoPanel infoPanel;
    private IFeaturePanel featurePanel;

    
    public CustomResetButton(Level level, BoardPanel boardPanel, InfoPanel infoPanel, IFeaturePanel featurePanel) {
        this.level = level;
        this.infoPanel = infoPanel;
        this.boardPanel = boardPanel;
        this.wordPanel = infoPanel.getWordsFound();
        this.featurePanel = featurePanel;
        board = this.level.getBoard();
        setText("Reset");
        addActionListener(this);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		board.resetBoard();
		boardPanel.setBoardEnabled(true);
		boardPanel.reputLetter();
		infoPanel.getWordsFound().clearWordPanel();
        featurePanel.reInit();
	}

}


