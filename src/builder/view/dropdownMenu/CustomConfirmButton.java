package builder.view.dropdownMenu;

import java.awt.Dimension;
import java.awt.Font;
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

import builder.view.editGame.GameFrame;

/**
 * Class custom button
 * Redraw the level button in the menu screen
 * @author LUL
 */

public class CustomConfirmButton extends JButton implements ActionListener {
	// Remove later
	private int level;
	//private boolean active;

	// Add later
	// private Model model;

	// TODO: Retrieve data from the model to display in the button
	// e.g current level number, number of stars
	//	public CustomLevelButton(Model m) {
	//	}
	
	/**
	 * Constructor
	 * Will be removed later
	 */
	public CustomConfirmButton() {
		this.level = level;
		addActionListener(this);
		drawConfirmButton();
	}
	
		/**
		 * Draw the button
		 */
		private void drawConfirmButton() {
			setVerticalTextPosition(SwingConstants.TOP);
			setHorizontalTextPosition(SwingConstants.CENTER);
			setIconTextGap(30);
		    setPreferredSize(new Dimension(100, 100));
			setText("OK!");
		}
	


	public void actionPerformed(ActionEvent e) {
		DropMenuFrame currentFrame = (DropMenuFrame) SwingUtilities.getRoot(this);
		currentFrame.dispose();
		GameFrame gframe = new GameFrame(level);
		gframe.setVisible(true);
		
	}
}
