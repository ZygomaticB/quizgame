package quizGameUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Questions.NameQuestion;

public class QuizQuestionUI extends JPanel {
	private NameQuestion currentQuestion = new NameQuestion("name");
	JTextField answerbox;
	
	public QuizQuestionUI (String name){
		JLabel title = new JLabel(name); 
		this.add(title);
		
		//adds the image, imageicon isn't the best way to do this as it can't do image resizing
		//set a value for testing but would get the particular value from the current question
		ImageIcon icon = new ImageIcon("modules/anatomy/ulna.jpg");
		JLabel image = new JLabel(icon);
		this.add(image);
		
		//should probably be a formatted field, and needs some kind of action listener to send the answer
		//to the submitAnswer method
		JFormattedTextField ansbox = new JFormattedTextField(20);
		JTextField answerbox = new JTextField(20);
		answerbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				answerQuestion();
			}
		});
		this.add(answerbox);
	}
	private void answerQuestion() {
		if (currentQuestion.submitAnswer(answerbox.getText())) {
			answerbox.setText("Correct");
		}
	}
}
