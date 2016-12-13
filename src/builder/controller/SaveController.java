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

import builder.view.BuilderApplication;
import builder.view.editGame.puzzle.PuzzleGamePanel;
import builder.view.editGame.puzzle.PuzzleInfoPanel;

public class SaveController implements ActionListener {
	PuzzleInfoPanel application;     /** Application we have control over. */
	
	public SaveController(PuzzleInfoPanel app) {
		this.application = app;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String maxWords = application.getTextField_3().getText();
		String star_1 = application.getTextField().getText();
		String star_2 = application.getTextField_1().getText();
		String star_3 = application.getTextField_2().getText();
		
		ArrayList<String> stars = new ArrayList<String>(); 
		stars.add(star_1);
		stars.add(star_2);
		stars.add(star_3);
		
		
		
//		IMove move = new ModifyValue(model, Integer.valueOf(tf.getText()));
//		
		// request move
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	    Date dateobj = new Date();
	    String time = String.format("Level%s.txt", df.format(dateobj));
	    
	    PuzzleGamePanel puzzleGamePanel = (PuzzleGamePanel) this.application.getParent();
		try {
			//Create new file
			File file = new File("../cobalt-lettercraze/levels/Level16.txt");
			//file.getParentFile().mkdirs();

			PrintWriter writer = new PrintWriter(file);
		    //PrintWriter writer = new PrintWriter("Level16", "UTF-8");
		    
		    //Add level name
		    writer.println("16");
		    
		    //Maximum number of words
		    writer.println(maxWords);
		    
		    //Thresholds
		    for (int j = 0; j <3; j++){
		    	writer.print(stars.get(j) + " ");
		    }
		    
		    writer.println();
		    
		    
		    //High score
		    writer.println(0);
		    
		    //Is complete?
		    writer.println(0);
		    
		    //Board visibility
		    //writer.println(puzzleGamePanel.getBoardPanel().getBoard().toString());
		    writer.close();
		    
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		
	}
}