package player.view.game;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SquarePanel extends JPanel {
	// Remove later
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
			public SquarePanel(boolean active) {
				this.active = active;
				setActive(this.active);
			}
			
			/**
			 * Set status of the button and redraw the button
			 * @param active button is active or not
			 */
			public void setActive(boolean active) {
				this.active = active;
				setEnabled(this.active);
				this.setBorder(BorderFactory.createLineBorder(Color.black));
				this.setBackground(Color.WHITE);
				//redrawLevelButton();
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
			/*
			private void redrawLevelButton() {
				setVerticalTextPosition(SwingConstants.CENTER);
				setHorizontalTextPosition(SwingConstants.CENTER);
				setIconTextGap(30);
			    setPreferredSize(new Dimension(100, 100));
				//setText("Level " + this.level);
				//drawStarsToButton();
			}
*/
}
