package quizGame;

import java.util.ArrayList;

public class ListModule implements Module {
	
	private String name; 
	ArrayList<QuizItem> quizItems;

	public ListModule() {
		quizItems = new ArrayList<QuizItem>();
	}
	
	public ListModule(String name){
		quizItems = new ArrayList<QuizItem>(); 
		this.setName(name); 
	}

	public void loadFromFile() {
	
	}
	
	public void saveToFile() {
		
	}
	
	public void addQuizItem(QuizItem item) {
		quizItems.add(item);
	}
	
	public void createFromModule() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
