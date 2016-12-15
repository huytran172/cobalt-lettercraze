package player.view.game.submitbutton;

import java.awt.event.ActionEvent;

import player.view.game.GamePanel;

public class ThemeSubmitButton extends CustomSubmitButton {
	public ThemeSubmitButton(GamePanel panel) {
		super(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GamePanel gamePanel = (GamePanel) infoPanel.getParent();
		word = board.getTempWord();
		if (word.validWord()) {
			this.updateScore(word);
			System.out.println("SCORE " + this.score.getScore());
			wordPanel.addToWordPanel(word.getWordString());
			word.clearWord();
			board.updateBoard();
			board.fillEmptySquares();
			gamePanel.getBoardPanel().reputLetter();
		}
	}
}
