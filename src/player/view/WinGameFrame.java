package player.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import player.view.game.GameFrame;
import player.view.menu.MenuScreenFrame;

import javax.swing.JLabel;
import javax.swing.JButton;

public class WinGameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinGameFrame frame = new WinGameFrame();
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
	public WinGameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblCongratulationsYouWon = new JLabel("Congratulations, YOU WON!!!");
		lblCongratulationsYouWon.setBounds(134, 42, 190, 46);
		panel.add(lblCongratulationsYouWon);
		
		JButton btnYay = new JButton("Yay!!!");
		btnYay.setBounds(165, 128, 117, 29);
		panel.add(btnYay);
		btnYay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	WinGameFrame currentFrame = (WinGameFrame) SwingUtilities.getRoot(btnYay);
        		currentFrame.dispose();
        		MenuScreenFrame frame = new MenuScreenFrame();
				frame.setVisible(true);
            }
        });
	}
}
