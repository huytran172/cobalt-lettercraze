package builder.view.editGame.theme;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import builder.view.editGame.BoardPanel;
import builder.view.editGame.StarPanel;
import builder.view.editGame.TitlePanel;
import builder.view.editGame.lightning.LightningInfoPanel;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class ThemeGamePanel extends JPanel {
	

	JPanel boardPanel;
	JPanel titlePanel;
	JPanel infoPanel;
	JPanel starPanel;
	
	public ThemeGamePanel(){
		
		this.setLayout(null);
		
		
		boardPanel = new BoardPanel();
	    add(boardPanel);
	    boardPanel.setBounds(60, 170, 510, 510);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new ThemeInfoPanel();
	    add(infoPanel);
	    
	    
	    titlePanel = new TitlePanel("Theme");
	    add(titlePanel);
	    titlePanel.setBounds(60, 20, 860, 85);
	    //titlePanel.setBackground(Color.blue);
	    
	    starPanel = new StarPanel();
	    add(starPanel);
	    starPanel.setBounds(60, 80, 1000, 100);
	    
	    
	    //add(titlePanel);
	   // add(infoPanel);
		
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


