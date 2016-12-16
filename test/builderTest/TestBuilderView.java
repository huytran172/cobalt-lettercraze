package builderTest;

import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPanel;

import builder.controller.SavePuzzleController;
import builder.view.BuilderApplication;
import builder.view.dropdownMenu.CustomConfirmButton;
import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.editGame.GameFrame;
import builder.view.editGame.SquarePanel;
import builder.view.editGame.lightning.LightningGamePanel;
import builder.view.editGame.puzzle.PuzzleGamePanel;
import builder.view.editGame.puzzle.PuzzleInfoPanel;
import builder.view.selectModeMenu.SelectModeMenuFrame;
import junit.framework.TestCase;
import player.models.Letter;
import player.models.Square;

public class TestBuilderView extends TestCase{
	BuilderApplication blc = new BuilderApplication();


	/**
	 * Test Builder Application
	 */
	public void testBuilderController(){
		
		//Set up
		blc.main(null);
		
		//Test splash GUI 
		blc.runBuilderApp();
		assertFalse(blc.getSplash().isVisible());
		
		//Test Drop Menu
		DropMenuFrame dmf = new DropMenuFrame();
		dmf.main(null);
		CustomConfirmButton ccb = new CustomConfirmButton(1);
		ccb.setLevelNum(1);
		assertEquals(ccb.getLevelNum(),1);
		//Test Select Mode GUI
		CustomConfirmButton btnNewButton = new CustomConfirmButton(0);
		SelectModeMenuFrame smf = new SelectModeMenuFrame();
		smf.main(null);

		CustomConfirmButton puzzle = new CustomConfirmButton(0);
		assertEquals(puzzle.getLevelNum(),1);
		
		CustomConfirmButton lightning = new CustomConfirmButton(1);
		assertEquals(lightning.getLevelNum(),2);
		
		CustomConfirmButton theme = new CustomConfirmButton(2);
		assertEquals(theme.getLevelNum(),3);
		
		//Create Puzzle game frame and panel, test info panel
		GameFrame gfpuzzle = new GameFrame(1, true);
		PuzzleGamePanel puzzleGamePanel = (PuzzleGamePanel) gfpuzzle.getContentPane();
		assertEquals(puzzleGamePanel, new PuzzleGamePanel(1, true));
		PuzzleInfoPanel puzzleInfoPanel = puzzleGamePanel.getInfoPanel();
		assertTrue(puzzleInfoPanel.isAdd());
		assertEquals(puzzleInfoPanel.getLevelNum(), 1);
		
		//Test Save Controller
		SavePuzzleController spc = new SavePuzzleController(puzzleInfoPanel, puzzleInfoPanel.getB(), 1, puzzleInfoPanel.isAdd());
		puzzleInfoPanel.getTextField_3().setText("1");
		puzzleInfoPanel.getTextField().setText("2");
		puzzleInfoPanel.getTextField_1().setText("3");
		puzzleInfoPanel.getTextField_2().setText("4");
		
		assertEquals(puzzleInfoPanel.getTextField_3().getText(), "1");
		assertEquals(puzzleInfoPanel.getTextField().getText(), "2");
		assertEquals(puzzleInfoPanel.getTextField_1().getText(), "3");
		assertEquals(puzzleInfoPanel.getTextField_2().getText(), "4");
		

		
		//Test Text file created by save controller
		String name = String.format("../cobalt-lettercraze/levelsBuilderMade/Level%d.txt", spc.levelName());
//		File file = new File(name);
//		try {
//			FileReader fileReader = new FileReader(file);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			assertEquals(bufferedReader.readLine(), String.format("%d", spc.levelName()));
//			assertEquals(bufferedReader.readLine(), null);
//		} catch (FileNotFoundException e) {
//		
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Create Lightning Game frame and Panel, test info panel
		GameFrame gflightning = new GameFrame(2, true);
		assertEquals(gfpuzzle.getContentPane(), new LightningGamePanel(1, true));
		
		GameFrame gftheme = new GameFrame(3, true);
	}


	
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
