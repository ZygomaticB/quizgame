package quizGameUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import quizGame.QuizItem;


/*
 * A simple photo viewer that always displays the same photo each time it is run.
 */
public class PhotoViewer extends JFrame
{
	private static final long serialVersionUID = 2116436198852146401L;
	private static final String IMAGE_FILE = "butterfly.jpg";
	private static final String TITLE = "PhotoViewer";
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	private QuizItem testitem = new QuizItem();
	
	
	/*
	 * Constructor
	 * Modifies: this
	 * Effects:  initializes application's main window and displays photo
	 */
	public PhotoViewer()
	{
		testitem.setImage("test.jpg");
		this.setSize(WIDTH,HEIGHT);
		this.setTitle(TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		ImageIcon icon = new ImageIcon(testitem.getImage());
		JLabel label = new JLabel();
		label.setIcon(icon);
		panel.add(label);
		this.add(panel);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screenSize.width/2 - this.getWidth()/2;
		int y = screenSize.height/2 - this.getHeight()/2;
		this.setLocation(x,y);
		
		this.setVisible(true);
	}
	
	/*
	 * Instantiates photo viewer.
	 */
	public static void main (String[] args) 
	{
		new PhotoViewer();
	} 
} 
