package player.view.game;

import player.models.Theme;

import javax.swing.*;

/**
 * Created by quyendinhthuchoang on 12/14/2016.
 */
public class FeaturePanelTheme extends JPanel {
    private JLabel feature;
    private Theme themeLevel;
    private BoardPanel boardPanel;
    private String themeTitle;

    public FeaturePanelTheme(Theme themeLevel, BoardPanel boardPanel) {
        this.themeLevel = themeLevel;
        this.boardPanel = boardPanel;
        themeTitle = themeLevel.getTheme();
    }
}
