package player.models;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Word {
	
	private ArrayList<Square> squares = new ArrayList<Square>();
	
	public Word(ArrayList<Square> squares){
		this.squares = squares;
	}

	public ArrayList<Square> getWord() {
		return squares;
	}

	public boolean addSquareToWord(Square newSquare) {
		if (squares.contains(newSquare)) {
			return false;
		}

		if (squares.isEmpty()) {
			System.out.print("true because squares empty\n");
			squares.add(newSquare);
			return true;
		}

		int lastElementRow = squares.get(squares.size() - 1).getRow();
		int lastElementCol = squares.get(squares.size() - 1).getColumn();
		int newSquareRow = newSquare.getRow();
		int newSquareCol = newSquare.getColumn();
		if (((newSquareRow == lastElementRow) ||
			(newSquareRow == (lastElementRow - 1)) ||
			(newSquareRow == (lastElementRow + 1))) &&
			((newSquareCol == lastElementCol) ||
			(newSquareCol == (lastElementCol - 1)) ||
			(newSquareCol == (lastElementCol + 1)))) {
			squares.add(newSquare);
			System.out.print("lastRow: " + lastElementRow + "\n");
			System.out.print("lastCol: " + lastElementCol + "\n");
			System.out.print("newRow: " + newSquareRow + "\n");
			System.out.print("newCol: " + newSquareCol + "\n");
			System.out.print("true because adjacent\n");
			return true;
		} else {
			return false;
		}

	}
	
	//Convert the String from Squares
	public String getWordString(){
		StringBuilder wordString = new StringBuilder();
		for (int i = 0; i < squares.size(); i++){
			Letter letter = squares.get(i).getLetter();
			wordString.append(letter.getS());
		}
		return wordString.toString();
	}
	
	//Check if the word is valid
	public boolean validWord() {
		Dictionary dict = new Dictionary();
		return dict.isWord(this.getWordString());
	}
	
	//Calculate the score of the selected word.
	public int calcWordScore(){
		
		int score = 0;
		
		for (int i = 0; i < squares.size(); i++){
			Letter letter = squares.get(i).getLetter();
			score = score + letter.getScore();
			
		}
		
		return score;
	}
	
	/**
	 * Clear the word
	 * @param
	 */
	public void clearWord(){
		for (int i = 0; i < this.squares.size(); i++) {
			this.squares.get(i).clearSquare();
		}
	}
	
	public void deleteWord() {
		for (int i = 0; i < this.squares.size(); i++) {
			this.squares.remove(i);
		}
	}
	
	public static void main(String[] args){
		Letter letter = new Letter("s");
		Square square1 = new Square(letter,1,1,false);
		Word word = new Word(new ArrayList<Square>());
		word.squares.add(square1);
		
		Letter letter2 = new Letter("u");
		Square square3 = new Square(letter2,1,1,false);
		word.squares.add(square3);
		System.out.println(word.getWordString());
	}
}
