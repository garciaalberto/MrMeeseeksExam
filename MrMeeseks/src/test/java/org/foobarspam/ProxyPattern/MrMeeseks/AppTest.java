package org.foobarspam.ProxyPattern.MrMeeseks;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
   
	@Test
	public void testMeeseeksCreation(){
		MrMeeseeks meeseeks = new MrMeeseeks();
		assertEquals(meeseeks.getId(), 1001);
	}
	
}