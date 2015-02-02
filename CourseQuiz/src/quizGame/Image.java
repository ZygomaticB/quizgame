package quizGame;

import java.util.ArrayList;

public class Image {
	
	private String filename;
	private String textfilename;
	private String imagename;
	private ArrayList<QuizItem> quizitems;
	private int currentItem;
	
	// Requires: filename exists in the directorytree in the right place
	// Modifes: textfile, imagename, quizitems, currentitem
	// Effects: construct imageobject for a given filename
	public Image(String filename) {
		this.filename = filename;
		this.textfilename = filename + ".qi";
		this.imagename = filename + ".jpg";
		this.currentItem = 0;
		this.quizitems = buildQuizList(textfilename);
		// TODO figure out how to parse a textfile to create quizitems
				
	}
	
	// Requires: filename.qi file exists
	// Modifes: quizitems
	// Effects: build a list of quiz items from the given text file by parsing each line
	//          separate at semicolons
	public ArrayList<QuizItem> buildQuizList(String textfile) {
		return null;
	}
	
	// Effects: return the filename of the image
	public String getFileName() {
		return this.filename;
	}
	
	// Modifies: this
	// Effects: set the filename to be newName
	public void setFileName(String newName){
		this.filename = newName;
	}
	
	//Effects: return the imagename
	public String getImageName() {
		return imagename;
	}
	
	//Effects: return the textfilename
	public String getQIName() {
		return textfilename;
	}
	
	public int getCurrentItemNumber() {
		return currentItem;
	}
	
	// Requires: quizitems is not empty
	// Modifies: currentItem
	// Effects: gets the next quiz item in the list, adds 1 to currentItem
	public QuizItem getNextQuizItem() {
		return null;
	}
	
	// Requires: quizitems is not empty
	// Modifies: currentItem
	// Effects: returns the previous quiz item, if currentItem is 1st in list, return the last item
	//          reduces currentitem by 1 if currentitem > 0
	public QuizItem getPreviousQuizItem() {
		return null;
	}
	
	// Requires: quizitems is >1 long
	// Modifies: currentitem
	// Effects: return a random QuizItem, set currentitem to index of the returned quizitem
	public QuizItem getRandomQuizItem() {
		return null;
	}
	
	
}
