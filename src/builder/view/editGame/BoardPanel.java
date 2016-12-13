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
	
	private Board board;
	private SquarePanel[] squares = new SquarePanel[36];
	
	/**
	 * Create the panel.
	 */
	public Board getBoard() {
		return board;
	}


	public BoardPanel(Board board) {
		this.board = board;
		GridLayout gridLayout = new GridLayout(6, 6);
		//GridBagLayout gridLayout = new GridBagLayout();
		setLayout(gridLayout);
		
		for (int i = 0; i < 36; i++) {
			squares[i] = new SquarePanel(this.board.getSquareList().get(i));
			add(squares[i]);
			/*
			GridBagConstraints gbc_btnLevel = new GridBagConstraints();
			gbc_btnLevel.insets = new Insets(20, 30, 20, 28);
			
			gbc_btnLevel.gridx = currentGridX;
			gbc_btnLevel.gridy = currentGridY;
			add(btnLevel[i], gbc_btnLevel);
			
			currentGridX = currentGridX + 2;
			if ((i % 6) == 0) {
				currentGridX = 1;
				currentGridY = currentGridY + 2;
			}
			*/
		}

		//btnLevel[37].setActive(true);
		  
		 
	}

}
