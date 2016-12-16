package player.view.game.submitbutton;

import java.awt.event.ActionEvent;

import player.models.Level;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.featurePanel.FeaturePanelPuzzle;

public class PuzzleSubmitButton extends CustomSubmitButton {
	FeaturePanelPuzzle featurePanelPuzzle;

	public PuzzleSubmitButton(Level l, BoardPanel b, InfoPanel i, FeaturePanelPuzzle f) {
		super(l, b, i);
		this.featurePanelPuzzle = f;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		word = board.getTempWord();
		if (word.validWord()) {
			int currentScore = this.score.getScore();
			infoPanel.saveCurrentScore(currentScore);
			this.updateScore(word);
			board.saveSquareState();
			System.out.println("SCORE " + this.score.getScore());
			infoPanel.setScoreNum(this.score.getScore());
			infoPanel.setHighScoreNum(this.score.getHighScore());
			wordPanel.addToWordPanel(word.getWordString());
			word.clearWord();
			board.updateBoard();
			board.fillEmptySquares();
			featurePanelPuzzle.decreaseWordLeft(word);
		}
		updateInterface();
	}
}
