package player.view.game;

import player.models.Level;

import javax.swing.*;

/**
 * Created by quyendinhthuchoang on 12/13/2016.
 */
public interface GamePanel {
    public BoardPanel getBoardPanel();

    public InfoPanel getInfoPanel();

    public TitlePanel getTitlePanel();

    public FeaturePanel getFeaturePanel();

    public Level getLevel();
}
