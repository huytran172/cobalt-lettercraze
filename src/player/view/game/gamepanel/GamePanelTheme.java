package player.view.game.gamepanel;

import player.models.Theme;
import player.view.game.BoardPanel;
import player.view.game.InfoPanel;
import player.view.game.TitlePanel;
import player.view.game.featurePanel.FeaturePanelTheme;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.PuzzleSubmitButton;
import player.view.game.submitbutton.ThemeSubmitButton;

public class GamePanelTheme extends GamePanel {
	private BoardPanel boardPanel;
	private TitlePanel titlePanel;
	private InfoPanel infoPanel;
	private FeaturePanelTheme featurePanel;
	private Theme level;
	private ThemeSubmitButton btn;
	
	public GamePanelTheme(Theme level){
		super(level);

		titlePanel = new TitlePanel("Theme");
		add(titlePanel);
		titlePanel.setBounds(40, 20, 600, 45);
		//titlePanel.setBackground(Color.blue);

	    featurePanel = new FeaturePanelTheme(level, boardPanel);
		add(featurePanel);
		featurePanel.setBounds(boardPanel.getWidth() / 5, 65, 400, 50);

		btn = new ThemeSubmitButton(level, this.boardPanel, this.infoPanel, this.featurePanel);
		add(btn);
		btn.setBounds(60, 65, 100, 30);
	}

	@Override
	public Theme getLevel() {
		return level;
	}

	@Override
	public FeaturePanelTheme getFeaturePanel() {
		return featurePanel;
	}

	@Override
	public CustomSubmitButton getSubmitButton() {
		return btn;
	}

}


