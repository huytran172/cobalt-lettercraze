package builder.view;

import java.awt.EventQueue;

import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.editGame.GameFrame;
import builder.view.splash.BuilderSplashWindow;

public class BuilderApplication {
	public static void main(String[] args) {
		new BuilderApplication().runBuilderApp();
	}
	BuilderSplashWindow splashScreen;
	DropMenuFrame frame;
	
	public void runBuilderApp(){
		splashScreen = new BuilderSplashWindow(2000);
		splashScreen.showSplash();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DropMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public BuilderSplashWindow getSplash(){
		return splashScreen;
	}
	
	public DropMenuFrame getDropMenu(){
		return frame;
	}
}


