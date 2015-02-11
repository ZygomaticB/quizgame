package quizGameTests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import quizGame.Image;
import quizGame.ImageItem;
import quizGame.QuizItem;

import org.junit.Test;

public class Imagetest {

	@Test
	public void constructorTest() {

	}
	
	@Test
	public void buildQuizListTest() throws IOException {
		Image test = new Image("testmodule");
		ArrayList<ImageItem> testitems = new ArrayList<ImageItem>();
		testitems.add(new ImageItem("ulna"));
		testitems.add(new ImageItem("radius"));
		testitems.add(new ImageItem("phalange"));

		assertTrue(testitems.equals(test.buildQuizList()));
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
	public void getNextItemTest() {
		Image test = new Image("testmodule");
		
	}

}
