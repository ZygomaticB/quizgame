package quizGameTests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import quizGame.Quiz;
import quizGame.ImageItem;
import org.junit.Test;

public class Quiztest {

	@Test
	public void constructorTest() throws IOException {
		Quiz test = new Quiz("testmodule");
		//assertEquals(test.getNextQuizItem().getName(), "ulna");
	}
	
	@Test
	public void getNextItemTest() throws IOException {
		Quiz test = new Quiz("testmodule");
		//assertEquals(test.getNextQuizItem().getName(), "ulna");
		//assertEquals(test.getNextQuizItem().getName(), "Radius");
		//assertEquals(test.getNextQuizItem().getName(), "phalange");
		
	}
	
	@Test
	public void getPreviousItemTest() throws IOException {
		Quiz test = new Quiz("testmodule");
//		assertEquals(test.getPreviousQuizItem().getName(), "phalange");
//		assertEquals(test.getPreviousQuizItem().getName(), "Radius");
//		assertEquals(test.getPreviousQuizItem().getName(), "ulna");
	}

}
