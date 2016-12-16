package player.view.game.submitbutton;

import player.models.Board;
import player.models.Level;
import player.models.Word;
import player.models.score.Score;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.StarPanel;
import player.view.game.WordPanel;
import player.view.game.gamepanel.GamePanel;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CustomSubmitButton extends JButton implements ActionListener {
    protected Level level;
    protected WordPanel wordPanel;
    protected BoardPanel boardPanel;
    protected Board board;
    protected Word word;
    protected InfoPanel infoPanel;
    protected StarPanel starPanel1;
    protected StarPanel starPanel2;
    protected StarPanel starPanel3;
    protected Score score;
    protected int star;

    /**
     * Custome submit button constructor
     * @param  l          Level
     * @param  boardPanel BoardPanel
     * @param  infoPanel  InfoPanel
     */
    public CustomSubmitButton(Level l, BoardPanel boardPanel, InfoPanel infoPanel) {
        this.level = l;
        this.wordPanel = infoPanel.getWordsFound();
        this.infoPanel = infoPanel;
        this.boardPanel = boardPanel;
        this.board = boardPanel.getBoard();
        this.score = level.getScore();
        this.starPanel1 = infoPanel.getStar1();
        this.starPanel2 = infoPanel.getStar2();
        this.starPanel3 = infoPanel.getStar3();
        setText("Submit");
    }

    public abstract void actionPerformed(ActionEvent e);
    
    /**
     * Update current score
     * @param w 
     */
    protected void updateScore(Word w) {
    	this.score.updateScore(w);
    	this.score.updateHighScore();
    }
    
    /**
     * Not sure what this does
     */
    protected void updateInterface() {
        boardPanel.deselectWord(word);
        boardPanel.reputLetter();
        board.renewTempWord();
    }
}
