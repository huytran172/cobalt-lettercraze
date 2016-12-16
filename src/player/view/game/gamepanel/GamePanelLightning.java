package player.view.game.gamepanel;

import player.models.Lightning;
import player.view.game.BoardPanel;
import player.view.game.CustomResetButton;
import player.view.game.CustomSkipButton;
import player.view.game.CustomUndoButton;
import player.view.game.InfoPanel;
import player.view.game.TitlePanel;
import player.view.game.featurePanel.FeaturePanelLightning;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.LightningSubmitButton;
import player.view.game.submitbutton.PuzzleSubmitButton;

public class GamePanelLightning extends GamePanel {
	private FeaturePanelLightning featurePanel;
	private LightningSubmitButton btnSubmit;
	private CustomResetButton btnReset;
	private CustomUndoButton btnUndo;
	private CustomSkipButton btnSkip;
	
	public GamePanelLightning(Lightning level){
		super(level);

		titlePanel = new TitlePanel("Lightning", level);
		add(titlePanel);
		titlePanel.setBounds(40, 20, 600, 45);
		//titlePanel.setBackground(Color.blue);

	    featurePanel = new FeaturePanelLightning(level, this.boardPanel);
		add(featurePanel);
		featurePanel.setBounds(200, 60, 300, 50);

		btnSubmit = new LightningSubmitButton(level, this.boardPanel, this.infoPanel, this.featurePanel);
		add(btnSubmit);
		btnSubmit.setBounds(480, 490, 100, 30);
		
		btnReset = new CustomResetButton("lightning", level, this.boardPanel, this.infoPanel, this.featurePanel);
		add(btnReset);
		btnReset.setBounds(580, 490, 100, 30);
		
		btnUndo = new CustomUndoButton(level, this.boardPanel, this.infoPanel, this.featurePanel);
		add(btnUndo);
		btnUndo.setBounds(680, 490, 100, 30);
		btnUndo.setEnabled(false);
		
		btnSkip = new CustomSkipButton(level, this.infoPanel);
		add(btnSkip);
		btnSkip.setBounds(480, 460, 300, 30);
	}

	@Override
	public Lightning getLevel() {
		return (Lightning) level;
	}

	@Override
	public FeaturePanelLightning getFeaturePanel() {
		return featurePanel;
	}

	@Override
	public CustomSubmitButton getSubmitButton() {
		return btnSubmit;
	}
	
	public CustomResetButton getResetButton() {
		return btnReset;
	}
	
	public CustomUndoButton getUndoButton() {
		return btnUndo;
	}
}


