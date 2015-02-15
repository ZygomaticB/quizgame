package quizGame;

import java.util.ArrayList;

public class QuizGameModel {
	
	public final String MAIN_MENU = "Main Menu"; 
	public final String MODULE_OPTIONS = "Module Options"; 
	
	private ArrayList<ListModule> modules; 
	private String state; 
	
	public QuizGameModel(){
		//modules = getListModules;
		this.state = MAIN_MENU; 
		//for testing, generate some default Modules
		modules = new ArrayList<ListModule>(); 
		getModulesFromFile(); 
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//TODO read from the file to get the modules that are availible. 
	public void getModulesFromFile(){
		modules.add(new ListModule("Bio")); 
		modules.add(new ListModule("Math")); 
		modules.add(new ListModule("Science")); 
	}
	
	public ArrayList<ListModule> getModules() {
		return modules;
	}

	public void setModules(ArrayList<ListModule> modules) {
		this.modules = modules;
	}
}
