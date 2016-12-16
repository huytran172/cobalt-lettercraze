package playerTest.Entity;

import java.io.File;

import junit.framework.TestCase;
import player.models.Board;
import player.models.Lightning;
import player.models.LightningTimer;

public class testLightning extends TestCase {
	public void testLightning(){
		File f = new File("../cobalt-lettercraze/levels/Level11.txt");
		Lightning lightning = new Lightning(f);
		assertTrue(lightning.endLevel());
		assertFalse(lightning.reset());
		assertTrue(lightning.undo());
		lightning.initialize();
		assertEquals(lightning.getType(), "lightning");
		lightning.setIndex(2);
		assertEquals(lightning.getIndex(), 2);
		System.out.print(lightning.getThreshold());
		System.out.println(lightning.getBoard());
		lightning.getScore();
		//lightning.writeToFile(f);
		lightning.toString();
		assertEquals(lightning.getTime(), 56);
	}
	
	public void testLightningTimer(){
		LightningTimer lt = new LightningTimer();
		//lt.createAndShowUI();
		lt.showNextPanel();
		lt.main(null);
		
		}
}
