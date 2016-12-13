package builder.view.editGame;

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
			public SquarePanel(Square square) {
				this.square = square;
				this.enabled = square.isEnabled();
				this.setBorder(BorderFactory.createLineBorder(Color.black));
				this.setBackground(Color.WHITE);
				putLetter();
				initialize(this.enabled);
				addMouseListener(new MouseListener() {
					@Override
					public void mouseClicked(MouseEvent e) {
						toggleSelect();
					}

					@Override
					public void mousePressed(MouseEvent e) {

					}

					@Override
					public void mouseReleased(MouseEvent e) {

					}

					@Override
					public void mouseEntered(MouseEvent e) {

					}

					@Override
					public void mouseExited(MouseEvent e) {

					}
				});
			}

			public void putLetter() {
				JLabel label = new JLabel();
				label.setText(this.square.getLetter().getS());
				label.setFont(label.getFont().deriveFont(25.0f));
				this.add(label);
			}

			public void initialize(boolean enabled) {
				this.enabled = enabled;
				this.setVisible(this.enabled);
				this.setEnabled(this.enabled);
			}

			/**
			 * Set status of the button and redraw the button
			 * @param enabled square is enabled or not
			 */
			public void enableSquare(boolean enabled) {
				this.enabled = enabled;
				this.setEnabled(this.enabled);
				//redrawLevelButton();
			}

			public void toggleEnableSquare() {
				enabled = !enabled;
				enableSquare(enabled);
				toggleColor();
			}
			
			public void toggleSelect() {
				this.square.toggleSelect(); 
				toggleColor();
			}

			public void toggleColor() {
				if (this.enabled && !this.square.isSelected()) {
					this.setBackground(Color.WHITE);
				} else {
					this.setBackground(Color.GRAY);
				}
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
