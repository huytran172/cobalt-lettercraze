package player.view.game.featurePanel;

import player.models.Theme;
import player.models.Word;
import player.view.game.BoardPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by quyendinhthuchoang on 12/14/2016.
 */
public class FeaturePanelTheme extends JPanel implements IFeaturePanel {
    private JLabel feature;
    private Theme themeLevel;
    private BoardPanel boardPanel;
    private String themeTitle;
    private int wordLeft;

    public FeaturePanelTheme(Theme themeLevel, BoardPanel boardPanel) {
        this.themeLevel = themeLevel;
        this.boardPanel = boardPanel;
        themeTitle = themeLevel.getTheme();
        //System.out.print("test: " + themeLevel.getWordsToFind().length);
        wordLeft = themeLevel.getWordsToFind().length;
        initFeatureLabel();
    }

    public void initFeatureLabel() {
        feature = new JLabel();
        feature.setText("Theme: " + themeTitle);
        feature.setFont(new Font(feature.getFont().getName(), Font.PLAIN, 20));
        add(feature);
    }

    public void decreaseWordLeft(Word word) {
        wordLeft--;
        if (wordLeft == 0) {
            feature.setText("You win :(");
            boardPanel.setBoardEnabled(false);
            boardPanel.deselectWord(word);
        }
    }
    
    public void increaseWordLeft() {
    	if (wordLeft < themeLevel.getWordsToFind().length){
        	wordLeft++;
        }
    	if (wordLeft != 0) {
        	boardPanel.setBoardEnabled(true);
        }
    }
    
    public int getWordLeft() {
    	return wordLeft;
    }
}
