package builder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JTextField;

import builder.view.BuilderApplication;
import builder.view.editGame.lightning.LightningInfoPanel;
import builder.view.editGame.puzzle.PuzzleGamePanel;
import builder.view.editGame.puzzle.PuzzleInfoPanel;
import builder.view.editGame.theme.ThemeInfoPanel;
import player.models.Board;
import player.view.game.GameFrame;

public class PreviewThemeController implements ActionListener {
	ThemeInfoPanel application;     /** Application we have control over. */
	Board b;
	int levelNum;
	
	public PreviewThemeController(ThemeInfoPanel app, Board b) {
		this.application = app;
		this.b = b;

	}
	
	
	/**
	 * Create a new name for the freshly created level
	 * @return
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		String words = application.getTextField_4().getText();
		String[] list = words.split(",");
		String maxWords = application.getTextField_3().getText();
		String star_1 = application.getTextField().getText();
		String star_2 = application.getTextField_2().getText();
		String star_3 = application.getTextField_1().getText();
		
		ArrayList<String> stars = new ArrayList<String>(); 
		stars.add(star_1);
		stars.add(star_2);
		stars.add(star_3);
		
		
		
//		IMove move = new ModifyValue(model, Integer.valueOf(tf.getText()));
//		
		// request move


		try {
			//Create new file
				
			String name = "../cobalt-lettercraze/tempFile/temp.txt";
			File file = new File(name);
			//file.getParentFile().mkdirs();

			PrintWriter writer = new PrintWriter(file);
		    //PrintWriter writer = new PrintWriter("Level16", "UTF-8");
		    
		    //Add level name
		    writer.println(String.format("%d", 3));
		    
		    //Maximum number of words
		    writer.print(maxWords + " ");
		  //List of words to find
		    for (int i = 0; i < list.length; i++){
		    	writer.print(list[i] + " ");
		    }
		    
		    writer.println();
		    
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
		    writer.println(b.toStringForBuilder());
		    writer.close();
		    
			
		    
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		

		GameFrame gf = new GameFrame("theme","../cobalt-lettercraze/tempFile/temp.txt");
		gf.setVisible(true);
	}
	
	
	//public void actionPerformed(ActionEvent e) {
//		DropMenuFrame currentFrame = (DropMenuFrame) SwingUtilities.getRootPane(this);
//		currentFrame.dispose();
		
		

		
	
}
	
	