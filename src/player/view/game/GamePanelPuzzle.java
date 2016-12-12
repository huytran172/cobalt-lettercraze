package player.view.game;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import player.models.Level;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class GamePanelPuzzle extends JPanel {
	
	Level l;
	JPanel boardPanel;
	JPanel titlePanel;
	JPanel infoPanel;
	JPanel featurePanel;
	
	GamePanelPuzzle(Level l){
		
		this.setLayout(null);
				
		boardPanel = new BoardPanel(l.getBoard());
	    add(boardPanel);

	    boardPanel.setBounds(40, 100, 420, 420);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new InfoPanel(l);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    
	    titlePanel = new TitlePanel("Puzzle");
	    add(titlePanel);
	    titlePanel.setBounds(40, 20, 600, 45);

	    //titlePanel.setBackground(Color.blue);
	    
		featurePanel = new FeaturePanel("puzzle", "20");
		add(featurePanel);
		featurePanel.setBounds(boardPanel.getWidth() / 5, 65, 400, 50);
	}
	
}


