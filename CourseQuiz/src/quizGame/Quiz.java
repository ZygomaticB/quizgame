package quizGame;

import java.util.ArrayList;
import Questions.Question;

public class Quiz {
	private String moduleName;
	private ArrayList<Question> questions;
	private int currentItem;
	
	// Requires: filename exists in the directorytree in the right place
	// Modifes: this
	// Effects: construct a quiz from a given module
	public Quiz(String module) {
		this.moduleName = module;
		this.currentItem = 0;
		this.questions = new ArrayList<Question>();
		buildQuestionList();
	}
	
	public void buildQuestionList() {
		
	}
	
	// Effects: return the filename of the image
	public String getModuleName() {
		return moduleName;
	}

	public int getCurrentItemNumber() {
		return currentItem;
	}
	
	// Requires: questions is not empty
	// Modifies: currentItem
	// Effects: gets the next quiz item in the list, adds 1 to currentItem
	public Question getNextQuestions() {
		Question returnItem = questions.get(currentItem);
		if (currentItem < questions.size()) {
			currentItem += 1;
		}
		return returnItem;
	}
	
	// Requires: questions is not empty
	// Modifies: currentItem
	// Effects: returns the previous quiz item, if currentItem is 1st in list, return the last item
	//          reduces currentitem by 1 if currentitem > 0
	public Question getPreviousQuestion() {
		Question returnItem;
		if (currentItem > 0) {
			returnItem = questions.get(currentItem - 1);
			currentItem -= 1;
			return returnItem;
		}
		else
			currentItem = questions.size() - 1;
			returnItem = questions.get(currentItem);
		return returnItem;
	}
	
	// Requires: questions is >1 long
	// Modifies: currentitem
	// Effects: return a random QuizItem, set currentitem to index of the returned question
	public QuizItem getRandomQuestion() {
		return null;
	}
	
	
}
