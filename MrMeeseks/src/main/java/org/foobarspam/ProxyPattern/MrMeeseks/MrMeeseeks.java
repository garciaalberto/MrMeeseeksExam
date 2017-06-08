package org.foobarspam.ProxyPattern.MrMeeseks;

import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Doable{
	
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
			
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	
	public int getId(){
		return this.id;
	}
	
	public void doRequest(String action, String object) {
		
		
	}

}
