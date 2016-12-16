package playerTest.Entity;

import java.util.ArrayList;

import junit.framework.TestCase;
import player.models.Letter;
import player.models.Square;
import player.models.Word;
import player.models.score.ScoreLightning;
import player.models.score.ScorePuzzle;
import player.models.score.ScoreTheme;

public class testScore extends TestCase {
	public void testScorePuzzle(){
		Letter letter = new Letter("s");
		Square square1 = new Square(letter,1,1,false);
		Word word = new Word(new ArrayList<Square>());
		word.addSquareToWord(square1);
		
		int threshold[] = new int[3];
		threshold[0] = 2;
		threshold[1] = 3;
		threshold[2] = 4;
		ScorePuzzle sp = new ScorePuzzle(threshold, 10);
		sp.updateScore(word);
		sp.removeScore(word);
		sp.calculateStar();
		sp.updateScore(word);
		sp.calculateStar();
		sp.updateScore(word);
		sp.updateScore(word);
		sp.getHighScoreList();
		assertEquals(sp.getHighScore(), 10);
		sp.calculateStar();
		sp.setScore(3);
		assertEquals(sp.getScore(), 3);
		sp.setHighScore(15);
		sp.updateHighScore();
		assertEquals(sp.getHighScore(), 15);
		sp.setScore(20);
		sp.updateHighScore();
		assertEquals(sp.getHighScore(), 20);
	}
	
	public void testScoreLightning(){
		Letter letter = new Letter("s");
		Square square1 = new Square(letter,1,1,false);
		Word word = new Word(new ArrayList<Square>());
		word.addSquareToWord(square1);
		
		int threshold[] = new int[3];
		threshold[0] = 2;
		threshold[1] = 3;
		threshold[2] = 4;
		ScoreLightning sl = new ScoreLightning(threshold, 10);
		sl.updateScore(word);
		sl.removeScore(word);
	}
	
	public void testScoreTheme(){
		Letter letter = new Letter("s");
		Square square1 = new Square(letter,1,1,false);
		Word word = new Word(new ArrayList<Square>());
		word.addSquareToWord(square1);
		
		int threshold[] = new int[3];
		threshold[0] = 2;
		threshold[1] = 3;
		threshold[2] = 4;
		ScoreTheme st = new ScoreTheme(threshold, 10);
		st.updateScore(word);
		st.removeScore(word);
	}
}
