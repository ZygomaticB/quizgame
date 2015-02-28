package quiz.game.controller;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.jdom2.JDOMException;

import quizGame.QuizGameModel;
import quizGameUI.Game;
import quizGameUI.ModuleMenu;

public class ModuleSelectionActionListener implements ActionListener {

	private QuizGameModel model; 
	private Game view; 
	ArrayList<String> modules;
	
	
	public ModuleSelectionActionListener(QuizGameModel model, Game view, String module) throws JDOMException, IOException{
		this.model = model; 
		this.view = view;
		modules = new QuestionsUploader("modules/" + module + "/" + module + ".xml").getQuestionTypes();
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
