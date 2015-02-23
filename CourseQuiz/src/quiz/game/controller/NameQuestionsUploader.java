package quiz.game.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Questions.NameQuestion;

public class NameQuestionsUploader {

	public static ArrayList<NameQuestion> loadQuestions(String filename) throws JDOMException, IOException {
		ArrayList<NameQuestion> returnList = new ArrayList<NameQuestion>();
		SAXBuilder jdomBuilder = new SAXBuilder();
		Document jdomDocument = jdomBuilder.build(filename);
		Element module = jdomDocument.getRootElement();
		
		List<Element> Items = module.getChildren();
		for (Element item : Items) {
			String name = item.getChild("ItemName").getValue();
			returnList.add(new NameQuestion(name));
		}
		return returnList;
	}
	
}
