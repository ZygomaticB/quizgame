package quizGame;

import java.util.ArrayList;

public class NameGame {

	private ArrayList<String> answersList = new ArrayList<String>();
	private QuizItem current;
	private String answer;

	public NameGame(ListModule m) {
		//create a new naming game from a given module
	}
	
	// Requires: nothing
	// Modifies: answers
	// Effects: creates a list of possible answers from random names in the module
	//          randomly places the answer within the list
	public ArrayList<String> getAnswers() {
		return null;
	}
	
	// Modifies: this
	// Effects: sets the current answer for the quiz
	public void setAnswer(QuizItem current) {
		
	}
	
	//Effects: returns the current answer for the quiz
	public String getAnswer() {
		return "";
	}
	
	public String getPhoto() {
		
	}
	
}
