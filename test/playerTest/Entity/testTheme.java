package playerTest.Entity;

import java.io.File;

import junit.framework.TestCase;
import player.models.Theme;

public class testTheme extends TestCase {
	public void testTheme(){
		File f = new File("../cobalt-lettercraze/levels/Level3.txt");
		Theme theme = new Theme(f);
		assertTrue(theme.endLevel());
		assertFalse(theme.reset());
		assertTrue(theme.undo());
		theme.initialize();
		assertEquals(theme.getType(), "theme");
	}
}
