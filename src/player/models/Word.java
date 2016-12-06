package player.models;

import java.util.ArrayList;

public class Word {
	
	ArrayList<Square> squares = new ArrayList<Square>();
	
	Word(ArrayList<Square> squares){

	}
	
	//Check if the word is valid
	boolean validWord(){
		return true;
	}
	
	//Calculate the score of the selected word.
	int calcWordScore(){
		return 0;
	}
}
