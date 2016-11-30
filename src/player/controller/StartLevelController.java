package player.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartLevelController implements ActionListener {

	int level;
	
	public StartLevelController(int i) {
		this.level = i;
	}
	
	public void actionPerformed (ActionEvent ae) {
		System.out.println("Request to start level " + level);
	}

}
