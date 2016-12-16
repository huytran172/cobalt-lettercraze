package playerTest.Entity;

import java.io.File;

import junit.framework.TestCase;
import player.models.Board;
import player.models.Lightning;
import player.models.LightningTimer;
import player.models.Theme;

public class testLightning extends TestCase {
	public void testInitializeLightning() {
        File f = new File("../cobalt-lettercraze/testLevel/level2.txt");
        Lightning p = new Lightning(f);
        assertEquals(p.getTime(), 30);
        assertEquals(p.getThreshold()[0], 4);
        assertEquals(p.getThreshold()[1], 6);
        assertEquals(p.getThreshold()[2], 12);
        assertEquals(p.getIndex(), 2);
        assertEquals(p.getType(), "lightning");
        p.updateLevel();
        p.initialize();
        assertTrue(p.endLevel());
        assertFalse(p.reset());
        assertTrue(p.undo());
        
	}
	
	public void testLightningTimer() {
		LightningTimer t = new LightningTimer();
		t.showNextPanel();
		t.main(null);
	}

	public void testWriteToFile() {
        File read = new File("../cobalt-lettercraze/levels/level2.txt");
        Lightning p = new Lightning(read);
        p.printToFile();
	}
}
