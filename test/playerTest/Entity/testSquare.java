package playerTest.Entity;

import junit.framework.TestCase;
import player.models.Letter;
import player.models.Square;

public class testSquare extends TestCase {
	public void testSquare(){
		Letter a = new Letter("a");
		Letter empty = new Letter("");
		Square s = new Square(a, 0, 0, false);
		Square s1 = new Square(empty, 0, 0, false);
		s.toggleSelect();
		s.select();
		s.deselect();
		s.select();
		s.toggleSelect();
		s.updateLetter();
		assertEquals(s.getLetter(),a);
		assertTrue(s1.isEmptySquare());
		assertFalse(s.isEmptySquare());
		s.clearSquare();
		assertTrue(s.isEmptySquare());
	}
}
