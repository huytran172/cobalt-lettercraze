package player.view.game;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JLabel;

public class FeaturePanel extends JPanel {
	String mode;
	JLabel feature;

	/**
	 * Create the panel.
	 */
	public FeaturePanel(String mode) {
		this.mode = mode;
		System.out.println(mode);
		
		feature = new JLabel();
		
		switch (mode.toLowerCase()) {
		case "puzzle":
			feature.setText("Remaining words:");
			break;
		case "lightning":
			feature.setText("Timer:");
			break;
		case "theme":
			feature.setText("Theme:");
			break;
		default:
			feature.setText("What kind of mode is this?");
			break;
		}
		
		feature.setFont(new Font(feature.getFont().getName(), Font.PLAIN, 28));
		add(feature);
	}
}
