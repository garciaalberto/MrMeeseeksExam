package org.foobarspam.ProxyPattern.MrMeeseks;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testMeeseeksCreation(){
		MrMeeseeks meeseeks = new MrMeeseeks();
		assertEquals(meeseeks.getId(), 1001);
	}
	
	@Test
	public void testMeeseeksRequest(){
		MrMeeseeks meeseeks = new MrMeeseeks();
		assertEquals(meeseeks.doRequest("Open", "jar"), "Open jar");
	}
}