package builder.view.splash;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JWindow;

public class BuilderSplashWindow extends JWindow{

	private int duration;
	
	/**
	 * Constructor
	 * @param  d duration
	 */
	public BuilderSplashWindow(int d) {
		this.duration = d;
	}

	/**
	 * Initialize the splash screen
	 */
	public void showSplash() {
		JPanel content = (JPanel) getContentPane();
		
		// Set the window's bounds, centering the window
	    int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);
	    content.add(new BuilderSplashPanel());
	    
		setVisible(true);
		try {
			Thread.sleep(duration);
		} catch (Exception e) {}
		setVisible(false);
	}
}

