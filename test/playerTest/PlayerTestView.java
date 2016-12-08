package playerTest;


import junit.framework.TestCase;
import player.view.PlayerApplication;

public class PlayerTestView extends TestCase{
	PlayerApplication alc = new PlayerApplication();
	
	public void testSplashGUI(){
		alc.runPlayerApp();
		assertFalse(alc.getSplash().isVisible());
	}

}
