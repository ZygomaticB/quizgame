package quizGame;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.util.Properties;

public class ImageItem {
	public QuizItem quizItem;
	public Point point;
	
	public ImageItem (String name) {
		quizItem = new QuizItem(name);
	}
	
	public ImageItem (String name, int x, int y) {
		quizItem = new QuizItem(name);
		point = new Point(x, y);
	}
	
	public ImageItem(Path p) {
		String fileName = p.toString();
		String quizItemName = Read.getName(fileName);
		quizItem = new QuizItem(quizItemName);
		point = new Point(0, 0);
		
	}
	
	public void setQuizItem(String name) {
		quizItem = new QuizItem(name);
	}
	
	public void setPoint(int x, int y) {
		//point = point.setX(x);
		//point = point.setY(y);
	}
	
	public QuizItem getQuizItem() {
		return quizItem;
	}
	
	public Point getPoint() {
		return point;
	}
}
