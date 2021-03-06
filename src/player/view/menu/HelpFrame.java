package player.view.menu;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelpFrame extends JFrame {
	private JPanel contentPane;
	private MenuScreenFrame menuFrame;

	/**
	 * Create the frame.
	 * @param currentFrame 
	 */
	public HelpFrame(MenuScreenFrame menuFrame) {
		this.menuFrame = menuFrame;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = 800;
	    int height = 600;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    setBounds(x,y,width,height);
		contentPane = new HelpPanel();
		setContentPane(contentPane);
	}
	
	public MenuScreenFrame getMenuFrame(){
		return menuFrame;
	}

}
