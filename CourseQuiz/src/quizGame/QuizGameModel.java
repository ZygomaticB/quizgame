package quizGame;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	public void getModulesFromFile() {
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("modules"));
			for (Path file : stream) {
				modules.add(file.subpath(1, 2).toString());
			}
		} catch (IOException e) {
			modules.add("something went wrong");
		}
	}
	
	public ArrayList<String> getModules() {
		return modules;
	}

	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}
}
