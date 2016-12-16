package builder.view.editGame;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import builder.view.editGame.lightning.LightningGamePanel;
import builder.view.editGame.puzzle.PuzzleGamePanel;
import builder.view.editGame.theme.ThemeGamePanel;



public class GameFrame extends JFrame {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public GameFrame(int levelNum, boolean add) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);	
		if (levelNum%3 == 1){
			contentPane = new PuzzleGamePanel(levelNum, add);
		}
		else if (levelNum%3 == 2){
			contentPane = new LightningGamePanel(levelNum, add);
		}
		else if (levelNum%3 == 0){
			contentPane = new ThemeGamePanel(levelNum, add);
		}
		
		setContentPane(contentPane);
	}

}
