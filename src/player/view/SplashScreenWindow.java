package player.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class SplashScreenWindow extends JWindow {
	/**
	 * Dureation of the splash screen
	 */
	private int duration;
	
	public SplashScreenWindow(int duration) {
		this.duration = duration;
	}
	
	/**
	 * Initialize splash screen similar to design and show it
	 */
	public void show() {
		JPanel content = (JPanel) getContentPane();
		setBounds(0, 0, 800, 600);
		setVisible(true);
		content.add(new SplashScreenPanel());
//		 Wait a little while, maybe while loading resources
		try { Thread.sleep(duration); } catch (Exception e) {}

		setVisible(false);
	}
}
