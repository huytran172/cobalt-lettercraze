package playerTest.Entity;

import java.util.ArrayList;

import junit.framework.TestCase;
import player.models.Letter;
import player.models.Square;
import player.models.Word;

public class testWord extends TestCase {
	public void testWord(){
		Letter letter = new Letter("s");
		Square square1 = new Square(letter,1,1,false);
		Word word = new Word(new ArrayList<Square>());
		word.addSquareToWord(square1);
		
		Letter letter2 = new Letter("u");
		Square square2 = new Square(letter2,1,1,false);
		word.addSquareToWord(square2);
		System.out.println(word.getWord());
		assertFalse(word.validWord());
		
		Letter letter3 = new Letter("n");
		Square square3 = new Square(letter3,1,1,false);
		word.addSquareToWord(square3);
		assertEquals(word.getWordString(), "sun");
		assertTrue(word.validWord());
		assertEquals(word.calcWordScore(), 7);
		word.clearWord();
		
		assertFalse(word.addSquareToWord(square1));
		System.out.print(word.getWordString());
		assertEquals(word.getWordString(), "");
		
		word.deleteWord();
		word.getSquares();
		
		//word.main(null);
		//assertTrue(word.validWord());
		
		
	}
}
