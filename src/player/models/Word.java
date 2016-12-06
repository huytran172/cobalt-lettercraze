package player.models;

import java.util.ArrayList;


public class Word {
	
	ArrayList<Square> squares = new ArrayList<Square>();
	
	Word(ArrayList<Square> squares){

	}
	
	
	//Convert the String from Squares
	String getWord(){
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < squares.size(); i++){
			Letter letter = squares.get(i).letter;
			list.add(letter.s);
		}
		String word = String.join(", ", list);
		return word;
	}
	
	//Check if the word is valid
	boolean validWord(){
		Dictionary dict = new Dictionary();
		return dict.isWord(this.getWord());
	}
	
	//Calculate the score of the selected word.
	int calcWordScore(){
		
		int score = 0;
		
		for (int i = 0; i < squares.size(); i++){
			Letter letter = squares.get(i).letter;
			score = score + letter.getScore();
			
		}
		
		return score;
	}
}
