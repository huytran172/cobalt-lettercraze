package player.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import player.models.score.Score;
import player.models.score.ScorePuzzle;
import player.models.score.ScoreTheme;

public class Theme extends Level{
	String theme;
	String wordsToFind[];
	ScoreTheme score;
	
	public Theme(String theme, String wordsToFind[], int threshold[]){
		super(new Board());
		this.theme = theme;
		this.wordsToFind = wordsToFind;
		this.score = new ScoreTheme(super.threshold, super.highScore);
	}
	
	public Theme(File f) {
		super(f);
		this.score = new ScoreTheme(super.threshold, super.highScore);
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(f));
			inputStream.readLine();
			String[] themeAndWords = inputStream.readLine().split(" ");
			this.theme = themeAndWords[0];
			this.wordsToFind = new String[themeAndWords.length - 1];
			System.arraycopy(themeAndWords, 1, wordsToFind, 0, themeAndWords.length - 1);
			inputStream.readLine();
			inputStream.readLine();
			inputStream.readLine();
			// Board shape
			this.board = new Board();
			this.board.initialize(inputStream.readLine(), themeAndWords);
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
	public boolean undo() {
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

	public String getTheme() {
		return theme;
	}

	public String[] getWordsToFind() {
		return wordsToFind;
	}
}
