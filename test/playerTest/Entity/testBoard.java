package playerTest.Entity;

import java.util.ArrayList;

import junit.framework.TestCase;
import player.models.Board;
import player.models.Letter;
import player.models.Square;
import player.models.Word;

public class testBoard extends TestCase {
	public void testBoard(){
		Board b = new Board();
		Letter a = new Letter("A");
		Square s = new Square(a, 0, 0, false);
		Square s1 = new Square(a, 1, 1, true);
		Word word = new Word(new ArrayList<Square>());
		word.addSquareToWord(s);
		//assertFalse(b.updateActiveWord(s));
		b.initialize();
		b.setActiveWord(word);
		b.iterator();
		b.size();
		b.getSquare(0, 0);
		//assertEquals(b.getSquare(0, 0), s);
		b.get(0);
		assertFalse(b.updateActiveWord(s));
		assertTrue(b.updateBoard());
		assertTrue(b.fillEmptySquares());
		assertTrue(b.resetBoard());
		b.getSquare(0, 0);
		b.getSquare(1, 1);
		b.getSquareList();
		b.getTempWord();
		b.renewTempWord();
		assertTrue(b.addSquareToTempWord(s1));
		b.toString();
		b.undo();
		
		b.initialize("");
		b.initialize("", null);
		//b.updateBoard();
		
	}
}
