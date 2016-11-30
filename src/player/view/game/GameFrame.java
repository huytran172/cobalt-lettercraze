package player.view.game;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameFrame extends JFrame {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public GameFrame(int level) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 1000, 800);
		if (level % 3 == 1) {
			contentPane = new GamePanelPuzzle();
		}
		if (level % 3 == 2) {
			contentPane = new GamePanelLightning();
		}
		if (level % 3 == 0) {
			contentPane = new GamePanelTheme();
		}
		setContentPane(contentPane);
	}

}
