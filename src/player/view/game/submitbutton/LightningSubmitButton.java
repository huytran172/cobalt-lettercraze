package player.view.game.submitbutton;

import java.awt.event.ActionEvent;

import player.models.Level;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.featurePanel.FeaturePanelLightning;
import player.view.game.featurePanel.FeaturePanelPuzzle;
import player.view.game.gamepanel.GamePanel;

public class LightningSubmitButton extends CustomSubmitButton {
	private FeaturePanelLightning featurePanelLightning;

	public LightningSubmitButton(Level l, BoardPanel b, InfoPanel i, FeaturePanelLightning f) {
		super(l, b, i);
		this.featurePanelLightning = f;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		word = board.getTempWord();
		if (word.validWord()) {
			this.updateScore(word);
			board.saveSquareState();
			System.out.println("SCORE " + this.score.getScore());
			wordPanel.addToWordPanel(word.getWordString());
			word.clearWord();
			updateInterface();
		}
	}
}
