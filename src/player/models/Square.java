package player.models;

public class Square {
	Letter letter;
	int row;
	
	protected int column;
	protected boolean isSelected;
	protected boolean isEnabled;
	
	/**
	 * Generate square with letter
	 * @param letter
	 * @param row
	 * @param column
	 * @param isEnabled
	 */
	public Square(Letter letter, int row, int column, boolean isEnabled) {
		this.letter = letter;
		this.row = row;
		this.column = column;
		this.isEnabled = isEnabled;
	}
	
	/**
	 * Generate square with random letter
	 * @param row
	 * @param column
	 * @param isEnabled
	 */
	public Square(int row, int column, boolean isEnabled) {
		this.letter = new Letter(RandomLetter.generateLetter());
		this.row = row;
		this.column = column;
		this.isEnabled = isEnabled;
	}
	
	/**
	 * Toggle the square
	 */
	public void toggleSelect() {
		if (isSelected) {
			deselect();
		} else {
			select();
		}
	}

	/**
	 * Select the square
	 */
	public void select() {
		this.isSelected = true;
	}

	/**
	 * Deselect the square
	 */
	public void deselect() {
		this.isSelected = false;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isSelected() {
		return this.isSelected;
	}

	/**
	 * [updateLetter description]
	 */
	public void updateLetter() {
		
	}
	
	//Get the square's letter
	public Letter getLetter() {
		return this.letter;
	}

	/**
	 * Check if the square has no letter in it
	 * @return boolean
	 */
	public boolean isEmptySquare() {
		return letter.isEmptyString();
	}

	/**
	 * Clear square 
	 * Make the letter in the square become empty string
	 */
	public void clearSquare() {
		this.letter.setStringEmpty();
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	public void setSelected(boolean selected) {
		this.isSelected = selected;
	}

	public void toggleEnabled() {
		isEnabled = !isEnabled;
	}
}
