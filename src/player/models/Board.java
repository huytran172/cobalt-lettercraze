package player.models;

import java.util.*;

import player.controller.Listener;

/**
 * Supports listeners for changes.
 * 
 * @author cobalt
 */
public class Board implements Iterable<Square> {
	
	/** A list of words found */
	protected Stack<Word> wordsFound;
	
	/** VARIABLE IN BOARD ENTITY **/
	/** Squares in the board. */
	protected ArrayList<Square> squares = new ArrayList<Square>(36);

	public void initialize(String line) {
		String squaresString[] = line.split(" ");

		int j = -1;

		for (int i = 0; i < 36; i++) {
			squares.add(i, new Square(0,0, false));
			squares.get(i).setColumn(i % 6);

			if (i % 6 == 0) {
				j++;
			}

			squares.get(i).setRow(j);
			squares.get(i).setEnabled(squaresString[i].equals("0") ? false : true);
		}
	}
	
	/**Word being chosen. */

	private Word activeWord = null;
	
	/** Listeners. */
	private ArrayList<Listener> listeners = new ArrayList<Listener>();
	
	/** Add a listener. */
	public void addListener(Listener list) {
		listeners.add(list);
	}
	
	/** Remove a listener. */
	public void removeListener(Listener list) {
		listeners.remove(list);
	}
	
//	/** 
//	 * Reset board to state encoded by memento
//	 * 
//	 * @param m
//	 */
//	public void restore(BoardMemento m) {
//		shapes = new ArrayList<Shape>();
//		for (Shape s : m.stored) {
//			shapes.add(s);
//		}
//		
//		// state changed
//		notifyListeners();
//	}
//	
//	public BoardMemento getState() {
//		return new BoardMemento(shapes);
//	}
	
	public void setActiveWord(Word w){
		this.activeWord = w;
	}

	/** Return all shapes in the board. */
	public Iterator<Square> iterator() {
		return squares.iterator();
	}

	/** Return the number of words on the board. */
	public int size() { 
		return squares.size();
	}

	/** Return the given shape by index position. */
	public Square get(int rowIndex) {
		return squares.get(rowIndex);
	}

	/** 
	 * Notify all listeners.
	 * 
	 * During this event, no new changes can happen.
	 */
	public void notifyListeners() {
		synchronized (listeners) {
			for (Listener list : listeners) {
				list.update();
			}
		}
	}

	public void toggleSquare(Square s) {
		s.toggleSelect();
	}
	
	/** Add a square to the list of squares being selected
	 * 
	 * @param square
	 */
	public boolean updateActiveWord(Square square){
		
		if (!this.activeWord.squares.contains(square)){
			this.activeWord.squares.add(square);
			return true;
		}
		
		return false;

	}
	
	public boolean undo(){
		if (this.wordsFound.empty()){
			return false;
		}
		else {
			this.wordsFound.pop();
			return true;
		}
	}

//	/**
//	 * Return the nth shape by sorted order (or null if too high).
//	 * 
//	 * @param selectedIndex
//	 * @return
//	 */
//	public Shape getShape(int selectedIndex) {
//		if (0 < selectedIndex && selectedIndex < shapes.size()) {
//			return shapes.get(selectedIndex);
//		}
//		
//		return null;
//	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 36; i++) {
			
			
			sb.append(this.squares.get(i).isEnabled ? 1 : 0);
			sb.append(" ");
		}
		return sb.toString();
	}
	
	/**
	 * Update Board: Call when a move is recently made and
	 * squares move up to fill empty spaces
	 */
	public boolean updateBoard(){
		boolean checkStatus = false;
		
		// Going through the board in a 3D way and pull up all empty squares with existing letter
		for (int row = 0; row < 5; row++){
			for (int column = 0; column < 6; column++){
				// Get current position matching 2D array
				int pos = (row - 1) * 6 + column;
				
				if ((squares.get(pos).isEnabled) && (squares.get(pos).letter.isEmptyString())){
					checkStatus = true;
					for (int row2 = row + 1; row2 < 6; row++){
						// Get position of square below
						int newPos = pos + (row2 - row) * 6;
						if ((squares.get(newPos).isEnabled) && (squares.get(newPos).letter != null)){
							squares.get(pos).letter.setS(squares.get(newPos).letter.getS());
							break;
						}
					}
				}
			}
		}
		
		return checkStatus;
	}
	
	/**
	 * Fill Empty Squares with random letter in Board
	 * For Puzzle and Lightning
	 */
	public boolean fillEmptySquares(){
		boolean isFillable = false;
		for (int i = 0; i < 36; i++){
			if ((squares.get(i).isEnabled) && (squares.get(i).letter.isEmptyString())){
				isFillable = true;
				squares.get(i).letter.setS(RandomLetter.generateLetter());
			}
		}
		return isFillable;
	}
	
	
	/**
	 * Reset Board - refill and randomize letters in Board
	 * For Puzzle and Lightning
	 */
	public boolean resetBoard(){
		boolean isAllDisabled = true;
		for (int i = 0; i < 36; i++){
			if (squares.get(i).isEnabled){
				isAllDisabled = false;
				squares.get(i).letter.setS(RandomLetter.generateLetter());
			}
		}
		return !isAllDisabled;
	}
}
