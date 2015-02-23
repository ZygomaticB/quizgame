package tests.controller;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

import quiz.game.controller.QuizItemUploader;
import quizGame.QuizItem;

public class QuizItemBuilderTests {

	@Test
	public void test() throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
		//assertEquals("Radius", QuizItemUploader.buildFromFile(""));
		assertTrue(QuizItemUploader.buildFromFile("testmodule/radius.xml") instanceof QuizItem);
	}

}
