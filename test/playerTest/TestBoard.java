package playerTest;

import java.util.ArrayList;

import junit.framework.TestCase;
import player.models.Board;
import player.models.Square;
import player.models.Word;

public class TestBoard extends TestCase {
	public void testInitializeGeneralBoard() {
		Board b = new Board();
		b.initialize();
		b.getSquareList();
		assertEquals(b.getSquare(0, 0), b.getSquareList().get(0));
		assertEquals(b.getSquareList().size(), 36);
	}
	
	public void testInitializeBoardWithShape() {
		Board b = new Board();
		String boardShape = "1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0";
		b.initialize(boardShape);
		assertEquals(b.getSquare(0, 0), b.getSquareList().get(0));
		assertEquals(b.getSquareList().size(), 36);
	}
	
	public void testInitializeBoardWithShapeAndWords() {
		Board b = new Board();
		String boardShape = "1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0";
		String themeAndWords[] = new String[] { "Color", "Red", "Green"};
		b.initialize(boardShape, themeAndWords);
		assertEquals(b.getSquare(0, 0), b.getSquareList().get(0));
		assertEquals(b.getSquareList().size(), 36);
		assertEquals(b.getSquare(0, 0).getLetter().getS(), "R");
		assertEquals(b.getSquare(0, 1).getLetter().getS(), "E");
		assertEquals(b.getSquare(0, 2).getLetter().getS(), "D");
		assertEquals(b.getSquare(0, 3).getLetter().getS(), "G");
		assertEquals(b.getSquare(0, 4).getLetter().getS(), "R");
		assertEquals(b.getSquare(0, 5).getLetter().getS(), "E");
		assertEquals(b.getSquare(1, 5).getLetter().getS(), "E");
		assertEquals(b.getSquare(2, 5).getLetter().getS(), "N");
	}
	
	public void testGetSet() {
		Board b = new Board();
		b.initialize();
		b.setActiveWord(new Word(new ArrayList<Square>()));
		assertEquals(b.size(), b.getSquareList().size());
		assertEquals(b.get(0), b.getSquareList().get(0));
	}
	
	public void testToggle() {
		Board b = new Board();
		b.initialize();
		b.toggleSquare(b.getSquareList().get(1));
		assertTrue(b.getSquareList().get(1).isEnabled());
	}
	
	public void testUpdateActiveWord() {
		
	}
	
}
