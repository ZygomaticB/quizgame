package quizGameUI;

import java.awt.*;

public class MainMenu extends Frame{
	static final int H_SIZE = 300;
	static final int V_SIZE = 200;
	
	public MainMenu() {
		super("Module Menu");
		
		pack();
		resize(H_SIZE, V_SIZE);
		show();
		setFont(new Font("TimesRoman", Font.PLAIN, 12));
		setBackground(Color.DARK_GRAY);
		setForeground(Color.WHITE);
		setLayout(new BorderLayout());
		Panel p = new Panel();
		p.add(new Button("Ok"));
		p.add(new Button("Cancel"));
		add("South", p);
		InitializeMenus();
	}
	
	private void InitializeMenus()
	{
		MenuBar mbar = new MenuBar();
		Menu m = new Menu("File");
		m.add(new MenuItem("New"));
		m.add(new MenuItem("Open"));
		m.add(new MenuItem("Save"));
		m.add(new MenuItem("Save As"));
		m.add(new MenuItem("Print"));
		m.addSeparator();
		m.add(new MenuItem("Quit"));		
		mbar.add(m);
			
		m = new Menu("Help");
		m.add(new MenuItem("Help!!!!"));
		m.addSeparator();
		m.add(new MenuItem("About..."));
		mbar.add(m);

		// Recent change
		setMenuBar(mbar);
	}
	
	public void paint(Graphics g)
	{
		// 24 pt red font used here
		g.setFont(new Font("TimesRoman", Font.BOLD, 24));
		g.setColor(Color.red);
		g.drawString(getTitle(), 30, 50);
	}
	
	public boolean handleEvent(Event evt) {
		switch(evt.id) {
		case Event.WINDOW_DESTROY:
		{
			System.exit(0);
			return true;
		}
		default:
			return false;
		}
	}
	
	public static void main(String[] args) {
		new MainMenu();
	}
}
