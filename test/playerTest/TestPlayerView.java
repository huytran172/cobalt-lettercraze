package playerTest;


import java.io.File;

import junit.framework.TestCase;
import player.models.Board;
import player.models.Letter;
import player.models.Lightning;
import player.models.Model;
import player.models.Puzzle;
import player.models.Square;
import player.models.Theme;
import player.view.Menu;
import player.view.PlayerApplication;
import player.view.WinGameFrame;
import player.view.game.BoardPanel;
import player.view.game.GameFrame;
import player.view.game.SquarePanel;
import player.view.game.WordPanel;
import player.view.menu.HelpFrame;
import player.view.menu.MenuScreenFrame;

public class TestPlayerView extends TestCase{
	PlayerApplication alc = new PlayerApplication();
	
	public void testSplashGUI(){
		alc.runPlayerApp();
		assertFalse(alc.getSplash().isVisible());
		alc.main(null);
	}
	
	public void testMenuGUI(){
		Menu m = new Menu();
		m.main(null);
		m.initialize();
		
		HelpFrame hf = new HelpFrame();
		Model model = new Model();
		MenuScreenFrame msf = new MenuScreenFrame(model);
		
	}
	
	public void testGameGUI(){
		WinGameFrame wgf = new WinGameFrame();
		File f1 = new File("../cobalt-lettercraze/levels/Level1.txt");
		File f2 = new File("../cobalt-lettercraze/levels/Level2.txt");
		File f3 = new File("../cobalt-lettercraze/levels/Level3.txt");
		Puzzle puzzle = new Puzzle(f1);
		Lightning lightning = new Lightning(f2);
		Theme theme = new Theme(f3);
		GameFrame gf1 = new GameFrame(puzzle, alc.getFrame());
		GameFrame gf2 = new GameFrame(lightning, alc.getFrame());
		GameFrame gf3 = new GameFrame(theme, alc.getFrame());
		gf1.getGameFrame();
		gf1.getMenuFrame();
		GameFrame gf4 = new GameFrame("puzzle", "../cobalt-lettercraze/levels/Level1.txt");
		GameFrame gf5 = new GameFrame("lightning", "../cobalt-lettercraze/levels/Level2.txt");
		GameFrame gf6 = new GameFrame("theme", "../cobalt-lettercraze/levels/Level3.txt");
	}
	
	public void testSquarePanel(){
		Letter a = new Letter("a");
		Letter empty = new Letter("");
		Square s = new Square(a, 0, 0, false);
		Square s1 = new Square(empty, 0, 0, false);
		SquarePanel sp = new SquarePanel(s);
		sp.enableSquare(true);
		assertTrue(s.isEnabled());
		sp.toggleEnableSquare();
		sp.enableSquare(false);
		assertFalse(s.isEnabled());
		sp.hideSquare(true);
		sp.toggleJustSelected();
		sp.toggleJustColor();
		sp.toggleJustColor();
		sp.enableColor(false);
		sp.setSquareEnable(true);
	}
	
	public void testBoardPanel(){
		Board b = new Board();
//		BoardPanel bp = new BoardPanel(b);
//		bp.getWord();
	}
	
	public void testWordPanel(){
		WordPanel wp = new WordPanel();
		wp.addToWordPanel("color");
		wp.loadWordListState();
		wp.clearWordPanel();
	}
	
}

