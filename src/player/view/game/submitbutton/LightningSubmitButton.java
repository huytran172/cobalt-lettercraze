package player.view.game.submitbutton;

import java.awt.event.ActionEvent;

import player.models.Level;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.featurePanel.FeaturePanelLightning;

public class LightningSubmitButton extends CustomSubmitButton {
	private FeaturePanelLightning featurePanelLightning;

	/**
	 * Constructor
	 * @param  l Level
	 * @param  b BoardPanel
	 * @param  i InfoPanel
	 * @param  f FeauturePanelLightning
	 */
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
			infoPanel.setScoreNum(this.score.getScore());
			infoPanel.setHighScoreNum(this.score.getHighScore());
			wordPanel.addToWordPanel(word.getWordString());
			word.clearWord();
			board.updateBoard();
			board.fillEmptySquares();
		}
		updateInterface();
	}
}
