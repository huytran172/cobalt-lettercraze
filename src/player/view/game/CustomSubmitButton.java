package player.view.game;

import player.models.Board;
import player.models.Level;
import player.models.Word;
import player.view.menu.HelpFrame;
import player.view.menu.MenuScreenFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quyendinhthuchoang on 12/12/2016.
 */
public class CustomSubmitButton extends JButton implements ActionListener {
    private Level level;
    private WordPanel wordPanel;
    private Board board;
    private Word word;

    public CustomSubmitButton(Level level, WordPanel wordPanel) {
        this.level = level;
        this.wordPanel = wordPanel;
        board = level.getBoard();
        setText("Submit");
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        word = board.getTempWord();
        if (word.validWord()) {
            System.out.print(word.getWordString());
            wordPanel.addToWordPanel(word.getWordString());
        }
        board.renewTempWord();
    }
}
