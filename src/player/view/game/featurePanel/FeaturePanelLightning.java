package player.view.game.featurePanel;

import player.models.Lightning;
import player.view.game.BoardPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quyendinhthuchoang on 12/14/2016.
 */
public class FeaturePanelLightning extends JPanel implements IFeaturePanel {
    private JLabel feature;
    private Lightning lightningLevel;
    private BoardPanel boardPanel;
    private int maxTime;
    private int counter;
    private int delay = 1000; //milliseconds

    public FeaturePanelLightning(Lightning lightningLevel, BoardPanel boardPanel) {
        this.lightningLevel = lightningLevel;
        this.boardPanel = boardPanel;
        initFeatureLabel();
        maxTime = lightningLevel.getTime();
        updateTimer(maxTime);
    }

    public void initFeatureLabel() {
        feature = new JLabel();
        feature.setText("Timer: " + " seconds left");
        feature.setFont(new Font(feature.getFont().getName(), Font.PLAIN, 20));
        add(feature);
    }

    public void updateTimer (int maxTime) {
        feature.setText("Timer: " + (maxTime - counter)
                + " seconds left");
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (counter < maxTime) {
                    counter++;
                    feature.setText("Timer: " + (maxTime - counter)
                            + " seconds left");
                } else {
                    feature.setText("You lose hahahahahaha");
                    boardPanel.disableBoard();
                }

            }
        };
        new Timer(delay, taskPerformer).start();
    }
}
