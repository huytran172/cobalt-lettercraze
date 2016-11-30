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
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c5ea4cba3a51d581ecd915cf699a9d0dc93097fa
		//gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//gbl_contentPane.rowHeights = new int[]{57, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		//gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
<<<<<<< HEAD
>>>>>>> builder
=======
>>>>>>> c5ea4cba3a51d581ecd915cf699a9d0dc93097fa
		setLayout(gbl_contentPane);
		
		int currentGridX = 1;
		int currentGridY = 2;
		
		for (int i = 1; i < 16; i++) {
<<<<<<< HEAD
			btnLevel[i] = new CustomLevelButton(i, 0, true);
=======
			btnLevel[i] = new CustomLevelButton(i, 0);
			btnLevel[i].enableBtn(false);
<<<<<<< HEAD
>>>>>>> builder
=======
>>>>>>> c5ea4cba3a51d581ecd915cf699a9d0dc93097fa
			GridBagConstraints gbc_btnLevel = new GridBagConstraints();
			gbc_btnLevel.insets = new Insets(20, 30, 20, 28);
			
			gbc_btnLevel.gridx = currentGridX;
			gbc_btnLevel.gridy = currentGridY;
			add(btnLevel[i], gbc_btnLevel);
			
			currentGridX = currentGridX + 2;
			if ((i % 5) == 0) {
				currentGridX = 1;
				currentGridY = currentGridY + 2;
			}
		}

		btnLevel[15].setActive(false);
		
		JButton btnHelp = new JButton("Help");
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.gridx = 9;
		gbc_btnHelp.gridy = 8;
		add(btnHelp, gbc_btnHelp);
	}
}
