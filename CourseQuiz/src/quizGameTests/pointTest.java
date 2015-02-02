package quizGameTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import quizGame.Point;

public class pointTest {

	
		Point testpoint = new Point();
	
	@Test
	public void twoArgPointConstructortest() {
		Point p = new Point(2, 4);
		assertEquals(2, p.getX());
		assertEquals(4, p.getY());
		
	}
	
	@Test
	public void setTests() {
		testpoint.setX(5);
		testpoint.setY(10);
		assertEquals(5, testpoint.getX());
		assertEquals(10, testpoint.getY());
	}
	
	@Test
	public void getTests() {
		testpoint.setX(50);
		testpoint.setY(30);
		assertEquals(50, testpoint.getX());
		assertEquals(30, testpoint.getY());
	}

}
