package player.view.game.featurePanel;

import player.models.Theme;
import player.view.game.BoardPanel;

import javax.swing.*;

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
        wordLeft = themeLevel.getWordsToFind().length;
    }

    public boolean updateTheme() {
        if (wordLeft > 0) {
            wordLeft--;
            feature.setText("Remaining words: " + wordLeft);
            return true;
        } else {
            feature.setText("You have found all the words in this theme. Wow :v");
            boardPanel.disableBoard();
            return false;
        }
    }
}
