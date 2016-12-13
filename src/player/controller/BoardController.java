package player.controller;

import player.models.Board;
import player.models.Square;
import player.models.Word;
import player.view.game.BoardPanel;
import player.view.game.SquarePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by quyendinhthuchoang on 12/12/2016.
 */
public class BoardController extends MouseAdapter {
    BoardPanel boardPanel;
    Board board;
    //ArrayList<SquarePanel> squarePanels;
    ArrayList<Square> squares;
    SquarePanel squarePanel;
    Square square;


    public BoardController(SquarePanel sp, Square sq, BoardPanel bp, Board b) {
		boardPanel = bp;
		squarePanel = sp;
		square = sq;
		board = b;
		board.renewTempWord();
    }

	@Override
    public void mousePressed(MouseEvent me) {
        if (board.addSquareToTempWord(square)) {
            squarePanel.toggleColor();
        }
        System.out.print("testing ");
        System.out.print(board.getSquareList().indexOf(square));
        System.out.print(" " + board.getTempWord().getWordString());
        System.out.print("\n");
    }
}
