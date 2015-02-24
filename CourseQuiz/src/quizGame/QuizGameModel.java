package quizGame;

import java.util.ArrayList;

public class QuizGameModel {
	
	public final String MAIN_MENU = "Main Menu"; 
	public final String MODULE_OPTIONS = "Module Options"; 
	public final String QUIZ_QUESTIONS = "Quiz Questions";
	
	private ArrayList<String> modules; 
	private String state; 
	
	public QuizGameModel(){
		//modules = getListModules;
		this.state = MAIN_MENU; 
		//for testing, generate some default Modules
		modules = new ArrayList<String>(); 
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
		modules.add("anatomy"); 
		modules.add("biology");
	}
	
	public ArrayList<String> getModules() {
		return modules;
	}

	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}
}
