package player.view.game;

import player.models.Theme;
import player.view.game.featurePanel.FeaturePanelTheme;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.ThemeSubmitButton;

public class GamePanelTheme extends GamePanel {
	private BoardPanel boardPanel;
	private TitlePanel titlePanel;
	private InfoPanel infoPanel;
	private FeaturePanelTheme featurePanel;
	private Theme level;
	private ThemeSubmitButton btn;
	
	GamePanelTheme(Theme level){
		super();
		this.level = level;
		this.setLayout(null);
		
		boardPanel = new BoardPanel(level.getBoard());
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new InfoPanel(level);
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    
	    titlePanel = new TitlePanel("Theme");
	    add(titlePanel);

	    titlePanel.setBounds(40, 20, 600, 45);

	    //titlePanel.setBackground(Color.blue);
	    
	    featurePanel = new FeaturePanelTheme(level, boardPanel);
		add(featurePanel);
		featurePanel.setBounds(boardPanel.getWidth() / 5, 65, 400, 50);

		btn = new ThemeSubmitButton(this);
		add(btn);
		btn.setBounds(60, 65, 100, 30);
	}

	@Override
	public Theme getLevel() {
		return level;
	}

	@Override
	public FeaturePanelTheme getFeaturePanel() {
		return featurePanel;
	}

	@Override
	public CustomSubmitButton getSubmitButton() {
		return btn;
	}

}


