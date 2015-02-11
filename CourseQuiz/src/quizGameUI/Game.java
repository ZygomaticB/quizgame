package quizGameUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import quizGame.Image;

public class Game extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	Image image;
	
	public Game(String moduleName) throws IOException {
		image = new Image(moduleName);
		
		this.setSize(WIDTH,HEIGHT);
		this.setTitle("Game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		ImageIcon icon = new ImageIcon(image.getImageName());
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
	
	public static void main(String[] args) throws IOException {
		new Game("testmodule");
	}
}
