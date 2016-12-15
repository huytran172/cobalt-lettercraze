package player.view.game.gamepanel;

import player.models.Puzzle;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.TitlePanel;
import player.view.game.featurePanel.FeaturePanelPuzzle;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.PuzzleSubmitButton;

public class GamePanelPuzzle extends GamePanel {
	private FeaturePanelPuzzle featurePanel;
	private PuzzleSubmitButton btn;
	
	public GamePanelPuzzle(Puzzle level){
		super(level);

		featurePanel = new FeaturePanelPuzzle(level, boardPanel);
		add(featurePanel);
		featurePanel.setBounds(200, 60, 300, 50);

		btn = new PuzzleSubmitButton(level, boardPanel, infoPanel, featurePanel);
		add(btn);
		btn.setBounds(60, 65, 100, 30);
	}

	public void initButton() {

	}

	@Override
	public Puzzle getLevel() {
		return (Puzzle) level;
	}

	@Override
	public FeaturePanelPuzzle getFeaturePanel() {
		return featurePanel;
	}

	@Override
	public CustomSubmitButton getSubmitButton() {
		return btn;
	}
}


