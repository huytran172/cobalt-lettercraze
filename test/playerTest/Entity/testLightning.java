package playerTest.Entity;

import java.io.File;

import junit.framework.TestCase;
import player.models.Board;
import player.models.Lightning;
import player.models.LightningTimer;

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
    }
}
