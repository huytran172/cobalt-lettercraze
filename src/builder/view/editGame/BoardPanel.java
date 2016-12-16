package builder.view.editGame;

import javax.swing.JButton;
import javax.swing.JPanel;

import player.models.Board;
import player.view.menu.CustomLevelButton;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class BoardPanel extends JPanel {
	protected Board board;
	protected SquarePanel[] squares = new SquarePanel[36];
	
	/**
	 * Create the panel.
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * Constructor
	 * @param  board Board
	 */
	public BoardPanel(Board board) {
		this.board = board;
		GridLayout gridLayout = new GridLayout(6, 6);
		//GridBagLayout gridLayout = new GridBagLayout();
		setLayout(gridLayout);
		
		for (int i = 0; i < 36; i++) {
			squares[i] = new SquarePanel(this.board.getSquareList().get(i));
			add(squares[i]);
		}
	}
}
