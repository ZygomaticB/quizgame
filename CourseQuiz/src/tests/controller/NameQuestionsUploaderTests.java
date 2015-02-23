package tests.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.jdom2.JDOMException;
import org.junit.Test;

import quiz.game.controller.NameQuestionsUploader;

public class NameQuestionsUploaderTests {

	@Test
	public void test() throws JDOMException, IOException {
		assertTrue(NameQuestionsUploader.loadQuestions("testmodule/testmodule.xml") instanceof ArrayList);
		assertEquals(NameQuestionsUploader.loadQuestions("testmodule/testmodule.xml").get(0).getAnswer(), "Radius");
		assertEquals(NameQuestionsUploader.loadQuestions("testmodule/testmodule.xml").get(1).getAnswer(), "Ulna");
		
	}

}
