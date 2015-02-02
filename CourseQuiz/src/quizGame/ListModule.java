package quizGame;

import java.util.ArrayList;

public class ListModule implements Module {
	
	ArrayList<QuizItem> quizItems;

	public ListModule() {
		quizItems = new ArrayList<QuizItem>();
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
	
}
