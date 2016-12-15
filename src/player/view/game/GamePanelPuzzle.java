package player.view.game;

import player.models.Puzzle;
import player.view.game.featurePanel.FeaturePanelPuzzle;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.PuzzleSubmitButton;

public class GamePanelPuzzle extends GamePanel {
	private Puzzle level;
	private BoardPanel boardPanel;
	private TitlePanel titlePanel;
	private InfoPanel infoPanel;
	private FeaturePanelPuzzle featurePanel;
	private PuzzleSubmitButton btn;
	
	GamePanelPuzzle(Puzzle level){
		super();
		this.level = level;
		this.setLayout(null);
				
		boardPanel = new BoardPanel(level.getBoard());
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);

		infoPanel = new InfoPanel(level);
		add(infoPanel);
		infoPanel.setBounds(480, 100, 280, 420);

		titlePanel = new TitlePanel("Puzzle");
		add(titlePanel);
		titlePanel.setBounds(40, 20, 600, 45);

		featurePanel = new FeaturePanelPuzzle(level, boardPanel);
		add(featurePanel);
		featurePanel.setBounds(200, 60, 300, 50);

		btn = new PuzzleSubmitButton(this);
		add(btn);
		btn.setBounds(60, 65, 100, 30);
	}

	public void initButton() {

	}

	@Override
	public Puzzle getLevel() {
		return level;
	}

	@Override
	public FeaturePanelPuzzle getFeaturePanel() {
		return featurePanel;
	}

	@Override
	public CustomSubmitButton getSubmitButton() {
		return btn;
	}
}


