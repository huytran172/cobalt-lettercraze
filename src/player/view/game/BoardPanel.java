package player.view.game;

import javax.swing.JButton;
import javax.swing.JPanel;

import player.controller.BoardController;
import player.models.Board;
import player.models.Square;
import player.models.Word;
import player.view.menu.CustomLevelButton;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

public class BoardPanel extends JPanel {
	private SquarePanel[] squarePanels = new SquarePanel[36];
	private Board board;
	private ArrayList<Square> squareModels;
	
	// temp storage of word being built/.  MOVE TO BOARD
	private ArrayList<Square> word = new ArrayList<Square>();
	
	public ArrayList<Square> getWord() { 
		return word;
	}
	
	/**
	 * Create the panel.
	 */
	public BoardPanel(Board board) {
		this.board = board;
		GridLayout gridLayout = new GridLayout(6, 6, 10, 10);
		setLayout(gridLayout);
		squareModels = board.getSquareList();
		for (int i = 0; i < 36; i++) {
			squarePanels[i] = new SquarePanel(squareModels.get(i));
			squarePanels[i].addMouseListener(new BoardController(squarePanels[i], squareModels.get(i), this, board));
			add(squarePanels[i]);
		}
	}

	/**
	 * Deselect the active word
	 * @param word Word
	 */
	public void deselectWord(Word word) {
		ArrayList<Square> wordSquares = word.getSquares();
		int index;
		for (int i = 0; i < wordSquares.size(); i++) {
			index = squareModels.indexOf(wordSquares.get(i));
			squarePanels[index].toggleJustColor();
			squarePanels[index].toggleJustSelected();
		}
	}

	/**
	 * toggle the color of the word
	 * @param word Word
	 */
	public void toggleJustColorWord(Word word) {
		ArrayList<Square> wordSquares = word.getSquares();
		int index;
		for (int i = 0; i < wordSquares.size(); i++) {
			index = squareModels.indexOf(wordSquares.get(i));
			squarePanels[index].toggleJustColor();
		}
	}

	/**
	 * Redraw and revalidate the square panels
	 */
	public void reputLetter() {
		for (int i = 0; i < squarePanels.length; i++) {
			squarePanels[i].putLetter();
			squarePanels[i].revalidate();
			squarePanels[i].repaint();
		}
	}

	/**
	 * Set the board enabled
	 * @param b boolean
	 */
	public void setBoardEnabled(Boolean b) {
		for (int i = 0; i < squarePanels.length; i++) {
			squarePanels[i].setSquareEnable(b);
			squarePanels[i].revalidate();
			squarePanels[i].repaint();
		}
	}

	/**
	 * Get the board
	 * @return Board
	 */
	public Board getBoard() {
		return this.board;
	}
}
