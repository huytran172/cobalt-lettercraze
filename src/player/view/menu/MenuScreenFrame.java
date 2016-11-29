package player.view.menu;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreenFrame extends JFrame {
	private JPanel contentPane;

	public MenuScreenFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 375);		
		contentPane = new MenuScreenPanel();
		setContentPane(contentPane);
	}
}
