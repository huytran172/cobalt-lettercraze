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

	public GameFrame(int level) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 1000, 800);		
		contentPane = new ThemeGamePanel();
		setContentPane(contentPane);
	}

}
