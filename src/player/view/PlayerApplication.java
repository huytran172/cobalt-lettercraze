package player.view;

import java.awt.EventQueue;

import player.view.game.GameFrame;
import player.view.menu.MenuScreenFrame;
import player.view.splash.SplashScreenWindow;

public class PlayerApplication {
	public static void main(String[] args) {
<<<<<<< HEAD
		SplashScreenWindow splashScreen = new SplashScreenWindow(2000);
=======
		SplashScreenWindow splashScreen = new SplashScreenWindow(1000);
>>>>>>> builder add edit game view
		splashScreen.showSplash();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuScreenFrame frame = new MenuScreenFrame();
					frame.setVisible(true);
					//GameFrame gframe = new GameFrame();
					//gframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
