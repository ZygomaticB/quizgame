package Questions;

import quizGame.QuizItem;

public class FunctionQuestion extends Question {
	
	FunctionQuestion(QuizItem q) {
		answer = q.getFunction();
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public boolean submitAnswer(String answer) {
		return this.answer.equals(answer);
	}

}
