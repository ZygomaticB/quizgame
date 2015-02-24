package quizGameUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import quiz.game.controller.ModuleSelectionActionListener;
import quizGame.Image;
import quizGame.ListModule;
import quizGame.QuizGameModel;

public class Game extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private Image image;
	private JButton button; 
	private JPanel mainMenu; 
	private ModuleMenu moduleMenu; 
	private QuizGameModel model;
	private JPanel contentPanel; 
	private JButton mainMenuButton; 
	private QuizQuestionUI quiz; 
	
	//array to test building the layout. 
	String [] modules = {"Bio", "Chem", "Math"}; 
	
	private final String MAIN_MENU = "Main Menu"; 
	private final String MODULE_OPTIONS = "Module Options"; 
	private final String QUIZ_QUESTIONS = "Quiz Questions"; 
	
	public Game(String moduleName, QuizGameModel model) throws IOException {
		
		//set the frame to have the quizGameModel
		this.model = model; 
		//image = new Image(moduleName);
		this.setLayout(new GridLayout(1, 2));
		this.setSize(WIDTH,HEIGHT);
		this.setTitle("Game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPanel = new JPanel(new CardLayout());
		contentPanel.setBackground(Color.WHITE);

		mainMenu = new JPanel(); 
		mainMenu.setLayout(new BoxLayout(mainMenu, BoxLayout.Y_AXIS));
		moduleMenu = new ModuleMenu("Testing", model, this); 
		moduleMenu.setLayout(new BoxLayout(moduleMenu, BoxLayout.Y_AXIS));
		
		moduleViewBuilder(mainMenu);
		controlViewBuilder(moduleMenu);
		
		quiz = new QuizQuestionUI("QUIZ!"); 
		
		contentPanel.add(mainMenu, model.MAIN_MENU);
		contentPanel.add(moduleMenu, model.MODULE_OPTIONS);
		contentPanel.add(quiz, QUIZ_QUESTIONS);
		
		ImageIcon icon = new ImageIcon("Test");
		JLabel label = new JLabel();
		label.setIcon(icon);
		//panel.add(label);
		this.add(contentPanel);
		//this.add(label); 
		
		mainMenuButton = new JButton("Return To Main Menu"); 
		mainMenuButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) contentPanel.getLayout(); 
				layout.show(contentPanel, MAIN_MENU);
			}
		});
		
		this.add(mainMenuButton); 
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screenSize.width/2 - this.getWidth()/2;
		int y = screenSize.height/2 - this.getHeight()/2;
		this.setLocation(x,y);
		
		this.setVisible(true);
	}
	
	private void controlViewBuilder(JPanel controlViewer){
		controlViewer = new JPanel(); 
		controlViewer.setLayout(new BoxLayout(controlViewer, BoxLayout.Y_AXIS));
	}
	
	//builds the module viewer frame to contain all the modules 
	private void moduleViewBuilder(JPanel moduleView){

		JLabel title = new JLabel("Availible Modules For Testing");
		mainMenu.add(title);
		//get the modules to get the names to display. 
		ArrayList<String> modules = this.model.getModules(); 
		Iterator<String> moduleIt = modules.iterator(); 
		//iterate through the modules to grab and generate titles. 
		while(moduleIt.hasNext()){
			String module = moduleIt.next(); 
			button = new JButton(module); 
			button.setMaximumSize(new Dimension(400,50));
			button.addActionListener(new ModuleSelectionActionListener(model, this));
			mainMenu.add(button); 
		}
	}
	
	public JPanel getContectPanel(){
		return contentPanel; 
	}
	
	public JPanel getCurrentView() {
		return mainMenu;
	}

	public void setCurrentView(JPanel currentView) {
		this.mainMenu = currentView;
	}
	
	public ModuleMenu getModuleMenu(){
		return this.moduleMenu; 
	}
	
	public static void main(String[] args) throws IOException {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				try {
					new Game("testmodule", new QuizGameModel());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void updateFrame() {
		;
		
	}
}
