package player.view.game;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

import player.models.Level;
import player.models.Lightning;
import player.models.Model;
import player.models.Puzzle;
import player.models.Theme;
import player.view.game.gamepanel.GamePanelLightning;
import player.view.game.gamepanel.GamePanelPuzzle;
import player.view.game.gamepanel.GamePanelTheme;
import player.view.menu.MenuScreenFrame;

/**
 * The panel where player plays the game
 * @author cobalt
 *
 */

public class GameFrame extends JFrame {
//	Model m;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	protected JPanel contentPane;
	protected JFrame menuScreenFrame;

	public GameFrame(Level level, JFrame menuScreenFrame) {
		this.menuScreenFrame = menuScreenFrame;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);
	    
		if (level.getType().equals("puzzle")) {
			contentPane = new GamePanelPuzzle((Puzzle) level);
		}

		if (level.getType().equals("lightning")) {
			contentPane = new GamePanelLightning((Lightning) level);
		}	

		if (level.getType().equals("theme")) {
			contentPane = new GamePanelTheme((Theme) level);
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
	
	public MenuScreenFrame getMenuFrame() {
		return (MenuScreenFrame) menuScreenFrame;
	}
	
	public GameFrame getGameFrame() {
		return (GameFrame) menuScreenFrame;
	}
}
