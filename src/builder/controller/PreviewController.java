package builder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import builder.view.BuilderApplication;
import player.models.*;


public class PreviewController implements ActionListener {
	BuilderApplication application;     /** Application we have control over. */
	Model model;                 /** Model containing state. */
	
	public PreviewController(BuilderApplication app, Model m) {
		this.application = app;
		this.model = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*JTextField tf = application.getFahrenheitField();
		
		IMove move = new ModifyValue(model, Integer.valueOf(tf.getText()));
		
		// request move
		if (move.execute()) {
			UndoManager.instance().recordMove(move);
			application.refresh();
		}*/
	}

}
