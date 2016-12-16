package player.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import player.models.score.Score;
import player.models.score.ScorePuzzle;

public class Puzzle extends Level{
	private int maxMoves;
	private ScorePuzzle score;
	
//	public puzzle(int moves, int threshold[]){
//		super(new board());
//		this.maxmoves = moves;
//		this.score = new scorepuzzle(threshold, super.highscorelist);
//	}
	
	public Puzzle(File f) {
		super(f);
		this.score = new ScorePuzzle(super.threshold, super.highScore);
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(f));
			inputStream.readLine();
			this.maxMoves = Integer.parseInt(inputStream.readLine());
			inputStream.readLine();
			inputStream.readLine();
			inputStream.readLine();
			// Board shape
			this.board = new Board();
			this.board.initialize(inputStream.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}

	@Override
	public boolean endLevel(){
		return true;
	}

	//Reset board, score, list of words found
	@Override
	public boolean reset(){
		return false;
	}

	//Undo last move
	@Override
	public boolean undo(){
		return true;
	}

	@Override
	public void initialize() {
		
	}

	@Override
	public void updateLevel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Score getScore() {
		return this.score;
	}


	public int getMaxMoves() {
		return maxMoves;
	}
	
}
