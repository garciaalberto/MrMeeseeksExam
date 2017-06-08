package org.foobarspam.ProxyPattern.MrMeeseks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testBoxMeeseeksCreation(){
		ArrayList<MrMeeseeks> listOfMeeseeks = new ArrayList<MrMeeseeks>();
		BoxMrMeeseeks box = new BoxMrMeeseeks();
		box.pushButton(listOfMeeseeks);
		assertEquals(listOfMeeseeks.get(0).getId(), 1001);
		// This prints the creation message of the Meeseeks
	}
	
	@Test
	public void testMeeseeksRequest(){
		MrMeeseeks meeseeks = new MrMeeseeks();
		assertEquals(meeseeks.doRequest("Open", "jar"), "Open jar");
	}
	
	@Test
	public void testGenerateMessageOnRequest(){
		MrMeeseeks meeseeks = new MrMeeseeks();
		System.out.println(meeseeks.generateMessageOnRequest());
	}
}