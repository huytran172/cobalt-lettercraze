package player.models;

public class Theme extends Level{
	String theme;
	String wordsToFind[];
	
	public Theme(String theme, String wordsToFind[]){
		this.theme = theme;
		this.wordsToFind = wordsToFind;
	}
	
	//End this current level, return to menu
	boolean endLevel(){
		return true;
	}
	
	//Reset board, score, list of words found
	boolean reset(){
		return false;
	}
	
	//Undo last move
	boolean undo(){
		return true;
	}
}
