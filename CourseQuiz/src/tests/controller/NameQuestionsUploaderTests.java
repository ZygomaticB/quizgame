package tests.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.jdom2.JDOMException;
import org.junit.Test;

import quiz.game.controller.NameQuestionsUploader;
import quiz.game.controller.QuestionsUploader;

public class NameQuestionsUploaderTests {

	@Test
	public void test() throws JDOMException, IOException {
		QuestionsUploader testxml = new NameQuestionsUploader("modules/anatomy/anatomy.xml");
		QuestionsUploader testxml2 = new NameQuestionsUploader("modules/biology/animals.xml");
		assertTrue(testxml.loadQuestions() instanceof ArrayList);
		assertEquals(testxml.loadQuestions().get(0).getAnswer(), "Radius");
		assertEquals(testxml.loadQuestions().get(1).getAnswer(), "Ulna");
		assertEquals(testxml2.loadQuestions().get(0).getAnswer(), "Bear");
	}

}
