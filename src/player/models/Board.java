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
	Stack<Word> wordsFound;
	
	/** Squares in the board. */
	private ArrayList<Square> squares = new ArrayList<Square>();

	public void initialize() {
		int j = -1;
		for (int i = 0; i < 36; i++) {
			
			squares.set(i, new Square(0,0, false));
			squares.get(i).setColumn(i % 6);
			if (i % 6 == 0) {
				j++;
			}
			squares.get(i).setRow(j);
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
	
	public void updateBoard(){
		if (this.activeWord.validWord()){
			this.wordsFound.push(activeWord)
;			activeWord.clearWord();
			
			
			
		}
		return true;
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
	
}
