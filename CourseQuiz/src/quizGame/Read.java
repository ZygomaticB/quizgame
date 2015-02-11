package quizGame;

import java.io.*;
import java.util.regex.*;

public class Read {
	
	public static String firstLine(String filename) throws FileNotFoundException {
		BufferedReader bf = new BufferedReader(new FileReader(filename));
		String line = "";
		for (int i=0; i < 1; i++)
			try {
				line = bf.readLine();
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return line;

	}

}
