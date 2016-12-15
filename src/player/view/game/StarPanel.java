package player.view.game;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.io.File;

/**
 * Created by quyendinhthuchoang on 12/11/2016.
 */
public class StarPanel extends JPanel{
    private int starNum;
    private int score;
    private JLabel textLabel;
    private JLabel starLabel;
    private boolean state = false;

    public StarPanel(int starNum, int score) {
        this.starNum = starNum;
        this.score = score;
        
        textLabel = new JLabel();
        add(textLabel);
        
        starLabel = new JLabel();
        add(starLabel);

        initialize();
        addStart();
    }

    public void initialize() {
        textLabel.setText("Star " + starNum + ": " + score);
        textLabel.setFont(textLabel.getFont().deriveFont(17.0f));
    }

    public void addStart() {
        try {
            Image img = ImageIO.read(new File("Images/star-20.png"));
            starLabel.setIcon(new ImageIcon(img));
            toggleStar();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void toggleStar() {
        starLabel.setVisible(state);
        state = !state;
    }
}
