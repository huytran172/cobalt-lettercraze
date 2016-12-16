package builder.view.editGame.puzzle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import builder.view.editGame.BoardPanel;
import builder.view.editGame.TitlePanel;
import player.models.Board;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class PuzzleGamePanel extends JPanel {
	JPanel boardPanel;
	JPanel titlePanel;
	JPanel infoPanel;

	/**
	 * Get the board panel
	 */
	public BoardPanel getBoardPanel() {
		return (BoardPanel) boardPanel;
	}

	/**
	 * Set the board panel
	 * @param boardPanel 
	 */
	public void setBoardPanel(JPanel boardPanel) {
		this.boardPanel = boardPanel;
	}

	
	/**
	 * Constructor
	 * @param  levelNum int
	 * @param  add      boolean
	 */
	public PuzzleGamePanel(int levelNum, boolean add){
		this.setLayout(null);
		Board b = new Board();
		b.initialize();
		boardPanel = new BoardPanel(b);
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    infoPanel = new PuzzleInfoPanel(b, levelNum, add);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    titlePanel = new TitlePanel("Puzzle");
	    add(titlePanel);
	    titlePanel.setBounds(40, 20, 600, 60);
	}
}