package player.view.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import player.models.Board;
import player.models.Level;
import player.models.Word;

public class CustomUndoButton extends JButton implements ActionListener {
    private Level level;
    private WordPanel wordPanel;
    private Board board;
    private InfoPanel infoPanel;

    public CustomUndoButton(Level level, WordPanel wordPanel, InfoPanel infoPanel) {
        this.level = level;
        this.wordPanel = wordPanel;
        this.infoPanel = infoPanel;
        board = level.getBoard();
        setText("Undo");
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        GamePanel gamePanel = (GamePanel) infoPanel.getParent();
        board.loadSquareState();
        wordPanel.loadWordListState();
        gamePanel.getBoardPanel().reputLetter();
        gamePanel.getBoardPanel().repaint();
        gamePanel.getBoardPanel().getParent().repaint();
        SwingUtilities.getRoot(this).repaint();
    }
}
