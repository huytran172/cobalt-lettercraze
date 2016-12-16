package player.view.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import player.models.Board;
import player.models.Level;
import player.models.Word;
import player.models.score.Score;
import player.view.game.gamepanel.GamePanel;

public class CustomResetButton extends JButton implements ActionListener{
	private Level level;
    //private BoardPanel boardPanel;
    private BoardPanel boardPanel;
    private Board board;

    
    public CustomResetButton(Level level, BoardPanel boardPanel) {
        this.level = level;
        this.boardPanel = boardPanel;
        //this.wordPanel = wordPanel;
        board = this.level.getBoard();
        setText("Reset");
        addActionListener(this);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		board.resetBoard();
		boardPanel.reputLetter();
		//BoardPanel boardInParent = ((GamePanel) this.infoPanel.getParent()).getBoardPanel();
		//boardInParent.redrawBoardPanel();
		//System.out.println(boardInParent.toString());
		//System.out.println(this.infoPanel.getParent());
		
	}

}


