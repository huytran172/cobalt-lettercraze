package playerTest;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;
import player.models.Lightning;
import player.models.Puzzle;
import player.models.Theme;

public class TestLevel extends TestCase {
	public void testInitializePuzzle() {
        File f = new File("../cobalt-lettercraze/testLevel/level1.txt");
        Puzzle p = new Puzzle(f);
        assertEquals(p.getMaxMoves(), 5);
        assertEquals(p.getThreshold()[0], 4);
        assertEquals(p.getThreshold()[1], 6);
        assertEquals(p.getThreshold()[2], 12);
        assertEquals(p.getIndex(), 1);
        assertEquals(p.getType(), "puzzle");
    }

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
	
	public void testFailInitialize() {
		File f = new File("../cobalt-lettercraze/testLevel/level4.txt");
		Theme p = new Theme(f);
	}
}