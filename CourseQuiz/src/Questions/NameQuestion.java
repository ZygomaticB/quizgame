package Questions;

import quizGame.QuizItem;

public class NameQuestion extends Question {

	NameQuestion(QuizItem q) {
		this.answer = q.getName();
	}

	@Override
	public boolean submitAnswer(String answer) {
		return this.answer.equals(answer);
	}

}
