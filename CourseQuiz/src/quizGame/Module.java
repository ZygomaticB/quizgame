package quizGame;

public interface Module {

	void loadFromFile();
	void saveToFile();
	void addQuizItem(QuizItem item);
	void createFromModule();
}
