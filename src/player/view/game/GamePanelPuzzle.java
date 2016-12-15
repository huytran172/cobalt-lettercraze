package player.view.game;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import player.models.Level;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class GamePanelPuzzle extends JPanel implements GamePanel {
	private Level l;
	private BoardPanel boardPanel;
	private TitlePanel titlePanel;
	private InfoPanel infoPanel;
	private FeaturePanel featurePanel;
	private JButton btn;
	
	GamePanelPuzzle(Level l){
		this.l = l;
		this.setLayout(null);
				
		boardPanel = new BoardPanel(l.getBoard());
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    
	    infoPanel = new InfoPanel(l);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    
	    titlePanel = new TitlePanel("Puzzle");
	    add(titlePanel);
	    titlePanel.setBounds(40, 20, 600, 45);
	    
		featurePanel = new FeaturePanel("puzzle", "20");
		add(featurePanel);
		featurePanel.setBounds(200, 60, 300, 50);

		btn = new JButton("Submit");
		add(btn);
		btn.setBounds(60, 65, 100, 30);
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


