package quizGame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Properties;

public class ImageItem {
	public QuizItem quizItem;
	public Point point;
	
	public ImageItem (String name) {
		quizItem = new QuizItem(name);
		point = new Point(0,0);
	}
	
	public ImageItem (String name, int x, int y) {
		quizItem = new QuizItem(name);
		point = new Point(x, y);
	}
	
	public ImageItem(Path p) throws FileNotFoundException {
		String fileName = p.toString();
		String quizItemName = Read.firstLine(fileName);
		quizItem = new QuizItem(quizItemName);
		point = new Point(0, 0);
		
	}
	
	public void setQuizItem(QuizItem quizitem) {
		this.quizItem = quizitem;
	}
	
	public QuizItem getQuizItem() {
		return quizItem;
	}
	
	public void setPoint(int x, int y) {
		point = new Point(x, y);
	}
	
	public Point getPoint() {
		return point;
	}
}
