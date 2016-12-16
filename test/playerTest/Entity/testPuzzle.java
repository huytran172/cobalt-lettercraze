package playerTest.Entity;

import java.io.File;

import junit.framework.TestCase;
import player.models.Puzzle;

public class testPuzzle extends TestCase {
	public void testPuzzle(){
		File f = new File("../cobalt-lettercraze/levels/Level1.txt");
		Puzzle puzzle = new Puzzle(f);
		assertTrue(puzzle.endLevel());
		assertFalse(puzzle.reset());
		assertTrue(puzzle.undo());
		puzzle.initialize();
		assertEquals(puzzle.getType(), "puzzle");
	}
}
