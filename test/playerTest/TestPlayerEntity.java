package playerTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import junit.framework.TestCase;
import player.controller.Listener;
import player.models.Board;
import player.models.Dictionary;
import player.models.Letter;
import player.models.Level;
import player.models.Lightning;
import player.models.LightningTimer;
import player.models.Model;
import player.models.Puzzle;
import player.models.QuickSaveState;
import player.models.RandomLetter;
import player.models.Square;
import player.models.StringFileIterator;
import player.models.Theme;
import player.models.Word;
import player.models.score.Score;
import player.models.score.ScoreLightning;
import player.models.score.ScorePuzzle;
import player.models.score.ScoreTheme;

public class TestPlayerEntity extends TestCase {
	
	public void testLetter(){
		Letter random = new Letter("");
		random.setS("a");
		assertEquals(random.getS(), "a");

		Letter e = new Letter("e");
		Letter t = new Letter("t");
		assertEquals(e.getScore(), 1);
		assertEquals(t.getScore(), 1);
		
		Letter a = new Letter("a");
		Letter o = new Letter("o");
		Letter i = new Letter("i");
		Letter n = new Letter("n");
		Letter h = new Letter("h");
		Letter s = new Letter("s");
		Letter r = new Letter("r");
		assertEquals(a.getScore(), 2);
		assertEquals(o.getScore(), 2);
		assertEquals(i.getScore(), 2);
		assertEquals(n.getScore(), 2);
		assertEquals(h.getScore(), 2);
		assertEquals(s.getScore(), 2);
		assertEquals(r.getScore(), 2);
		
		Letter f = new Letter("f");
		Letter g = new Letter("g");
		Letter y = new Letter("y");
		Letter p = new Letter("p");
		Letter b = new Letter("b");
		assertEquals(f.getScore(), 4);
		assertEquals(g.getScore(), 4);
		assertEquals(y.getScore(), 4);
		assertEquals(p.getScore(), 4);
		assertEquals(b.getScore(), 4);
		
		Letter v = new Letter("v");
		Letter k = new Letter("k");
		assertEquals(v.getScore(), 5);
		assertEquals(k.getScore(), 5);
		
		Letter j = new Letter("j");
		Letter x = new Letter("x");
		assertEquals(j.getScore(), 7);
		assertEquals(x.getScore(), 7);
		
		Letter q = new Letter("q");
		Letter z = new Letter("z");
		assertEquals(q.getScore(), 8);
		assertEquals(z.getScore(), 8);
		
		Letter qu = new Letter("qu");
		assertEquals(qu.getScore(), 11);
		
		Letter c = new Letter("c");
		assertEquals(c.getScore(), 3);
		
		c.setStringEmpty();
		assertTrue(c.isEmptyString());
		assertFalse(qu.isEmptyString());
	}
	
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
	
	public void testBoard(){
		Board b = new Board();
		Letter a = new Letter("A");
		Square s = new Square(a, 0, 0, false);
		Square s1 = new Square(a, 1, 1, true);
		Word word = new Word(new ArrayList<Square>());
		word.addSquareToWord(s);
		//assertFalse(b.updateActiveWord(s));
		b.initialize();
		Listener list = null;
		b.addListener(list);
		b.removeListener(list);
		b.toggleSquare(s);
		b.notifyListeners();
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
		
		//b.undo();
		
		b.initialize("");
		b.initialize("", null);
		//b.updateBoard();
		
	}

	
	public void testDictionary(){
		Dictionary d = new Dictionary();
		try {
			d.loadWordTable();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.isWord("Software");
		d.isWord("$(&YO*&^*^#@");
	}
	
	public void testLevel(){
		Board b = new Board();
		//Level l = new Level();
		
	}
	
	public void testModel(){
		Model m = new Model();
	}
	
	public void testLightning(){
		File f = new File("Level1.txt");
		Lightning lightning = new Lightning(f);
		assertTrue(lightning.endLevel());
		assertFalse(lightning.reset());
		assertTrue(lightning.undo());
		lightning.initialize();
	}
	
	public void testPuzzle(){
		File f = new File("Level1.txt");
		Puzzle puzzle = new Puzzle(f);
		assertTrue(puzzle.endLevel());
		assertFalse(puzzle.reset());
		assertTrue(puzzle.undo());
		puzzle.initialize();
	}
	
	public void testTheme(){
		Theme theme = new Theme("colors", null, null);
		assertTrue(theme.endLevel());
		assertFalse(theme.reset());
		assertTrue(theme.undo());
		theme.initialize();
	}
	
	public void testWord(){
		Letter letter = new Letter("s");
		Square square1 = new Square(letter,1,1,false);
		Word word = new Word(new ArrayList<Square>());
		word.addSquareToWord(square1);
		
		Letter letter2 = new Letter("u");
		Square square2 = new Square(letter2,1,1,false);
		word.addSquareToWord(square2);
		System.out.println(word.getWord());
		
		//assertFalse(word.validWord());
		
		Letter letter3 = new Letter("n");
		Square square3 = new Square(letter3,1,1,false);
		word.addSquareToWord(square3);
		word.clearWord();
		//word.main(null);
		//assertTrue(word.validWord());
		assertEquals(word.calcWordScore(), 7);
		
	}
	
	public void testRandomLetter(){
		RandomLetter rl = new RandomLetter();
		rl.generateLetter();
	}
	
	public void testLightningTimer(){
		LightningTimer lt = new LightningTimer();
		//lt.createAndShowUI();
		lt.showNextPanel();
		lt.main(null);
		
	}
	
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
	
	public void testThemeLightning(){
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
	
	public void testQuickSave(){
		ArrayList<Square> squares = new ArrayList<Square>(36);
		int currentScore = 0;
//		QuickSaveState qss = new QuickSaveState(squares, currentScore);
//		assertEquals(qss.getScore(), 0);
//		qss.updateArrayList(squares);
//		qss.updateScore(5);
//		assertEquals(qss.getScore(), 5);
//		assertEquals(qss.getArrayList(), squares);
//		qss.clearSaveState();
	}
}
