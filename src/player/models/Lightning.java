package player.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//import player.models.LightningTimer;
import player.models.score.ScoreLightning;

public class Lightning extends Level {

//	LightningTimer timer;
	ScoreLightning score;
	int time;
	
//	public Lightning(int time, int[] threshold){
//		super(new Board());
//		this.score = new ScoreLightning(threshold, super.highScoreList);
//	}
	
	public Lightning(File f) {
		super(f);
		this.score = new ScoreLightning(super.threshold, super.highScore);
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(f));
			// Skip level number
			inputStream.readLine();
			this.time = Integer.parseInt(inputStream.readLine());
			// skip high score, is complete, threshold
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
	
	//End this current level, return to menu
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

	
}
