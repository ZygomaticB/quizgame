package quiz.game.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Questions.NameQuestion;
import Questions.Question;

public class NameQuestionsUploader extends QuestionsUploader {

	public NameQuestionsUploader(String filename) throws JDOMException, IOException {
		super(filename);
	}
	
	public ArrayList<Question> loadQuestions() throws JDOMException, IOException {
		ArrayList<Question> returnList = new ArrayList<Question>();
		Element module = currentDocument.getRootElement();
		
		//lists the question types(first children in xml doc)
		List<Element> questionTypes = module.getChildren();
		for (Element qType : questionTypes) {
			if (qType.getName().equals("NameQuestions")) {
				List<Element> questions = qType.getChildren();
				for (Element item : questions) {
					String name = item.getChild("ItemName").getValue();
					returnList.add(new NameQuestion(name));
				}
			}
		}

		return returnList;
	}
}
