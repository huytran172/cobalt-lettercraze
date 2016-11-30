package builder.view.splash;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BuilderSplashPanel extends JPanel {
	private BufferedImage splashScreen;

	public BuilderSplashPanel() {
		try {                
			splashScreen = ImageIO.read(new File("Images/BuilderSplashScreen.png"));
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(splashScreen, 0, 0, this); // see javadoc for more info on the parameters            
	}
}