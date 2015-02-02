package quizGame;

public class QuizItem {
	
	private String name;
	private Point point;
	
	// Constructor for QuizItem
	public QuizItem(String name, int x, int y) {
		this.name = name;
		this.point = new Point(x, y); 
	}
	// Effects: returns the name of the quiz item
	public String getName() {
		return "";
	}
	
	// Effects: return the point associated with the quiz item
	public Point getPoint() {
		return new Point();
	}
	
	public void setName(String newName) {
		
	}
	
	public void setPoint(Point newPoint) {
		
	}
	
}
