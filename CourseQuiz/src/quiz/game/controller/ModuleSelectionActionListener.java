package quiz.game.controller;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import quizGame.QuizGameModel;
import quizGameUI.Game;
import quizGameUI.ModuleMenu;

public class ModuleSelectionActionListener implements ActionListener {

	private QuizGameModel model; 
	private Game view; 
	String [] modules = {"Update 1", "Update 2", "Update 3"};
	
	
	public ModuleSelectionActionListener(QuizGameModel model, Game view){
		this.model = model; 
		this.view = view; 
	}
	
	/* When a module button is pressed, update to a new view and
	 * repaint the screen.
	 */
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		JPanel panel = view.getContectPanel();
		ModuleMenu menu = view.getModuleMenu();
		menu.refreshMenu(modules, button.getText()); 
		//update the view for dislay
		menu.revalidate();
		menu.repaint();	
		//switch to this card. 
		CardLayout layout = (CardLayout) panel.getLayout(); 
		layout.show(panel, model.MODULE_OPTIONS);
	}

}
