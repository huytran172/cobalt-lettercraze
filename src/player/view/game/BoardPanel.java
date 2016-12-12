package player.view.game;

import javax.swing.JButton;
import javax.swing.JPanel;

import player.models.Board;
import player.models.Square;
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
	
	/**
	 * Create the panel.
	 */
	public BoardPanel(Board board) {
		this.board = board;

		GridLayout gridLayout = new GridLayout(6, 6, 10, 10);
		//GridBagLayout gridLayout = new GridBagLayout();
		setLayout(gridLayout);

		squareModels = board.getSquareList();

		for (int i = 0; i < 36; i++) {
			squarePanels[i] = new SquarePanel(squareModels.get(i));
			add(squarePanels[i]);
			System.out.print(squareModels.get(i).isEnabled());
			//squarePanels[i].initialize(squareModels.get(i).isEnabled());
			//squarePanels[i].setEnable(false);
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
