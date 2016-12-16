package player.models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import player.models.score.Score;

public abstract class Level {
	Board board;
	String stringWordsFound[];
	boolean isComplete;
	Dictionary dictionary;
	int index;
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	int highScore;
	int threshold[] = new int[3];

	/**
	 * Constructor create a new board
	 * @param  board board
	 */
	public Level(Board board) {
		this.board = board;
		this.dictionary = new Dictionary();
	}

	public int[] getThreshold() {
		return threshold;
	}

	/**
	 * Constructor load Level from file
	 * @param  f file
	 */
	public Level(File f) {
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(f));
			// Level number
			this.index = Integer.parseInt(inputStream.readLine());
			
			// Skip feature info
			inputStream.readLine();
			
			// Threshold
			String thresholdString[] = inputStream.readLine().split(" ");
			for (int i = 0; i < 3; i++) {
				this.threshold[i] = Integer.parseInt(thresholdString[i]);
			}
			
			// High score
			this.highScore = Integer.parseInt(inputStream.readLine());
			
			// Is Complete
			this.isComplete = Integer.parseInt(inputStream.readLine()) == 0 ? false : true;
			
			// Board shape
//			this.board = new Board();
//			this.board.initialize(inputStream.readLine());
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
	

	/**
	 * get board
	 * @return return current board
	 */
	public Board getBoard() {
		return board;
	}
	
/*	public void addFoundWord(Word w) {
		this.wordsFound.push(w);
	}
	
	public void removeLastFoundWord(){
		this.wordsFound.pop();
	}*/

	void writeToFile(File f){
		BufferedWriter outputStream = null;
		try {
			outputStream = new BufferedWriter(new FileWriter(f));
			// Level number
			outputStream.write(this.index);
			outputStream.write("\n");

			//			// Skip feature info
			//			outputStream.readLine();
			outputStream.write("\n");
			// Threshold

			for (int i = 0; i < 3; i++){
				outputStream.write(threshold[i] + " ");
			}
			outputStream.write("\n");

			// High score
			outputStream.write(this.highScore);
			outputStream.write("\n");

			// Is Complete
			int complete = this.isComplete ? 1 : 0;
			outputStream.write(complete);
			outputStream.write("\n");


			// Board shape
			
			outputStream.write(this.board.toString());
			outputStream.write("\n");

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
	}
	
//	public abstract boolean isActive();
	
	//Initialize a level
	abstract void initialize();
	
	
	//End this current level (and 
	abstract boolean endLevel();
	
	//Reset this level
	abstract boolean reset();
	
	//Undo last move
	public abstract boolean undo();
//	{
//		if (!this.board.wordsFound.empty()){
//			Word lastWordFound = board.wordsFound.peek();
//			
//			
//			
//			//Update high score /////////////////TO-DO///////////
//			if(this.score.getScore() == this.score.getHighScore()){
//				this.score.getHighScoreList().pop();
//				score.setHighScore(this.score.getHighScoreList().peek()); 
//				
//			};
//			
//			this.score.removeScore(lastWordFound);
//			
//			this.score.calculateStar();
//			
//		}
//		return true;
//	}
	
	//Update once player has found a valid word
	public abstract void updateLevel();
//	{
//		
//		if (board.updateBoard()){
//			
//			Word lastWordFound = board.wordsFound.peek();
//			
//			//Update the scores
//			this.score.updateScore(lastWordFound);
//			this.score.updateHighScore();
//			this.score.calculateStar();
//			
//			//
//		}
//	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Index " + this.index); 
		sb.append("\n"); 
		sb.append("Threshold " + this.threshold[0] + " " + this.threshold[1] + " " + this.threshold[2]);
		sb.append("\n"); 
		sb.append("Highscore " + this.highScore);
		sb.append("\n"); 
		sb.append("Is complete " + this.isComplete);
		sb.append("\n"); 
		sb.append(this.board.toString());
		return sb.toString();
	}
	
	public String getType() {
		if (this.index % 3 == 1) {
			return "puzzle";
		}
		
		if (this.index % 3 == 0) {
			return "theme";
		}
		
		return "lightning";
	}
	
	abstract public Score getScore();
	
	public void printToFile() {
		String name = String.format("../cobalt-lettercraze/levels/Level%d.txt", this.getIndex());
		File file = new File(name);
		try {
			PrintWriter writerClear = new PrintWriter(file);
			writerClear.close();
			PrintWriter writer = new PrintWriter(file);

			// Add level index
			writer.println(this.getIndex());
			//Maximum number of words
			if (this.getType().equals("theme")){
				writer.print(((Theme) this).getTheme() + " ");
				//List of words to find
				String[] list = ((Theme) this).getWordsToFind();
				for (int i = 0; i < list.length; i++){
					writer.print(list[i] + " ");
				}
				writer.println();
			}

			if (this.getType().equals("puzzle")) {
				writer.println(((Puzzle) this).getMaxMoves());
			}

			if (this.getType().equals("lightning")) {
				writer.println(((Lightning) this).getTime());
			}


			//Thresholds
			int stars[] = this.getScore().getThreshold();

			for (int j = 0; j <3; j++){
				writer.print(stars[j] + " ");
			}
			
			writer.println();

			//High score
			writer.println(this.getScore().getHighScore());
			//Is complete?
			writer.println(this.getScore().getHighScore() >= this.getScore().getThreshold()[0] ? 1 : 0);
			//Board visibility
			writer.println(this.getBoard().toString());
			writer.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
