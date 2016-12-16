package playerTest;


import java.io.File;

import junit.framework.TestCase;
import player.models.Lightning;
import player.models.Model;
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
		
		HelpFrame hf = new HelpFrame();
		Model model = new Model();
		MenuScreenFrame msf = new MenuScreenFrame(model);
		
		
	}
	
	public void testGameGUI(){
		WinGameFrame wgf = new WinGameFrame();
		File f = new File("Level1.txt");
		Lightning lightning = new Lightning(f);
		GameFrame gf = new GameFrame(lightning);
		GameFrame gf1 = new GameFrame("puzzle", "Level1.txt");
		GameFrame gf2 = new GameFrame("lightning", "Level2.txt");
		GameFrame gf3 = new GameFrame("theme", "Level3.txt");
	}

}
