package player.view.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import player.models.Board;
import player.models.Level;
import player.models.Puzzle;
import player.models.Word;
import player.view.game.featurePanel.IFeaturePanel;
import player.view.game.gamepanel.GamePanel;

public class CustomUndoButton extends JButton implements ActionListener {
    private Level level;
    private WordPanel wordPanel;
    private Board board;
    private BoardPanel boardPanel;
    private InfoPanel infoPanel;
    private IFeaturePanel featurePanel;
    
    public CustomUndoButton(Level level, BoardPanel boardPanel, InfoPanel infoPanel, IFeaturePanel featurePanel) {
        this.level = level;
        this.infoPanel = infoPanel;
        this.boardPanel = boardPanel;
        this.wordPanel = infoPanel.getWordsFound();
        this.featurePanel = featurePanel;
        board = this.level.getBoard();
        setText("Undo");
        addActionListener(this);
    }

	public void actionPerformed(ActionEvent e) {
		board.loadSquareState();
        wordPanel.loadWordListState();
        featurePanel.increaseWordLeft();
        infoPanel.retrieveLastScore();
        boardPanel.reputLetter();
        boardPanel.repaint();
        wordPanel.repaint();
//        gamePanel.getBoardPanel().getParent().repaint();
//        SwingUtilities.getRoot(this).repaint();
    }
}
