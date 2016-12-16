package player.view.game.featurePanel;

import player.models.Puzzle;
import player.models.Word;
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
        wordLeft = puzzleLevel.getMaxMoves();
        initFeatureLabel();
    }

    public void reInit() {
        wordLeft = puzzleLevel.getMaxMoves();
        feature.setText("Remaining words: " + wordLeft);
    }

    public void initFeatureLabel() {
        feature = new JLabel();
        feature.setText("Remaining words: " + wordLeft);
        feature.setFont(new Font(feature.getFont().getName(), Font.PLAIN, 20));
        add(feature);
    }

    public void decreaseWordLeft(Word word) {
        wordLeft--;
        feature.setText("Remaining words: " + wordLeft);
        if (wordLeft == 0) {
            boardPanel.setBoardEnabled(false);
            boardPanel.toggleJustColorWord(word);
        }
    }
    
    public void increaseWordLeft() {
        if (wordLeft < puzzleLevel.getMaxMoves()){
        	wordLeft++;
        }
        feature.setText("Remaining words: " + wordLeft);
        if (wordLeft != 0) {
        	boardPanel.setBoardEnabled(true);
        }
    }
    
    public int getWordLeft() {
    	return wordLeft;
    }
}
