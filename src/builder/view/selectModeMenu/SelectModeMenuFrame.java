package builder.view.selectModeMenu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Font;

public class SelectModeMenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectModeMenuFrame frame = new SelectModeMenuFrame();
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
	public SelectModeMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-500)/2;
	    int y = (screen.height-150)/2;
		setBounds(x, y, 500, 150);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBounds(x, y, 400, 150);

		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.LINE_AXIS));
		JLabel lblChooseLevel = new JLabel("SELECT MODE");
		lblChooseLevel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblChooseLevel);
		
//		Integer[] choices = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//		JComboBox<Integer> comboBox = new JComboBox<Integer>(choices);
//		contentPane.add(comboBox);
				
		String[] choices = {"PUZZLE", "LIGHTNING", "THEME"};
		JComboBox<String> comboBox = new JComboBox<String>(choices);
		contentPane.add(comboBox);
		
		
		CustomConfirmButton btnNewButton = new CustomConfirmButton(comboBox.getSelectedIndex());
		contentPane.add(btnNewButton);

		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				btnNewButton.setLevelNum(comboBox.getSelectedIndex());
			}
		});
	}

}
