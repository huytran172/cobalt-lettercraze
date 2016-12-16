package player.view.menu;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

import player.models.Level;
import player.models.Model;

public class MenuScreenPanel extends JPanel {
	private CustomLevelButton[] btnLevel = new CustomLevelButton[16];
	private Model m;

	/**
	 * Constructor
	 * @param m Model
	 */
	MenuScreenPanel(Model m) {
		this.m = m;
		GridBagLayout gbl_contentPane = new GridBagLayout();

		setLayout(gbl_contentPane);
		
		int currentGridX = 1;
		int currentGridY = 2;
		
		for (int i = 1; i < 16; i++) {
			Level l = m.getLevels()[i];
			btnLevel[i] = new CustomLevelButton(l, this.m.isPreviousLevelComplete(l));
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
		
		CustomHelpButton btnHelp = new CustomHelpButton();
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.gridx = 9;
		gbc_btnHelp.gridy = 8;
		add(btnHelp, gbc_btnHelp);
	}
	
	/**
	 * Repaint all off the buttons
	 */
	public void repaintButtons()
	{
		for (int i = 1; i < this.btnLevel.length; i++) {
			btnLevel[i].setActive(this.m.isPreviousLevelComplete(m.getLevels()[i]));
		}
	}
}
