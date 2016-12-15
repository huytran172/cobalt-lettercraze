package player.view.game;

import player.models.Lightning;
import player.view.game.featurePanel.FeaturePanelLightning;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.LightningSubmitButton;

public class GamePanelLightning extends GamePanel {
	private FeaturePanelLightning featurePanel;
	private Lightning level;
	private LightningSubmitButton btn;
	
	GamePanelLightning(Lightning level){
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
	    
	    titlePanel = new TitlePanel("Lightning");
	    add(titlePanel);
	    titlePanel.setBounds(40, 20, 600, 45);
	    //titlePanel.setBackground(Color.blue);
	    
	    featurePanel = new FeaturePanelLightning(level, boardPanel);
		add(featurePanel);
		featurePanel.setBounds(boardPanel.getWidth() / 5, 65, 400, 50);

		btn = new LightningSubmitButton(this);
		add(btn);
		btn.setBounds(60, 65, 100, 30);
	}

	@Override
	public Lightning getLevel() {
		return level;
	}

	@Override
	public FeaturePanelLightning getFeaturePanel() {
		return featurePanel;
	}

	@Override
	public CustomSubmitButton getSubmitButton() {
		return btn;
	}
}


