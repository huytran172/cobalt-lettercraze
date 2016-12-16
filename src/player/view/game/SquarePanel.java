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
	private Square square;

	/**
	 * Constructor
	 * @param  square square
	 */
	public SquarePanel(Square square) {
		this.square = square;
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setBackground(Color.WHITE);
		putLetter();
		initialize(square.isEnabled());
	}

	/**
	 * put the letter in the square
	 */
	public void putLetter() {
		JLabel label = new JLabel();
		label.setText(this.square.getLetter().getS());
		label.setFont(label.getFont().deriveFont(25.0f));
		this.removeAll();
		this.add(label);
	}

	/**
	 * initialize the square
	 * @param enabled boolean
	 */
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

	/**
	 * hide the square
	 * @param state state
	 */
	public void hideSquare(boolean state) {
		this.setVisible(state);
	}

	/**
	 * toggle the enable square
	 */
	public void toggleEnableSquare() {
		this.square.toggleEnabled();
		enableSquare(square.isEnabled());
	}

	/**
	 * toggle selected
	 */
	public void toggleJustSelected() {
		this.square.toggleSelect();
	}

	/**
	 * toggle color
	 */
	public void toggleJustColor() {
		if (this.getBackground() == Color.GRAY) {
			this.setBackground(Color.white);
		} else {
			this.setBackground(Color.gray);
		}
	}

	/**
	 * enable color
	 * @param state boolean
	 */
	public void enableColor(boolean state) {
		if (state) {
			this.square.select();
			this.setBackground(Color.gray);
		} else {
			this.square.deselect();
			this.setBackground(Color.white);
		}
	}
	
	/**
	 * set the state of the square
	 * @param b boolean, true: white, else gray
	 */
	public void setSquareEnable(Boolean b) {
		if (b) this.setBackground(Color.WHITE);
		else this.setBackground(Color.GRAY);
	}
}
