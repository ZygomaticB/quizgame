package quizGame;

public class Point {

	/** A Point consists of an x and y position on an image with x=0 starting at the left margin
	 *  and increasing moving right. y=0 starts at top margin and y increases moving down
	 */
	
	private int x;
	private int y;
	
	public Point(int new_x, int new_y) {
		// create a new point with the given x and y position
		x = new_x;
		y = new_y;
	}
	
	public Point() {
		x = 0;
		y = 0;
	}

	public int getX() {
		// get the x value of the point
		return x; 
	}
	
	public int getY() {
		// get the y value of the point
		return y;
	}
	
	public void setX(int new_x) {
		// set the value of x
		x = new_x;
	}
	
	public void setY(int new_y) {
		//set the value for y
		y = new_y;
	}
}

