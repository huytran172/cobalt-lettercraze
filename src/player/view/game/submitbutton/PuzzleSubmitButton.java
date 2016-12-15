package player.view.game.submitbutton;

import java.awt.event.ActionEvent;

import player.view.game.GamePanel;

public class PuzzleSubmitButton extends CustomSubmitButton {

	public PuzzleSubmitButton(GamePanel panel) {
		super(panel);
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
