package player.view.game;

import player.models.Square;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class SquarePanel extends JPanel {
	// Remove later
			private boolean enabled;
			private Square square;

			// Add later
			// private Model model;

			// TODO: Retrieve data from the model to display in the button
			// e.g current level number, number of stars
			//	public CustomLevelButton(Model m) {
			//	}
			
			/**
			 * Constructor
			 * Will be removed later
			 * @param enabled state of SquarePanel
			 */
			public SquarePanel(Square square, boolean enabled) {
				this.square = square;
				this.enabled = enabled;
				this.setBorder(BorderFactory.createLineBorder(Color.black));
				this.setBackground(Color.WHITE);
				putLetter();
				setEnable(this.enabled);
				//square = new Square()
			}

			public void putLetter() {
				JLabel label = new JLabel();
				label.setText(this.square.getLetter().getS());
				label.setFont(label.getFont().deriveFont(25.0f));
				this.add(label);
			}

			/**
			 * Set status of the button and redraw the button
			 * @param enabled square is enabled or not
			 */
			public void setEnable(boolean enabled) {
				this.enabled = enabled;
				this.setVisible(this.enabled);
				this.setEnabled(this.enabled);
				//redrawLevelButton();
			}

			public void toggleEnable() {
				setEnable(!enabled);
			}
			
			/**
			 * Return whether the button is active or not
			 */
			public boolean isEnable() {
				return this.enabled;
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
