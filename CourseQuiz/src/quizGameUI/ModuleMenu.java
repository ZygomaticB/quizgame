package quizGameUI;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//once a module is clicked, this screen appears 
public class ModuleMenu extends JPanel {
	
	JButton button; 
	
	//array to test building the layout. 
	String [] modules = {"Type 1", "Type 2", "Type 3"}; 
	
	public ModuleMenu(String moduleName){
		JLabel title = new JLabel(moduleName);
		this.add(title);
		//add buttons for each submodule option.
		for(int i = 0; i<modules.length; i++)
		{
			button = new JButton(modules[i]); 
			button.setMaximumSize(new Dimension(400,50));
			this.add(button); 
			System.out.println(modules[i]);
		}
	}
}
