package player.view.game.submitbutton;

import java.awt.event.ActionEvent;

import player.view.game.GamePanel;

public class LightningSubmitButton extends CustomSubmitButton {

	public LightningSubmitButton(GamePanel panel) {
		super(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		word = board.getTempWord();
		if (word.validWord()) {
			this.updateScore(word);
			System.out.println("SCORE " + this.score.getScore());
			wordPanel.addToWordPanel(word.getWordString());
			word.clearWord();
			updateInterface();
		}
	}
}
