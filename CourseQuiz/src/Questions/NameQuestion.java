package Questions;


public class NameQuestion extends Question {

	public NameQuestion(String name) {
		this.answer = name;
	}

	@Override
	public boolean submitAnswer(String answer) {
		return this.answer.equals(answer);
	}

}
