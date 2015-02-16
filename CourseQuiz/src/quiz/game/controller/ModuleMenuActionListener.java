package quiz.game.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import quizGame.QuizGameModel;
import quizGameUI.Game;
import quizGameUI.ModuleMenu;

public class ModuleMenuActionListener implements ActionListener {

	private QuizGameModel model; 
	private Game view; 	
	
	public ModuleMenuActionListener(QuizGameModel model, Game view){
		this.model = model; 
		this.view = view; 
	}
	
	/* When a module submenu is pressed... launch the quiz!
	 */
	public void actionPerformed(ActionEvent e) {
		JPanel panel = view.getContectPanel();
		CardLayout layout = (CardLayout) panel.getLayout(); 
		layout.show(panel, model.QUIZ_QUESTIONS);
	}


}
