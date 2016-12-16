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
    private String mode;
    private Level level;
    private WordPanel wordPanel;
    private Board board;
    private BoardPanel boardPanel;
    private InfoPanel infoPanel;
    private IFeaturePanel featurePanel;
    private Score score;

    /**
     * Constructor
     * @param  mode         String mode of the level
     * @param  level        Level
     * @param  boardPanel   BoardPanel
     * @param  infoPanel    InfoPanel
     * @param  featurePanel IFeaturePanel
     */
    public CustomResetButton(String mode, Level level, BoardPanel boardPanel, InfoPanel infoPanel, IFeaturePanel featurePanel) {
        this.mode = mode;
        this.level = level;
        this.infoPanel = infoPanel;
        this.boardPanel = boardPanel;
        this.wordPanel = infoPanel.getWordsFound();
        this.featurePanel = featurePanel;
        this.board = this.level.getBoard();
        this.score = level.getScore();
        setText("Reset");
        addActionListener(this);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
        boardPanel.setBoardEnabled(true);
        if (mode.equals("theme")) {
            board.clearBoard();
            board.fillWordsFromFile();
        } else {
            board.resetBoard();
        }
        boardPanel.reputLetter();
        score.setScore(0);
		infoPanel.setScoreNum(score.getScore());
        infoPanel.getWordsFound().clearWordPanel();
        featurePanel.reInit();
	}

}


