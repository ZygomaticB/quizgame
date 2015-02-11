package quizGameTests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import quizGame.Read;

public class Readtest {

	@Test
	public void get1stLinetest() throws FileNotFoundException {
		assertEquals(Read.getName("/home/master/java/git/CourseQuiz/testmodule/radius.qi"), "Radius");
	}

}
