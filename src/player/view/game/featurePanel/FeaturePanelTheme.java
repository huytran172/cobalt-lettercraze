package player.view.game.featurePanel;

import player.models.Theme;
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
        initFeatureLabel();
        themeTitle = themeLevel.getTheme();
        wordLeft = themeLevel.getWordsToFind().length;
    }

    public void initFeatureLabel() {
        feature = new JLabel();
        feature.setText("Theme: ");
        feature.setFont(new Font(feature.getFont().getName(), Font.PLAIN, 20));
        add(feature);
    }

    public boolean updateTheme() {
        if (wordLeft > 0) {
            wordLeft--;
            feature.setText("Theme: " + wordLeft);
            return true;
        } else {
            feature.setText("You have found all the words in this theme. Wow :v");
            boardPanel.disableBoard();
            return false;
        }
    }
}
