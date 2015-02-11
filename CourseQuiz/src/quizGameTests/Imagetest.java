package quizGameTests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import quizGame.Image;
import quizGame.ImageItem;
import org.junit.Test;

public class Imagetest {

	@Test
	public void constructorTest() {

	}
	
	@Test
	public void buildImageItemListTest() throws IOException {
		Image test = new Image("testmodule");
		test.buildImageItemList();
		ArrayList<ImageItem> testitems = new ArrayList<ImageItem>();
		testitems.add(new ImageItem("ulna"));
		testitems.add(new ImageItem("radius"));
		testitems.add(new ImageItem("phalange"));
		assertEquals(test.getNextQuizItem().getQuizItem().getName(), "ulna");
	}
	
	@Test
	public void getModuleDirTest() throws IOException {
		Image test = new Image("testmodule");
		Path testPath = Paths.get("./testmodule");
		testPath = testPath.toRealPath();
		assertTrue("testmodule".equals(test.getModuleName()));
		assertTrue(testPath.equals(test.getModuleDir()));
	}
	
	@Test
	public void getNextItemTest() throws IOException {
		Image test = new Image("testmodule");
		assertEquals(test.getNextQuizItem().getQuizItem().getName(), "ulna");
		assertEquals(test.getNextQuizItem().getQuizItem().getName(), "Radius");
		assertEquals(test.getNextQuizItem().getQuizItem().getName(), "phalange");
		
	}
	
	@Test
	public void getPreviousItemTest() throws IOException {
		Image test = new Image("testmodule");
		assertEquals(test.getPreviousQuizItem().getQuizItem().getName(), "phalange");
		assertEquals(test.getPreviousQuizItem().getQuizItem().getName(), "Radius");
		assertEquals(test.getPreviousQuizItem().getQuizItem().getName(), "ulna");
	}

}
