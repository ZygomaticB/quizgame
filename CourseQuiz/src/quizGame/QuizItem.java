package quizGame;

public class QuizItem {
	
	private String name;
	
	public QuizItem(String name) {
		this.name = name;
	}
	
	// Effects: returns the name of the quiz item
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
}
