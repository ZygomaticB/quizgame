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

public class QuestionsUploader {
	protected Document currentDocument;
	
	public QuestionsUploader(String filename) throws JDOMException, IOException {
		buildDocument(filename);
	}
	
	private void buildDocument(String filename) throws JDOMException, IOException {
		SAXBuilder jdomBuilder = new SAXBuilder();
		currentDocument = jdomBuilder.build(filename);
	}
	
	public ArrayList<Question> loadQuestions() throws JDOMException, IOException {
		ArrayList<Question> returnList = new ArrayList<Question>();
		Element module = currentDocument.getRootElement();
		
		//lists the question types(first children in xml doc)
		List<Element> questionTypes = module.getChildren();
		for (Element qType : questionTypes) {
			if (qType.getName().equals("Questions")) {
				List<Element> questions = qType.getChildren();
				for (Element item : questions) {
					String name = item.getChild("ItemName").getValue();
					returnList.add(new NameQuestion(name));
				}
			}
		}

		return returnList;
	}
	
	public ArrayList<String> getQuestionTypes() {
		ArrayList<String> returnList = new ArrayList<String>();
		List<Element> module = currentDocument.getRootElement().getChildren();
		for (Element questionType : module) {
			returnList.add(questionType.getName());
		}
		return returnList;
	}

}