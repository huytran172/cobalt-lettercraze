package playerTest.Entity;

import junit.framework.TestCase;
import player.models.QuickSaveState;

public class testQuickSaveState extends TestCase {
	public void testQuickSaveState(){
		QuickSaveState q = new QuickSaveState();
		q.addFixedEnableList(true);
		q.getFixedEnableList();
		q.addLastScore(5);
		assertEquals(q.getLastScore(),5);
	}
}
