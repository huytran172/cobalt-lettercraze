package builder.view.editGame.theme;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.editGame.GameFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ThemeInfoPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public ThemeInfoPanel() {
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(225, 5, 0, 0);
		add(label);
		
		JLabel lblStar = new JLabel("1 Star:");
		lblStar.setBounds(6, 6, 61, 16);
		add(lblStar);
		
		JLabel lblStars = new JLabel("2 Stars:");
		lblStars.setBounds(6, 39, 61, 16);
		add(lblStars);
		
		JLabel lblStars_1 = new JLabel("3 Stars:");
		lblStars_1.setBounds(6, 67, 61, 16);
		add(lblStars_1);
		
		textField = new JTextField();
		textField.setBounds(60, 5, 99, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 62, 99, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(60, 34, 99, 26);
		add(textField_2);
		
		JLabel lblTheme = new JLabel("Theme:");
		lblTheme.setBounds(6, 106, 61, 16);
		add(lblTheme);
		
		JLabel lblEnterWord = new JLabel("ENTER WORD");
		lblEnterWord.setBounds(70, 139, 99, 16);
		add(lblEnterWord);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 101, 165, 26);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(6, 164, 236, 125);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.setBounds(6, 369, 79, 29);
		add(btnPreview);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(98, 369, 61, 29);
		add(btnSave);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(176, 369, 61, 29);
		add(btnQuit);
		btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	GameFrame currentFrame = (GameFrame) SwingUtilities.getRoot(btnQuit);
        		currentFrame.dispose();
        		DropMenuFrame frame = new DropMenuFrame();
				frame.setVisible(true);
            }
        });

	}

}
