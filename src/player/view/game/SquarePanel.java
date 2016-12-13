package player.view.game;

import player.models.Square;
import player.view.menu.MenuScreenFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SquarePanel extends JPanel {
	// Remove later
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
			 * @param square state of SquarePanel
			 */
			public SquarePanel(Square square) {
				this.square = square;
				this.setBorder(BorderFactory.createLineBorder(Color.black));
				this.setBackground(Color.WHITE);
				putLetter();
				initialize(square.isEnabled());
			}

			public void putLetter() {
				JLabel label = new JLabel();
				label.setText(this.square.getLetter().getS());
				System.out.print("put letter: " + this.square.getLetter().getS() + "\n");
				label.setFont(label.getFont().deriveFont(25.0f));
				this.removeAll();
				this.add(label);
			}

			public void initialize(boolean enabled) {
				this.setVisible(enabled);
				this.setEnabled(enabled);
			}

			/**
			 * Set status of the button and redraw the button
			 * @param enabled square is enabled or not
			 */
			public void enableSquare(boolean enabled) {
				this.square.setEnabled(enabled);
				this.setEnabled(enabled);
				//redrawLevelButton();
			}

			public void toggleEnableSquare() {
				this.square.toggleEnabled();
				enableSquare(square.isEnabled());
				toggleColor();
			}

			public void toggleColor() {
				this.square.toggleSelect();
				if (square.isSelected()) {
					this.setBackground(Color.GRAY);
				} else {
					this.setBackground(Color.WHITE);
				}
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
