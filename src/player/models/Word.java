package player.models;

import java.util.ArrayList;

public class Word {
	private ArrayList<Square> squares = new ArrayList<Square>();
	
	public Word(ArrayList<Square> squares){
		this.squares = squares;
	}

	public ArrayList<Square> getWord() {
		return squares;
	}

	/**
	 * Add a new square to the word
	 * @param newSquare square to add
	 * @return true if success
	 */
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
		} 

		return false;
	}
	
	/**
	 * Get string from word
	 * @return String
	 */
	public String getWordString(){
		StringBuilder wordString = new StringBuilder();
		for (int i = 0; i < squares.size(); i++){
			Letter letter = squares.get(i).getLetter();
			wordString.append(letter.getS());
		}
		return wordString.toString();
	}
	
	/**
	 * Check if valid word
	 * @return boolean
	 */
	public boolean validWord() {
		Dictionary dict = new Dictionary();
		return dict.isWord(this.getWordString()) && this.squares.size() >= 3;
	}
	
	/**
	 * Calculate score from the word
	 * @return int
	 */
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
	
	/**
	 * Delete the word
	 */
	public void deleteWord() {
		for (int i = 0; i < this.squares.size(); i++) {
			this.squares.remove(i);
		}
	}

	/**
	 * Get a list of square in the word
	 * @return ArrayList<Square>
	 */
	public ArrayList<Square> getSquares() {
		return squares;
	}
}
