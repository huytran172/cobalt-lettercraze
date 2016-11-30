package player.view.splash;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JWindow;

public class SplashScreenWindow extends JWindow{

	private int duration;
	
	public SplashScreenWindow(int d) {
		this.duration = d;
	}

	public void showSplash() {
		JPanel content = (JPanel) getContentPane();
		
		// Set the window's bounds, centering the window
	    int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);
	    content.add(new SplashScreenPanel());
	    
		setVisible(true);
		try {
			Thread.sleep(duration);
		} catch (Exception e) {}
		setVisible(false);
	}
}
