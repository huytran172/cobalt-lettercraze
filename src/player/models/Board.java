package player.models;

import java.util.*;

import player.controller.Listener;

/**
 * Supports listeners for changes.
 * 
 * @author cobalt
 */
public class Board implements Iterable<Square> {
	/** Squares in the board. */
	private ArrayList<Square> squares = new ArrayList<Square>();
	
	/**
	 * Word being chosen.
	 */
	private Word activeWord;
	
	/** 
	 * Listeners.
	 */
	private ArrayList<Listener> listeners = new ArrayList<Listener>();
	
	/** Add a listener. */
	public void addListener (Listener list) {
		listeners.add(list);
	}
	
	/** Remove a listener. */
	public void removeListener (Listener list) {
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
	void notifyListeners() {
		synchronized (listeners) {
			for (Listener list : listeners) {
				list.update();
			}
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
