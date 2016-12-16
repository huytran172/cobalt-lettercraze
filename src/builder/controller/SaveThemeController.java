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
import builder.view.editGame.theme.ThemeInfoPanel;
import player.models.Board;

public class SaveThemeController implements ActionListener {
	ThemeInfoPanel application;     /** Application we have control over. */
	Board b;
	int levelNum;
	boolean add; 
	
	public SaveThemeController(ThemeInfoPanel app, Board b, int levelNum, boolean add) {
		this.application = app;
		this.b = b;
		this.levelNum = levelNum;
		this.add = add;

	}
	
	/**
	 * Create a new name for the freshly created level
	 * @return
	 */
int levelName(){
		
		File[] files = new File("../cobalt-lettercraze/levelsBuilderMade/").listFiles();

		int[] levels = new int[files.length];
		
		if (levels.length != 0) {
		
		for (int i = 0; i < files.length; i++){
			String name = files[i].getName(); 
			levels[i] = Integer.parseInt(files[i].getName().substring(5, name.length() - 4));

		}
		
		int max = levels[0];

		for (int i = 1; i < levels.length; i++) {
		    if (levels[i] > max) {
		      max = levels[i];
		    }
		}
		
		return max + 1;
		
		}
		
		return 1;
	}

	
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
			if (add) {
				
			String name = String.format("../cobalt-lettercraze/levelsBuilderMade/Level%d.txt", levelName());
			File file = new File(name);
			//file.getParentFile().mkdirs();

			PrintWriter writer = new PrintWriter(file);
		    //PrintWriter writer = new PrintWriter("Level16", "UTF-8");
		    
		    //Add level name
		    writer.println(String.format("%d", levelName()-1));
		    
		    //Maximum number of words
		    writer.print(maxWords + " ");
		  //List of words to find
		    for (int i = 0; i < list.length; i++){
		    	writer.print(list[i] + " ");
		    }
		    
		    writer.println();
		    
		    //Thresholds
		    for (int j = 0; j < 3; j++){
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
		    
			}
			
			else {
				
				String name = String.format("../cobalt-lettercraze/levels/Level%d.txt", levelNum);
				File file = new File(name);
				//file.getParentFile().mkdirs();

				PrintWriter writer = new PrintWriter(file);
			    //PrintWriter writer = new PrintWriter("Level16", "UTF-8");
			    
			    //Add level name
			    writer.println(String.format("%d", levelName()-1));
			    
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
				
			}
		    
		    
		    
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		
	}
}