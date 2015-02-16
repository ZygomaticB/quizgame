package quizGameUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuizQuestionUI extends JPanel {
	public QuizQuestionUI (String name){
		JLabel title = new JLabel(name); 
		this.add(title); 
	}
}
