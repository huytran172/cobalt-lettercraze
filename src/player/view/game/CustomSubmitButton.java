package player.view.game;

import player.models.Board;
import player.models.Level;
import player.models.Word;
import player.view.menu.HelpFrame;
import player.view.menu.MenuScreenFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by quyendinhthuchoang on 12/12/2016.
 */
public class CustomSubmitButton extends JButton implements ActionListener {
    private Level level;
    private WordPanel wordPanel;
    private Board board;
    private Word word;
    private InfoPanel infoPanel;

    public CustomSubmitButton(Level level, WordPanel wordPanel, InfoPanel infoPanel) {
        this.level = level;
        this.wordPanel = wordPanel;
        this.infoPanel = infoPanel;
        board = level.getBoard();
        setText("Submit");
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        GamePanel gamePanel = (GamePanel) infoPanel.getParent();
        word = board.getTempWord();
        if (word.validWord()) {
            System.out.print(word.getWordString());
            wordPanel.addToWordPanel(word.getWordString());
            word.clearWord();
            board.updateBoard();
            board.fillEmptySquares();
            gamePanel.getBoardPanel().reputLetter();
        }

        gamePanel.getBoardPanel().deselectWord(word);
        gamePanel.getBoardPanel().reputLetter();
        gamePanel.getBoardPanel().revalidate();
        gamePanel.getBoardPanel().repaint();
        gamePanel.getBoardPanel().getParent().revalidate();
        gamePanel.getBoardPanel().getParent().repaint();
        SwingUtilities.getRoot(this).revalidate();
        SwingUtilities.getRoot(this).repaint();
        board.renewTempWord();
    }
}
