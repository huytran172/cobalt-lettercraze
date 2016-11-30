package builder.view.editGame;
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

	public GameFrame(int levelNum) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 1000, 800);		
		if (levelNum%3 == 1){
			contentPane = new PuzzleGamePanel();
		}
		else if (levelNum%3 == 2){
			contentPane = new LightningGamePanel();
		}
		else if (levelNum%3 == 0){
			contentPane = new ThemeGamePanel();
		}
		else{
			contentPane = new PuzzleGamePanel();
		}
		setContentPane(contentPane);
	}

}
