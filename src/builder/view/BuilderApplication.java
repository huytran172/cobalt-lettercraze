package builder.view;

import java.awt.EventQueue;

import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.splash.BuilderSplashWindow;
import player.view.menu.MenuScreenFrame;
import player.view.splash.SplashScreenWindow;

public class BuilderApplication {
	public static void main(String[] args) {
		BuilderSplashWindow splashScreen = new BuilderSplashWindow(1000);
		splashScreen.showSplash();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DropMenuFrame frame = new DropMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
