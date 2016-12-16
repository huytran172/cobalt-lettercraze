package builderTest;

import builder.view.BuilderApplication;
import builder.view.dropdownMenu.CustomConfirmButton;
import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.editGame.GameFrame;
import builder.view.editGame.SquarePanel;
import builder.view.selectModeMenu.SelectModeMenuFrame;
import junit.framework.TestCase;
import player.models.Letter;
import player.models.Square;

public class TestBuilderView extends TestCase{
	BuilderApplication blc = new BuilderApplication();

	public void testSetUp(){
		blc.main(null);
	}
	
	public void testSplashGUI(){
		blc.runBuilderApp();
		assertFalse(blc.getSplash().isVisible());
	}
	
	public void testDropMenu(){
		DropMenuFrame dmf = new DropMenuFrame();
		dmf.main(null);
		CustomConfirmButton ccb = new CustomConfirmButton(1);
		ccb.setLevelNum(1);
		assertEquals(ccb.getLevelNum(),1);
		//ccb.actionPerformed(null);
	}

	public void testSelectModeGUI(){
		SelectModeMenuFrame smf = new SelectModeMenuFrame();
		smf.main(null);
	}
	
//	public void testEditGameGUI(){
//		GameFrame gf1 = new GameFrame(1);
//		GameFrame gf2 = new GameFrame(2);
//		GameFrame gf3 = new GameFrame(3);
//	}
	
	public void testSquarePanel(){
		Letter a = new Letter("a");
		Letter empty = new Letter("");
		Square s = new Square(a, 0, 0, false);
		
		SquarePanel sp = new SquarePanel(s);
		sp.enableSquare(false);
		sp.toggleEnableSquare();
		sp.toggleSelect();
		sp.toggleColor();
		assertTrue(sp.isEnable());
		
	}
}
