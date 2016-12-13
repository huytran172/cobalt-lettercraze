package builder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import builder.view.BuilderApplication;
import builder.view.dropdownMenu.DropMenuFrame;
import player.view.game.GameFrame;
import builder.view.editGame.puzzle.PuzzleGamePanel;
import builder.view.editGame.puzzle.PuzzleInfoPanel;
import player.models.Board;
import player.view.Menu;
import player.view.menu.MenuScreenFrame;

public class PreviewController implements ActionListener {

	
	public PreviewController() {
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		DropMenuFrame currentFrame = (DropMenuFrame) SwingUtilities.getRootPane(this);
//		currentFrame.dispose();
		GameFrame gf = new GameFrame(4);
		gf.setVisible(true);
		
	}
	
	
}