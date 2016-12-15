package player.view.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import player.models.Board;
import player.models.Level;
import player.models.Word;
import player.models.score.Score;

public class CustomResetButton extends JButton implements ActionListener{
	private Level level;
    //private BoardPanel boardPanel;
    private InfoPanel infoPanel;
    private Board board;

    
    public CustomResetButton(Level level, InfoPanel infoPanel) {
        this.level = level;
        this.infoPanel = infoPanel;
        //this.wordPanel = wordPanel;
        board = this.level.getBoard();
        setText("Reset");
        addActionListener(this);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		GamePanel gamePanel = (GamePanel) infoPanel.getParent();
		board.resetBoard();
		gamePanel.getBoardPanel().reputLetter();
		//BoardPanel boardInParent = ((GamePanel) this.infoPanel.getParent()).getBoardPanel();
		//boardInParent.redrawBoardPanel();
		//System.out.println(boardInParent.toString());
		//System.out.println(this.infoPanel.getParent());
		
	}

}


