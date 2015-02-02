package quizGameTests;

import static org.junit.Assert.*;
import quizGame.Image;

import org.junit.Test;

public class Imagetest {

	@Test
	public void constructorTest() {
		Image test = new Image("test");
		assertTrue(test.getFileName().equals("test"));
		assertTrue(test.getImageName().equals("test.jpg"));
		assertTrue(test.getQIName().equals("test.qi"));
		assertTrue(test.getCurrentItemNumber() == 0);
	}

}
