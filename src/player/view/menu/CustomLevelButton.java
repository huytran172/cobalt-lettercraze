package player.view.menu;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * Class custom button
 * Redraw the level button in the menu screen
 * @author LUL
 */

public class CustomLevelButton extends JButton {
	// Remove later
	private int level;
	private int stars;
	
	// Add later
	//	private Model model;

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
		setMargin(new Insets(15, 0, 0, 0));
		setVerticalAlignment(SwingConstants.TOP);
	    setPreferredSize(new Dimension(100, 100));
		setText("Level " + this.level);
	}
}
