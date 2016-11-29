package player.view;

import javax.swing.JPanel;
import javax.swing.JWindow;

public class SplashScreenWindow extends JWindow{

	private int duration;
	
	public SplashScreenWindow(int d) {
		this.duration = d;
	}

	public void showSplash() {
		JPanel content = (JPanel) getContentPane();
		setBounds(0,0,500,500);
		setVisible(true);
		try {
			Thread.sleep(duration);
		} catch (Exception e) {}
		setVisible(false);
	}
}
