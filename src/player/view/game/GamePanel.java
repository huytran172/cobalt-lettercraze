package player.view.game;

import player.models.Level;
import player.models.Lightning;
import player.view.game.featurePanel.FeaturePanel;
import player.view.game.featurePanel.FeaturePanelLightning;
import player.view.game.featurePanel.IFeaturePanel;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.LightningSubmitButton;

import javax.swing.*;

/**
 * Created by quyendinhthuchoang on 12/13/2016.
 */
public abstract class GamePanel extends JPanel{
    protected BoardPanel boardPanel;
    protected TitlePanel titlePanel;
    protected InfoPanel infoPanel;

    public BoardPanel getBoardPanel() {
        return boardPanel;
    }

    public InfoPanel getInfoPanel() {
        return infoPanel;
    }

    public TitlePanel getTitlePanel() {
        return titlePanel;
    }

    public abstract Level getLevel();

    public abstract IFeaturePanel getFeaturePanel();

    public abstract CustomSubmitButton getSubmitButton();
}
