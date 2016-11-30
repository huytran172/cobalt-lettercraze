package player.view.menu;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuScreenPanel extends JPanel {
	private CustomLevelButton[] btnLevel = new CustomLevelButton[16];

	MenuScreenPanel() {
		GridBagLayout gbl_contentPane = new GridBagLayout();
		//gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//gbl_contentPane.rowHeights = new int[]{57, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		//gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_contentPane);
		
		int currentGridX = 1;
		int currentGridY = 2;
		
		for (int i = 1; i < 16; i++) {
			btnLevel[i] = new CustomLevelButton(i, 0);
			btnLevel[i].enableBtn(false);
			GridBagConstraints gbc_btnLevel = new GridBagConstraints();
			gbc_btnLevel.insets = new Insets(0, 0, 5, 5);
			
			gbc_btnLevel.gridx = currentGridX;
			gbc_btnLevel.gridy = currentGridY;
			add(btnLevel[i], gbc_btnLevel);
			
			currentGridX = currentGridX + 2;
			if ((i % 5) == 0) {
				currentGridX = 1;
				currentGridY = currentGridY + 2;
			}
		}
		
		JButton btnHelp = new JButton("Help");
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.gridx = 9;
		gbc_btnHelp.gridy = 8;
		add(btnHelp, gbc_btnHelp);
	}
}
