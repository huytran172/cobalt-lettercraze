package player.view.game;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameFrame extends JFrame {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 800, 600);		
		contentPane = new GamePanel();
		setContentPane(contentPane);
	}

}
