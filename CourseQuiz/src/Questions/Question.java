package Questions;

public abstract class Question {

	protected String answer;
	public abstract boolean submitAnswer(String answer);
	
	public String getAnswer() {
		return answer;
	}
}
