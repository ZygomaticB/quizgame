package quizGameTests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import quizGame.ImageItem;
import quizGame.QuizItem;

public class ImageItemTest {

	@Test
	public void constructorTest() throws IOException {
		ImageItem testItem = new ImageItem("");
		assertTrue(testItem instanceof ImageItem);
		ImageItem testItem2 = new ImageItem("Ulna", 20, 30);
		assertTrue(testItem2 instanceof ImageItem);
		
		//path constructor test
		QuizItem ulna = new QuizItem("Ulna");
		//Really need to figure out how to make the path relative...
		Path testPath = Paths.get("/home/master/java/git/CourseQuiz/testmodule/ulna.qi");
		ImageItem testItem3 = new ImageItem(testPath);
		assertTrue(testItem3 instanceof ImageItem);
		assertEquals(testItem3.getQuizItem().getName(), ulna.getName());
	}
	
	@Test
	public void getQuizItemTest() {
		ImageItem testItem = new ImageItem("Ulna", 20, 30);
		QuizItem ulna = new QuizItem("Ulna");
		assertEquals(testItem.getQuizItem().getName(), ulna.getName());
	}
	
	@Test
	public void setQuizItemTest() {
		QuizItem mandible = new QuizItem("Mandible");
		ImageItem testItem = new ImageItem("name");
		testItem.setQuizItem(mandible);
		assertEquals(testItem.getQuizItem(), mandible);
	}

}
