package builder.view.editGame.theme;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.editGame.GameFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class ThemeInfoPanel extends JPanel {
	
	JTextField textField;
	JLabel maximumWords;
	
	JButton preview;
	JButton saveLevel;
	JButton quit;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public ThemeInfoPanel(){
		initialize();
	}
	
	private void initialize(){
		setLayout(null);
		setBounds(660, 170, 260, 510);
		setBackground(Color.lightGray);
		
		maximumWords = new JLabel("Theme:");
		maximumWords.setBounds(90, 26, 125, 39);
		add(maximumWords);
		
		textField = new JTextField();
		textField.setBounds(67, 59, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPreview.setBounds(0, 404, 91, 29);
		add(btnPreview);
		
		JButton btnSaveLevel = new JButton("Save Level");
		btnSaveLevel.setBounds(90, 404, 91, 29);
		add(btnSaveLevel);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(190, 404, 65, 29);
		btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	GameFrame currentFrame = (GameFrame) SwingUtilities.getRoot(btnQuit);
        		currentFrame.dispose();
        		DropMenuFrame frame = new DropMenuFrame();
				frame.setVisible(true);
            }
        });
		add(btnQuit);
		
		JLabel lblEnterWord = new JLabel("Enter Word:");
		lblEnterWord.setBounds(90, 171, 77, 16);
		add(lblEnterWord);
		
		textField_1 = new JTextField();
		textField_1.setBounds(67, 199, 130, 83);
		add(textField_1);
		textField_1.setColumns(10);

	}
}
