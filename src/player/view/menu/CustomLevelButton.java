package player.view.menu;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.event.SwingPropertyChangeSupport;

/**
 * Class custom button
 * Redraw the level button in the menu screen
 * @author LUL
 */

public class CustomLevelButton extends JButton {
	// Remove later
	private int level;
	private int stars;
	private boolean active;

	// Add later
	// private Model model;

	// TODO: Retrieve data from the model to display in the button
	// e.g current level number, number of stars
	//	public CustomLevelButton(Model m) {
	//	}
	
	/**
	 * Constructor
	 * Will be removed later
	 * @param level current level number
	 * @param stars numbers of star
	 */
	public CustomLevelButton(int level, int stars) {
		this.level = level;
		this.stars = stars;
		redrawLevelButton();
	}
	
	/**
	 * Redraw the button to show level 
	 */
	private void redrawLevelButton() {
		setVerticalTextPosition(SwingConstants.TOP);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setIconTextGap(30);
	    setPreferredSize(new Dimension(100, 100));
		setText("Level " + this.level);
		try {
			Image img = ImageIO.read(new File("Images/star-20.png"));
			setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
