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
			this.updateScore(word);
			board.saveSquareState();
			System.out.println("SCORE " + this.score.getScore());
			wordPanel.addToWordPanel(word.getWordString());
			word.clearWord();
			board.updateBoard();
			board.fillEmptySquares();
			gamePanel.getBoardPanel().reputLetter();
			updateInterface();
		}
	}

}