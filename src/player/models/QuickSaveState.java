package player.models;

import java.util.ArrayList;
import player.models.score.*;
import player.view.game.*;

public class QuickSaveState {
	
	protected ArrayList<ArrayList<String>> squareStateList = new ArrayList<ArrayList<String>>();
	protected ArrayList<Integer> scoreList = new ArrayList<Integer>();
	protected ArrayList<String> wordList = new ArrayList<String>();
	
	public void addNewSquareState(ArrayList<Square> squares){
		ArrayList<String> stringList = new ArrayList<String>();
		for (int i = 0; i < 36; i++){
			stringList.add(squares.get(i).getLetter().getS());
		}
		squareStateList.add(stringList);
	}
	
	public ArrayList<String> getLastSquareState(){
		if (squareStateList.size() > 0) {
			ArrayList<String> squareList = squareStateList.get(squareStateList.size() - 1);
			squareStateList.remove(squareStateList.size() - 1);
			return squareList;
		} else return null;
	}
	
	public void addNewWordState(String string){
		wordList.add(string);
	}
	
	public ArrayList<String> getWordListState(){
		if (wordList.size() > 0) {
			wordList.remove(wordList.size() - 1);
			return wordList;
		} else return null;
	}
}
