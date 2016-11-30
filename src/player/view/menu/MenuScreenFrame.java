package player.view.menu;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreenFrame extends JFrame {
	private JPanel contentPane;

	public MenuScreenFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);
		contentPane = new MenuScreenPanel();
		setContentPane(contentPane);
	}
}
