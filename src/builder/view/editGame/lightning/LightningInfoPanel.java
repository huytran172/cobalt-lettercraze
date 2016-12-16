package builder.view.editGame.lightning;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import builder.controller.PreviewLightningController;
import builder.controller.PreviewPuzzleController;
import builder.controller.SaveLightningController;
import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.editGame.GameFrame;
import player.models.Board;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LightningInfoPanel extends JPanel {
	private JTextField textField;
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 * @param level 
	 */
	public LightningInfoPanel(Board b, int level, boolean add) {
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(225, 5, 0, 0);
		add(label);
		
		JLabel lblStar = new JLabel("1 Star:");
		lblStar.setBounds(6, 16, 61, 16);
		add(lblStar);
		
		textField = new JTextField();
		textField.setBounds(59, 11, 61, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblStars = new JLabel("2 Stars:");
		lblStars.setBounds(6, 44, 61, 16);
		add(lblStars);
		
		textField_1 = new JTextField();
		textField_1.setBounds(59, 39, 61, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStars_1 = new JLabel("3 Stars:");
		lblStars_1.setBounds(6, 72, 61, 16);
		add(lblStars_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(59, 67, 61, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(6, 126, 61, 16);
		add(lblTime);
		
		textField_3 = new JTextField();
		textField_3.setBounds(59, 121, 105, 26);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.setBounds(6, 380, 91, 29);
		btnPreview.addActionListener(new PreviewLightningController(this, b));
		add(btnPreview);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(98, 380, 67, 29);
		btnSave.addActionListener(new SaveLightningController(this, b, level, add));
		add(btnSave);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(168, 380, 67, 29);
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
