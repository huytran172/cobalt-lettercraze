package playerTest.Entity;

import java.io.File;

import junit.framework.TestCase;
import player.models.Theme;

public class testTheme extends TestCase {
	public void testInitializeTheme() {
        File f = new File("../cobalt-lettercraze/testLevel/level3.txt");
        Theme p = new Theme(f);
        assertEquals(p.getTheme(), "Color");
        assertEquals(p.getThreshold()[0], 1);
        assertEquals(p.getThreshold()[1], 6);
        assertEquals(p.getThreshold()[2], 12);
        assertEquals(p.getIndex(), 3);
        assertEquals(p.getType(), "theme");
    }
	
	public void testWriteToFile() {
        File read = new File("../cobalt-lettercraze/levels/level3.txt");
        Theme p = new Theme(read);
        p.printToFile();
	}
}
