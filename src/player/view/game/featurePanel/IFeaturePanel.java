package player.view.game.featurePanel;

import player.models.Word;

/**
 * Created by quyendinhthuchoang on 12/14/2016.
 */
public interface IFeaturePanel {

	void increaseWordLeft();
	void decreaseWordLeft(Word word);
	int getWordLeft();
}
