package player.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import player.models.Board;
import player.models.Level;

public class ResetBoardController extends java.awt.event.MouseAdapter {
	protected Level level;
    /**
     * Constructor
     * @param  level 
     */
	public ResetBoardController(Level level){
		this.level = level;
	}
	
	public void mousePressed(MouseEvent me) {
		level.getBoard().resetBoard();
	}
}
