package player.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SplashScreenPanel extends JPanel {
	 private BufferedImage splashScreen;

	    public SplashScreenPanel() {
	       try {                
	          splashScreen = ImageIO.read(new File("/cobalt-lettercraze/Images/SplashScreen.png"));
	       } catch (IOException ex) {
	       }
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(splashScreen, 0, 0, this); // see javadoc for more info on the parameters            
	    }
}
