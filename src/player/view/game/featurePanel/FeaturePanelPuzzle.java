package player.view.game.featurePanel;

import player.models.Puzzle;
import player.view.game.BoardPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by quyendinhthuchoang on 12/14/2016.
 */
public class FeaturePanelPuzzle extends JPanel implements IFeaturePanel {
    private JLabel feature;
    private Puzzle puzzleLevel;
    private BoardPanel boardPanel;
    private int wordLeft;

    public FeaturePanelPuzzle(Puzzle puzzleLevel, BoardPanel boardPanel) {
        this.puzzleLevel = puzzleLevel;
        this.boardPanel = boardPanel;
        initFeatureLabel();
        wordLeft = puzzleLevel.getMaxMoves();
    }

    public void initFeatureLabel() {
        feature = new JLabel();
        feature.setText("Remaining words: ");
        feature.setFont(new Font(feature.getFont().getName(), Font.PLAIN, 20));
        add(feature);
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
