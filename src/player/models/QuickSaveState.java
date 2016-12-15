package player.models;

import java.util.ArrayList;

import player.models.score.*;

public class QuickSaveState {
	
	protected ArrayList<Square> squares = new ArrayList<Square>(36);
	int currentScore = 0;
	
	/** CONSTRUCTOR */
	public QuickSaveState(ArrayList<Square> squares, int score){
		this.squares = squares;
		this.currentScore = score;
	}
	
	/**
	 * Update QuickSaveState with new list of squares
	 * @param squares List of squares which will be saved
	 */
	public void updateArrayList(ArrayList<Square> squares){
		this.squares = squares;
	}
	
	/**
	 * Update QuickSaveState with new current score
	 * @param score Amount of score which will be saved
	 */
	public void updateScore(int score){
		this.currentScore = score;
	}
	
	/**
	 * Retrieve array list of squares saved
	 * @return List of saved squares
	 */
	public ArrayList<Square> getArrayList(){
		return squares;
	}
	
	/**
	 * Retrieve score saved
	 * @return Score saved
	 */
	public int getScore(){
		return currentScore;
	}
	
	/**
	 * Clear Quick Saved State
	 */
	public void clearSaveState(){
		squares = new ArrayList<Square>(36);
		currentScore = 0;
	}
}
