package builder.view.selectModeMenu;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.SwingPropertyChangeSupport;

import builder.view.editGame.GameFrame;

public class CustomConfirmButton extends JButton implements ActionListener {
	int levelNum;

	/**
	 * Constructor
	 * @param  level level index
	 */
	public CustomConfirmButton(int level) {
		this.levelNum = level +1;
		addActionListener(this);
		drawConfirmButton();

	}

	/**
	 * Draw the button
	 */
	private void drawConfirmButton() {
		setVerticalTextPosition(SwingConstants.TOP);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setIconTextGap(30);
	    setPreferredSize(new Dimension(100, 100));
		setText("OK!");
	}
	
	/**
	 * select the button and open GameFrame
	 * @param e ActionEvent
	 */
	public void actionPerformed(ActionEvent e) {
		SelectModeMenuFrame currentFrame = (SelectModeMenuFrame) SwingUtilities.getRoot(this);
		currentFrame.dispose();
	
		GameFrame gframe = new GameFrame(this.levelNum, true);
		gframe.setVisible(true);
		
	}
	
	/**
	 * Set the level number
	 */
	public void setLevelNum(int l) {
		this.levelNum = l + 1;
	}
	
	/**
	 * Get the level number
	 * @return int
	 */
	public int getLevelNum() {
		return levelNum;
	}
}
