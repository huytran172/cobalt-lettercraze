package player.view;

import java.awt.EventQueue;

import builder.view.splash.BuilderSplashWindow;
import player.view.game.GameFrame;
import player.view.menu.MenuScreenFrame;
import player.view.splash.SplashScreenWindow;

public class PlayerApplication {
	public static void main(String[] args) {
		new PlayerApplication().runPlayerApp();	
	}
	
	SplashScreenWindow splashScreen;
	MenuScreenFrame frame;
	
	public void runPlayerApp(){
		splashScreen = new SplashScreenWindow(2000);
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
	
	public SplashScreenWindow getSplash(){
		return splashScreen;
	}
}
