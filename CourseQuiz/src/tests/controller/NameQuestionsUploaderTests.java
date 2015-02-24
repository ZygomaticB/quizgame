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
		assertTrue(NameQuestionsUploader.loadQuestions("modules/anatomy/anatomy.xml") instanceof ArrayList);
		assertEquals(NameQuestionsUploader.loadQuestions("modules/anatomy/anatomy.xml").get(0).getAnswer(), "Radius");
		assertEquals(NameQuestionsUploader.loadQuestions("modules/anatomy/anatomy.xml").get(1).getAnswer(), "Ulna");
		assertEquals(NameQuestionsUploader.loadQuestions("modules/biology/animals.xml").get(0).getAnswer(), "Bear");
	}

}
