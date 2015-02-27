package tests.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.jdom2.JDOMException;
import org.junit.Test;

import quiz.game.controller.NameQuestionsUploader;
import quiz.game.controller.QuestionsUploader;

public class QuestionsUploaderTests {

	@Test
	public void testGetQuestionTypes() throws JDOMException, IOException {
		QuestionsUploader testUploader = new QuestionsUploader("modules/anatomy/anatomy.xml");
		assertTrue(testUploader.getQuestionTypes() instanceof ArrayList);
		assertEquals(testUploader.getQuestionTypes().get(0), "Questions");
		assertEquals(testUploader.getQuestionTypes().get(1), "NameQuestions");
	}

}
