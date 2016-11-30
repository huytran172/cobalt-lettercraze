package player.view.game;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel {
	protected JLabel highScore;
	protected JLabel currentScore;
	protected JButton[] buttons = new JButton[3];
	Container content = new Container();

	
	GamePanel(){
		
	    JLabel highScore = new JLabel("High score");
		highScore.setBounds(50, 50, 200, 200);
		add(highScore);
		
		JLabel currentScore = new JLabel("Current score");
		add(currentScore);
		currentScore.setLocation(200, 100);
		
		
		JButton reset = new JButton("Reset");
		JButton quit = new JButton("Quit");
		JButton undo = new JButton("Undo");
		
		add(reset);
		add(quit);
		add(undo);
		
	}

//		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{57, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		setLayout(gbl_contentPane);
//		
//		int currentGridX = 1;
//		int currentGridY = 2;
//		
//		/*for (int i = 1; i < 16; i++){
//			btnLevel[i] = new CustomLevelButton(i, 0);
//			GridBagConstraints gbc_btnLevel = new GridBagConstraints();
//			gbc_btnLevel.insets = new Insets(0, 0, 5, 5);
//			
//			gbc_btnLevel.gridx = currentGridX;
//			gbc_btnLevel.gridy = currentGridY;
//			add(btnLevel[i], gbc_btnLevel);
//			
//			currentGridX = currentGridX + 2;
//			if ((i % 5) == 0){
//				currentGridX = 1;
//				currentGridY = currentGridY + 2;
//			}
//		}*/
		
		
		
//		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
//		gbc_btnHelp.gridx = 12;
//		gbc_btnHelp.gridy = 12;
//		add(btnHelp, gbc_btnHelp);
	
}


