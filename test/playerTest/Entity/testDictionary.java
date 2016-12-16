package playerTest.Entity;

import java.io.IOException;

import junit.framework.TestCase;
import player.models.Dictionary;

public class testDictionary extends TestCase {
	public void testDictionary(){
		Dictionary d = new Dictionary();
		try {
			d.loadWordTable();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.isWord("Software");
		d.isWord("$(&YO*&^*^#@");
	}
}
