package player.view.game;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class GamePanelTheme extends JPanel {
	

	JPanel boardPanel;
	JPanel titlePanel;
	JPanel infoPanel;
	
	GamePanelTheme(){
		
		this.setLayout(null);
		
		
		boardPanel = new BoardPanel();
	    add(boardPanel);
	    boardPanel.setBounds(60, 170, 510, 510);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new InfoPanel();
	    add(infoPanel);
	    
	    
	    titlePanel = new TitlePanel("Theme");
	    add(titlePanel);
	    titlePanel.setBounds(60, 40, 860, 85);
	    //titlePanel.setBackground(Color.blue);
	    
	    
	    //add(titlePanel);
	   // add(infoPanel);
		
	}
	
}


