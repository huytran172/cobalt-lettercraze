package player.view.game;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import player.models.Level;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class GamePanelTheme extends JPanel implements GamePanel {

	private BoardPanel boardPanel;
	private TitlePanel titlePanel;
	private InfoPanel infoPanel;
	private FeaturePanel featurePanel;
	Level l;
	
	GamePanelTheme(Level l){
		this.l = l;
		this.setLayout(null);
		
		boardPanel = new BoardPanel(l.getBoard());
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new InfoPanel(l);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    
	    titlePanel = new TitlePanel("Theme");
	    add(titlePanel);

	    titlePanel.setBounds(40, 20, 600, 45);

	    //titlePanel.setBackground(Color.blue);
	    
	    featurePanel = new FeaturePanel("theme", "color");
		add(featurePanel);
		featurePanel.setBounds(boardPanel.getWidth() / 5, 65, 400, 50);
	    
	    //add(titlePanel);
	   // add(infoPanel);
		
	}

	public BoardPanel getBoardPanel() {
		return boardPanel;
	}

	public InfoPanel getInfoPanel() {
		return infoPanel;
	}

	public TitlePanel getTitlePanel() {
		return titlePanel;
	}

	public FeaturePanel getFeaturePanel() {
		return featurePanel;
	}

	public Level getLevel() {
		return l;
	}

}


