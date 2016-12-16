package player.view.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import player.models.Board;
import player.models.Level;
import player.models.Puzzle;
import player.models.Word;
import player.models.score.Score;
import player.view.game.featurePanel.IFeaturePanel;
import player.view.game.gamepanel.GamePanel;

public class CustomUndoButton extends JButton implements ActionListener {
    private Level level;
    private WordPanel wordPanel;
    private Board board;
    private BoardPanel boardPanel;
    private InfoPanel infoPanel;
    private IFeaturePanel featurePanel;
    private Score score;
    
    /**
     * Constructor
     * @param  level        Level
     * @param  boardPanel   BoardPanel
     * @param  infoPanel    InfoPanel
     * @param  featurePanel IFeaturePanel
     */
    public CustomUndoButton(Level level, BoardPanel boardPanel, InfoPanel infoPanel, IFeaturePanel featurePanel) {
        this.level = level;
        this.infoPanel = infoPanel;
        this.boardPanel = boardPanel;
        this.wordPanel = infoPanel.getWordsFound();
        this.featurePanel = featurePanel;
        this.score = level.getScore();
        board = this.level.getBoard();
        setText("Undo");
        addActionListener(this);
    }

    /**
     * Undo the move
     * @param e ActionEvent
     */
	public void actionPerformed(ActionEvent e) {
		board.renewTempWord();
        boardPanel.setBoardEnabled(true);
		board.loadSquareState();
        wordPanel.loadWordListState();
        featurePanel.increaseWordLeft();
        int lastScore = infoPanel.retrieveLastScore();
        this.score.addScore(0 - this.score.getScore() + lastScore);
        System.out.println("SCORE LOADED:" + this.score.getScore());
        infoPanel.setScoreNum(this.score.getScore());
        boardPanel.reputLetter();
        boardPanel.repaint();
        wordPanel.repaint();
    }
}
