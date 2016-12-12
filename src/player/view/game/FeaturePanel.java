package player.view.game;

import player.models.LightningTimer;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeaturePanel extends JPanel {
	String mode;
	String featureInput;
	JLabel feature;
	private int counter;
	int delay = 1000; //milliseconds

	/**
	 * Create the panel.
	 */
	public FeaturePanel(String mode, String featureInput) {
		this.mode = mode;
		this.featureInput = featureInput;
		System.out.println(mode);
		
		feature = new JLabel();
		
		switch (mode.toLowerCase()) {
		case "puzzle":
			feature.setText("Remaining words: " + Integer.parseInt(featureInput));
			break;
		case "lightning":
			updateTimer(Integer.parseInt(featureInput));
			break;
		case "theme":
			feature.setText("Theme: " + featureInput);
			break;
		default:
			feature.setText("What kind of mode is this?");
			break;
		}
		
		feature.setFont(new Font(feature.getFont().getName(), Font.PLAIN, 20));
		add(feature);
	}

	public void updateTimer (int maxTime) {
		feature.setText("Timer: " + (maxTime - counter)
						+ " seconds left");
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (counter < maxTime) {
					counter++;
					feature.setText("Timer: " + (Integer.parseInt(featureInput) - counter)
							+ " seconds left");
				} else {
					feature.setText("You lose hahahahahaha");
				}

			}
		};
		new Timer(delay, taskPerformer).start();
	}
}

