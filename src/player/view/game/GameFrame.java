package player.view.game;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

import player.models.Lightning;
import player.models.Model;
import player.models.Puzzle;
import player.models.Theme;

/**
 * The panel where player plays the game
 * @author cobalt
 *
 */

public class GameFrame extends JFrame {
	Model m;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public GameFrame(int level) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);
	    
	    String str;
	    str = String.format("../cobalt-lettercraze/levels/Level%d.txt", level);
		if (level % 3 == 1) {
			contentPane = new GamePanelPuzzle(new Puzzle(new File(str)));
		}

		if (level % 3 == 2) {
			contentPane = new GamePanelLightning(new Lightning(new File(str)));
		}	

		if (level % 3 == 0) {
			contentPane = new GamePanelTheme(new Theme(new File(str)));
		}

		setContentPane(contentPane);
	}
	
	public GameFrame(String mode, String file) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);

		if (mode.equals("theme")) {
			contentPane = new GamePanelTheme(new Theme(new File(file)));
		} 
		
		if (mode.equals("puzzle")) {
			contentPane = new GamePanelPuzzle(new Puzzle(new File(file)));
		}
		
		if (mode.equals("lightning")) {
			contentPane = new GamePanelLightning(new Lightning(new File(file)));
		}

		setContentPane(contentPane);
	}
}
