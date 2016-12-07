package player.models;

public class Square {
	
	Letter letter;
	int row;
	int column;
	boolean isEnabled;
	
	Square(Letter letter, int row, int column, boolean isEnabled){
		this.letter = letter;
		this.row = row;
		this.column = column;
		this.isEnabled = isEnabled;
	}
	
	//Choose a square
	boolean toggle(){
		return false;
	}
	
	//Update a new letter to the square
	void updateLetter(){
		
	}
	
	//Get the square's letter
	Letter getLetter(){
		return this.letter;
	}
	
}
