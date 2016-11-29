package player.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreenFrame extends JFrame {
	private JPanel contentPane;

	MenuScreenFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 375);		
		contentPane = new MenuScreenPanel();
		setContentPane(contentPane);
	}
}
