package player.view.game;

import player.models.Puzzle;

import javax.swing.*;

/**
 * Created by quyendinhthuchoang on 12/14/2016.
 */
public class FeaturePanelPuzzle extends JPanel {
    private JLabel feature;
    private Puzzle puzzleLevel;
    private BoardPanel boardPanel;
    private int wordLeft;

    public FeaturePanelPuzzle(Puzzle puzzleLevel, BoardPanel boardPanel) {
        this.puzzleLevel = puzzleLevel;
        this.boardPanel = boardPanel;
        wordLeft = puzzleLevel.getMaxMoves();
    }

    public boolean updateWordLeft() {
        if (wordLeft > 0) {
            wordLeft--;
            feature.setText("Remaining words: " + wordLeft);
            return true;
        } else {
            feature.setText("You lose hahahahahaha");
            boardPanel.disableBoard();
            return false;
        }
    }
}
