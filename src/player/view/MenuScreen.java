package player.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen extends JFrame {
	JButton[] levelButton = new JButton[15];
	JButton tutorialButton = new JButton();
	
	private Model model;
	
	public MenuScreen(Model model) {
		this.model = model;
	}

	public void showMenu() {
		JPanel menuScreenPanel = (JPanel) getContentPane();
		
		// Set the window's bounds, centering the window
	    int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);
	    menuScreenPanel.add(new menuScreenPanel());
	    
		setVisible(true);
	}
}
