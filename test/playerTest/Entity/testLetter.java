package playerTest.Entity;

import junit.framework.TestCase;
import player.models.Letter;
import player.models.RandomLetter;

public class testLetter extends TestCase {
	public void testLetter(){
		Letter random = new Letter("");
		random.setS("a");
		assertEquals(random.getS(), "a");

		Letter e = new Letter("e");
		Letter t = new Letter("t");
		assertEquals(e.getScore(), 1);
		assertEquals(t.getScore(), 1);
		
		Letter a = new Letter("a");
		Letter o = new Letter("o");
		Letter i = new Letter("i");
		Letter n = new Letter("n");
		Letter h = new Letter("h");
		Letter s = new Letter("s");
		Letter r = new Letter("r");
		assertEquals(a.getScore(), 2);
		assertEquals(o.getScore(), 2);
		assertEquals(i.getScore(), 2);
		assertEquals(n.getScore(), 2);
		assertEquals(h.getScore(), 2);
		assertEquals(s.getScore(), 2);
		assertEquals(r.getScore(), 2);
		
		Letter f = new Letter("f");
		Letter g = new Letter("g");
		Letter y = new Letter("y");
		Letter p = new Letter("p");
		Letter b = new Letter("b");
		assertEquals(f.getScore(), 4);
		assertEquals(g.getScore(), 4);
		assertEquals(y.getScore(), 4);
		assertEquals(p.getScore(), 4);
		assertEquals(b.getScore(), 4);
		
		Letter v = new Letter("v");
		Letter k = new Letter("k");
		assertEquals(v.getScore(), 5);
		assertEquals(k.getScore(), 5);
		
		Letter j = new Letter("j");
		Letter x = new Letter("x");
		assertEquals(j.getScore(), 7);
		assertEquals(x.getScore(), 7);
		
		Letter q = new Letter("q");
		Letter z = new Letter("z");
		assertEquals(q.getScore(), 8);
		assertEquals(z.getScore(), 8);
		
		Letter qu = new Letter("qu");
		assertEquals(qu.getScore(), 11);
		
		Letter c = new Letter("c");
		assertEquals(c.getScore(), 3);
		
		c.setStringEmpty();
		assertTrue(c.isEmptyString());
		assertFalse(qu.isEmptyString());
	}
	
	public void testRandomLetter(){
		RandomLetter rl = new RandomLetter();
		rl.generateLetter();
	}

}
