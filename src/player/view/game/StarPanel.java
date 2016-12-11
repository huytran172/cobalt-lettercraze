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
    private JLabel label1;
    private JLabel label2;
    private boolean state = false;

    public StarPanel(int starNum, int score) {
        this.starNum = starNum;
        this.score = score;
        
        label1 = new JLabel();
        add(label1);
        
        label2 = new JLabel();
        add(label2);

        initialize();
        addStart();
    }

    public void initialize() {
        label1.setText("Star " + starNum + ": " + score);
        label1.setFont(label1.getFont().deriveFont(17.0f));
//        GroupLayout groupLayout = new GroupLayout(this);
//        groupLayout.setVerticalGroup(
    }

    public void addStart() {
        try {
            Image img = ImageIO.read(new File("Images/star-20.png"));
            label2.setIcon(new ImageIcon(img));
            toggleStar();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void toggleStar() {
        label2.setVisible(state);
        state = !state;
    }
}
