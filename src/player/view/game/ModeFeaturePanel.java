package player.view.game;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class ModeFeaturePanel extends JPanel {
	String mode;

	/**
	 * Create the panel.
	 */
	public ModeFeaturePanel(String mode) {
		this.mode = mode;

		switch (mode.toLowerCase()) {
		case "puzzle":
			JLabel remWords = new JLabel();
			remWords.setText("Remaining words:");
			add(remWords);
		case "lightning":
			
		case "theme":
		default:
		}
	}
}
