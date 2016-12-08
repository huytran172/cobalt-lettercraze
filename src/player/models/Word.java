package player.models;

import java.util.ArrayList;


public class Word {
	
	ArrayList<Square> squares = new ArrayList<Square>();
	final static Dictionary dict = new Dictionary();	
	
	public Word(ArrayList<Square> squares){
		this.squares = squares;
	}
	
	
	//Convert the String from Squares
	public String getWord(){
		StringBuilder somebody = new StringBuilder();
		for (int i = 0; i < squares.size(); i++){
			Letter letter = squares.get(i).letter;
			somebody.append(letter.s);
		}
		return somebody.toString();
	}
	
	//Check if the word is valid
	public boolean validWord(){
		return dict.isWord(this.getWord());
	}
	
	//Calculate the score of the selected word.
	public int calcWordScore(){
		int score = 0;

		int size = squares.size();
		for (int i = 0; i < size; i++){
			Letter letter = squares.get(i).letter;
			score = score + letter.getScore();
		}
		
		return score;
	}
	
	
	
	public static void main(String[] args) {
		Letter letter = new Letter("s");
		Square square1 = new Square(letter,1,1,false);
		Word word = new Word(new ArrayList<Square>());
		word.squares.add(square1);
		
		Letter letter2 = new Letter("u");
		Square square3 = new Square(letter2,1,1,false);
		word.squares.add(square3);
		System.out.println(word.getWord());
		System.out.println(word.calcWordScore());
	}
}
