package builderTest;

import builder.view.BuilderApplication;
import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.selectModeMenu.SelectModeMenuFrame;
import junit.framework.TestCase;

public class BuilderTestView extends TestCase{
	BuilderApplication blc = new BuilderApplication();
	
	public void testSplashGUI(){
		blc.runBuilderApp();
		assertFalse(blc.getSplash().isVisible());
	}
	
	public void testDropMenu(){
		DropMenuFrame dmf = new DropMenuFrame();
	}
	
	public void testSelectModeGUI(){
		SelectModeMenuFrame smf = new SelectModeMenuFrame();
	}
	
	public void testEditGameGUI(){
		
	}
}
