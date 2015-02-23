package quiz.game.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import quizGame.QuizItem;

public class QuizItemUploader {

	public static QuizItem buildFromFile(String file) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		//this is going to be ugly!
		String itemName = null;
		DocumentBuilderFactory builderFactory =
				DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		
		Document document = builder.parse(
				new FileInputStream("/home/master/java/git/quizgame/CourseQuiz/testmodule/radius.xml"));
		
		Element rootElement = document.getDocumentElement();
		NodeList nodes = rootElement.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			NodeList subnodes = node.getChildNodes();
			for (int j = 0; j < subnodes.getLength(); j++) {
				itemName = node.getFirstChild().getNodeValue();
			}
		}
			
		return new QuizItem(itemName);
	}

}