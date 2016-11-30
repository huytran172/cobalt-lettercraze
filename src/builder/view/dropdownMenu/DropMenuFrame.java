package builder.view.dropdownMenu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Font;

public class DropMenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DropMenuFrame frame = new DropMenuFrame();
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
	public DropMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-500)/2;
	    int y = (screen.height-150)/2;
		setBounds(x, y, 500, 150);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBounds(x, y, 400, 150);

		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.LINE_AXIS));
		JLabel lblChooseLevel = new JLabel("CHOOSE LEVEL");
		lblChooseLevel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblChooseLevel);
	
		String[] choices = { "ADD NEW LEVEL","LEVEL 1","LEVEL 2", "LEVEL 3", "LEVEL 4", "LEVEL 5", "LEVEL 6", "LEVEL 7", "LEVEL 8",
				"LEVEL 9", "LEVEL 10", "LEVEL 11", "LEVEL 12", "LEVEL 13", "LEVEL 14", "LEVEL 15"};
		JComboBox<String> comboBox = new JComboBox<String>(choices);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("OK!");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
	
	}

}
