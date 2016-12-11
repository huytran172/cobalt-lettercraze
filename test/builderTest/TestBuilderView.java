package builderTest;

import builder.view.BuilderApplication;
import builder.view.dropdownMenu.CustomConfirmButton;
import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.editGame.GameFrame;
import builder.view.selectModeMenu.SelectModeMenuFrame;
import junit.framework.TestCase;

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
	
	public void testEditGameGUI(){
		GameFrame gf1 = new GameFrame(1);
		GameFrame gf2 = new GameFrame(2);
		GameFrame gf3 = new GameFrame(3);
	}
}
