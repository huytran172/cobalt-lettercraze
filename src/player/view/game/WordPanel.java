package player.view.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.*;

import player.models.QuickSaveState;

public class WordPanel extends JPanel {
	private JScrollPane vertical;
    private JTextArea console;
    private QuickSaveState saveState = new QuickSaveState();


	public WordPanel() {
		
		//setBackground(Color.lightGray);
        console = new JTextArea(8, 20);
        console.setPreferredSize(new Dimension(300, 260));
        console.setLayout(new BoxLayout(console, BoxLayout.Y_AXIS));
//        console.add(new JLabel("Khuyen Cao"));
//        console.add(new JLabel("Trang Ha"));
//        console.add(new JLabel("Quyen Hoang"));
//        console.add(new JLabel("Hung Hong"));
//        console.add(new JLabel("Huy Tran"));
//        console.add(new JLabel("Hello world"));
        console.disable();
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
	}

	public void testAdd() {
	    console.add(new JLabel("hello"));
    }

	public void addToWordPanel(String string) {
        JLabel label = new JLabel(string);
        label.setFont(label.getFont().deriveFont(18f));
	    console.add(label);
	    console.revalidate();
	    console.repaint();
	    saveState.addNewWordState(string);
    }
	
	public void loadWordListState(){
		ArrayList<String> wordList = saveState.getWordListState();
		if (wordList != null){
			console.removeAll();
			for (int i = 0; i < wordList.size(); i++){
				JLabel label = new JLabel(wordList.get(i));
				label.setFont(label.getFont().deriveFont(18f));
				console.add(label);
				console.revalidate();
			}
		}
	}

	public void clearWordPanel() {
		console.removeAll();
		console.revalidate();
		console.repaint();
	}
}

