package player.view.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WordPanel extends JPanel {
	private JScrollPane vertical;
    private JTextArea console;


	public WordPanel() {
		
		//setBackground(Color.lightGray);
        console = new JTextArea(8, 20);
        console.setPreferredSize(new Dimension(300, 260));
        console.setLayout(new BoxLayout(console, BoxLayout.Y_AXIS));
        console.add(new JLabel("Khuyen Cao"));
        console.add(new JLabel("Trang Ha"));
        console.add(new JLabel("Quyen Hoang"));
        console.add(new JLabel("Hung Hong"));
        console.add(new JLabel("Huy Tran"));
        console.add(new JLabel("Hello world"));
        console.add(new JLabel("Hello world"));
        console.add(new JLabel("Hello world"));
        console.add(new JLabel("Hello world"));
        console.add(new JLabel("Hello world"));
        console.add(new JLabel("Hello world"));
        console.add(new JLabel("Hello world"));
        console.disable();
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
	}
}

