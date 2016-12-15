package player.view.game.gamepanel;

import player.models.Lightning;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.TitlePanel;
import player.view.game.featurePanel.FeaturePanelLightning;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.LightningSubmitButton;
import player.view.game.submitbutton.PuzzleSubmitButton;

public class GamePanelLightning extends GamePanel {
	private FeaturePanelLightning featurePanel;
	private Lightning level;
	private LightningSubmitButton btn;
	
	public GamePanelLightning(Lightning level){
		super(level);
	    
	    featurePanel = new FeaturePanelLightning(level, boardPanel);
		add(featurePanel);
		featurePanel.setBounds(boardPanel.getWidth() / 5, 65, 400, 50);

		btn = new LightningSubmitButton(level, this.boardPanel, this.infoPanel, this.featurePanel);
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


