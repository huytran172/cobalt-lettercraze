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
	public BoardPanel getBoardPanel() {
		return (BoardPanel) boardPanel;
	}

	public void setBoardPanel(JPanel boardPanel) {
		this.boardPanel = boardPanel;
	}

	JPanel titlePanel;
	PuzzleInfoPanel infoPanel;
	//JPanel starPanel;
	
	public PuzzleInfoPanel getInfoPanel() {
		return infoPanel;
	}

	public PuzzleGamePanel(int levelNum, boolean add){
		
		this.setLayout(null);
		
		Board b = new Board();
		b.initialize();
		boardPanel = new BoardPanel(b);
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new PuzzleInfoPanel(b, levelNum, add);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    
	    
	    titlePanel = new TitlePanel("Puzzle");
	    add(titlePanel);
	    titlePanel.setBounds(40, 20, 600, 60);

	}

	public PuzzleInfoPanel getInfoPanel() {
		// TODO Auto-generated method stub
		return this.infoPanel;
	}
}