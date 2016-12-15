package playerTest;


import junit.framework.TestCase;
import player.view.Menu;
import player.view.PlayerApplication;
import player.view.WinGameFrame;
import player.view.game.GameFrame;
import player.view.menu.HelpFrame;
import player.view.menu.MenuScreenFrame;

public class TestPlayerView extends TestCase{
	PlayerApplication alc = new PlayerApplication();
	
	public void testSplashGUI(){
		alc.runPlayerApp();
		assertFalse(alc.getSplash().isVisible());
		alc.main(null);
	}
	
	public void testMenuGUI(){
		Menu m = new Menu();
		m.main(null);
		m.initialize();
		
		MenuScreenFrame msf = new MenuScreenFrame();
		HelpFrame hf = new HelpFrame();
		
	}
	
	public void testGameGUI(){
		GameFrame gf1 = new GameFrame(1);
		GameFrame gf2 = new GameFrame(2);
		GameFrame gf3 = new GameFrame(3);
		WinGameFrame wgf = new WinGameFrame();
	}

}
