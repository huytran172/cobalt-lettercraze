package player.view.menu;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.SwingPropertyChangeSupport;

import player.view.game.GameFrame;

/**
 * Class custom button
 * Redraw the level button in the menu screen
 * @author LUL
 */

public class CustomLevelButton extends JButton implements ActionListener {
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
	public CustomLevelButton(int level, int stars, boolean active) {
		this.level = level;
		this.stars = stars;
		this.active = active;
		setActive(this.active);
		addActionListener(this);
	}
	
	/**
	 * Set status of the button and redraw the button
	 * @param active button is active or not
	 */
	public void setActive(boolean active) {
		this.active = active;
		setEnabled(this.active);
		if (active) {
			drawStarsToButton();
		}
		redrawLevelButton();
	}
	
	/**
	 * Return whether the button is active or not
	 */
	public boolean isActive() {
		return this.active;
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
		// drawStarsToButton();
	}
	
	/**
	 * Draw stars to the button
	 * TODO draw number of stars according to the model
	 */
	private void drawStarsToButton() {
		try {
			Image img = ImageIO.read(new File("Images/star-20.png"));
			setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		MenuScreenFrame currentFrame = (MenuScreenFrame) SwingUtilities.getRoot(this);
		currentFrame.dispose();
		GameFrame gframe = new GameFrame(this.level);
		gframe.setVisible(true);
	}
}
