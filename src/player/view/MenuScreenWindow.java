package player.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MenuScreenWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuScreenWindow frame = new MenuScreenWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuScreenWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{57, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnLevel = new JButton("Level 1");
		GridBagConstraints gbc_btnLevel = new GridBagConstraints();
		gbc_btnLevel.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel.gridx = 1;
		gbc_btnLevel.gridy = 2;
		contentPane.add(btnLevel, gbc_btnLevel);
		
		JButton btnLevel_1 = new JButton("Level 2");
		GridBagConstraints gbc_btnLevel_1 = new GridBagConstraints();
		gbc_btnLevel_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_1.gridx = 3;
		gbc_btnLevel_1.gridy = 2;
		contentPane.add(btnLevel_1, gbc_btnLevel_1);
		
		JButton btnLevel_2 = new JButton("Level 3");
		GridBagConstraints gbc_btnLevel_2 = new GridBagConstraints();
		gbc_btnLevel_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_2.gridx = 5;
		gbc_btnLevel_2.gridy = 2;
		contentPane.add(btnLevel_2, gbc_btnLevel_2);
		
		JButton btnLevel_3 = new JButton("Level 4");
		GridBagConstraints gbc_btnLevel_3 = new GridBagConstraints();
		gbc_btnLevel_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_3.gridx = 7;
		gbc_btnLevel_3.gridy = 2;
		contentPane.add(btnLevel_3, gbc_btnLevel_3);
		
		JButton btnLevel_4 = new JButton("Level 5");
		GridBagConstraints gbc_btnLevel_4 = new GridBagConstraints();
		gbc_btnLevel_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnLevel_4.gridx = 9;
		gbc_btnLevel_4.gridy = 2;
		contentPane.add(btnLevel_4, gbc_btnLevel_4);
		
		JButton btnLevel_5 = new JButton("Level 6");
		GridBagConstraints gbc_btnLevel_5 = new GridBagConstraints();
		gbc_btnLevel_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_5.gridx = 1;
		gbc_btnLevel_5.gridy = 4;
		contentPane.add(btnLevel_5, gbc_btnLevel_5);
		
		JButton btnLevel_6 = new JButton("Level 7");
		GridBagConstraints gbc_btnLevel_6 = new GridBagConstraints();
		gbc_btnLevel_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_6.gridx = 3;
		gbc_btnLevel_6.gridy = 4;
		contentPane.add(btnLevel_6, gbc_btnLevel_6);
		
		JButton btnLevel_7 = new JButton("Level 8");
		GridBagConstraints gbc_btnLevel_7 = new GridBagConstraints();
		gbc_btnLevel_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_7.gridx = 5;
		gbc_btnLevel_7.gridy = 4;
		contentPane.add(btnLevel_7, gbc_btnLevel_7);
		
		JButton btnLevel_8 = new JButton("Level 9");
		GridBagConstraints gbc_btnLevel_8 = new GridBagConstraints();
		gbc_btnLevel_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_8.gridx = 7;
		gbc_btnLevel_8.gridy = 4;
		contentPane.add(btnLevel_8, gbc_btnLevel_8);
		
		JButton btnLevel_9 = new JButton("Level 10");
		GridBagConstraints gbc_btnLevel_9 = new GridBagConstraints();
		gbc_btnLevel_9.insets = new Insets(0, 0, 5, 0);
		gbc_btnLevel_9.gridx = 9;
		gbc_btnLevel_9.gridy = 4;
		contentPane.add(btnLevel_9, gbc_btnLevel_9);
		
		JButton btnLevel_10 = new JButton("Level 11");
		GridBagConstraints gbc_btnLevel_10 = new GridBagConstraints();
		gbc_btnLevel_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_10.gridx = 1;
		gbc_btnLevel_10.gridy = 6;
		contentPane.add(btnLevel_10, gbc_btnLevel_10);
		
		JButton btnLevel_11 = new JButton("Level 12");
		GridBagConstraints gbc_btnLevel_11 = new GridBagConstraints();
		gbc_btnLevel_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_11.gridx = 3;
		gbc_btnLevel_11.gridy = 6;
		contentPane.add(btnLevel_11, gbc_btnLevel_11);
		
		JButton btnLevel_12 = new JButton("Level 13");
		GridBagConstraints gbc_btnLevel_12 = new GridBagConstraints();
		gbc_btnLevel_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_12.gridx = 5;
		gbc_btnLevel_12.gridy = 6;
		contentPane.add(btnLevel_12, gbc_btnLevel_12);
		
		JButton btnLevel_13 = new JButton("Level 14");
		GridBagConstraints gbc_btnLevel_13 = new GridBagConstraints();
		gbc_btnLevel_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnLevel_13.gridx = 7;
		gbc_btnLevel_13.gridy = 6;
		contentPane.add(btnLevel_13, gbc_btnLevel_13);
		
		JButton btnLevel_14 = new JButton("Level 15");
		GridBagConstraints gbc_btnLevel_14 = new GridBagConstraints();
		gbc_btnLevel_14.insets = new Insets(0, 0, 5, 0);
		gbc_btnLevel_14.gridx = 9;
		gbc_btnLevel_14.gridy = 6;
		contentPane.add(btnLevel_14, gbc_btnLevel_14);
		
		JButton btnHelp = new JButton("Help");
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.gridx = 9;
		gbc_btnHelp.gridy = 8;
		contentPane.add(btnHelp, gbc_btnHelp);
	}

}
