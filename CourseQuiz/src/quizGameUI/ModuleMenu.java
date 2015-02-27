package quizGameUI;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import quiz.game.controller.ModuleMenuActionListener;
import quizGame.QuizGameModel;

//once a module is clicked, this screen appears 
public class ModuleMenu extends JPanel {
	
	private JButton button; 
	private QuizGameModel model; 
	private Game view; 
	
	//array to test building the layout. 
	
	ArrayList<String> modules = new ArrayList<String>();
	
	public ModuleMenu(String moduleName, QuizGameModel model, Game view){
		this.model = model; 
		this.view = view;
		JLabel title = new JLabel(moduleName);
		this.add(title);
		//add buttons for each submodule option.
		addButtons(modules); 
	}
	
	public ModuleMenu(String moduleName, ArrayList<String> modulesOptions,  QuizGameModel model, Game view){
		this.model = model; 
		this.view = view;
		JLabel title = new JLabel(moduleName); 
		this.add(title); 
		addButtons(modulesOptions); 
	}
	
	public void addButtons(ArrayList<String> modules){
		for(int i = 0; i<modules.size(); i++)
		{
			button = new JButton(modules.get(i)); 
			button.setMaximumSize(new Dimension(400,50));
			button.addActionListener(new ModuleMenuActionListener(model, view));
			this.add(button); 
			System.out.println(modules.get(i));
		}
	}
	
	public void refreshMenu(ArrayList<String> modules, String title){
		this.removeAll();
		JLabel label = new JLabel(title); 
		this.add(label); 
		addButtons(modules); 
	}
	
	public void removeButtons(){
		this.removeAll();
	}
}
