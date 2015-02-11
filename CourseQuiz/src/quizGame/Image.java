package quizGame;

import java.util.ArrayList;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.*;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Image {
	
	private String moduleName;
	private String textfilename;
	private String imagename;
	private ArrayList<ImageItem> imageItems;
	private int currentItem;
	
	// Requires: filename exists in the directorytree in the right place
	// Modifes: textfile, imagename, quizitems, currentitem
	// Effects: construct imageobject for a given filename
	public Image(String module) {
		this.moduleName = module;
		this.currentItem = 0;
		this.imageItems = new ArrayList<ImageItem>();
	}
	
	// Requires: filename.qi file exists
	// Modifes: quizitems
	// Effects: build a list of quiz items from the given text file by parsing each line
	//          separate at semicolons
	public ArrayList<ImageItem> buildQuizList() throws IOException {
		Path currentModule = getModuleDir();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentModule)) {
		    for (Path file: stream) {
		    	Path filename= currentModule.resolve(file);
		    	imageItems.add(new ImageItem(filename));
		    }
		} catch (IOException | DirectoryIteratorException x) {
		    // IOException can never be thrown by the iteration.
		    // In this snippet, it can only be thrown by newDirectoryStream.
		    System.err.println(x);
		}
		return imageItems;
	}
	
	public QuizItem buildQuizItem(String filename) throws FileNotFoundException, IOException {
		Path currentModule = getModuleDir();

	}
	
	public Path getModuleDir() throws IOException {
		String modulePath = "./" + moduleName;
		Path moduleDir = Paths.get(modulePath);
		return moduleDir.toRealPath();
	}
	
	// Effects: return the filename of the image
	public String getModuleName() {
		return moduleName;
	}
	
	// Modifies: this
	// Effects: set the filename to be newName
	public void setFileName(String newName){
		filename = newName;
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
