package player.models;

public class Theme extends Level{
	String theme;
	String wordsToFind[];
	
	public Theme(String theme, String wordsToFind[]){
		this.theme = theme;
		this.wordsToFind = wordsToFind;
	}
	
	@Override
	boolean endLevel(){
		return true;
	}

	//Reset board, score, list of words found
	@Override
	boolean reset(){
		return false;
	}

	//Undo last move
	@Override
	boolean undo(){
		return true;
	}

	@Override
	void initialize() {
		
	}
}
