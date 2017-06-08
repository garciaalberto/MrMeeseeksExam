package org.foobarspam.ProxyPattern.MrMeeseks;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Doable{
	
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	
	private String[] messageOnRequest = new String[]{"Oooh yeah! Can dooo!", "Oh, yeah! Yes, ma'am!", "Yes, Siree!", "Ohhhh Okay"};
	private String messageOnDone = "All done!";
	private String messageOnExplode = "Pooooof ";
			
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	
	public int getId(){
		return this.id;
	}
	
	public void sayMessageOnCreate(){
		System.out.println("Hey, I'm Mr. Meeseeks " +  getId() + ". Look at meeeeee!");
	}
	
	public String doRequest(String action, String object) {
		String request = (action + " " + object);
		return request;
	}
	public void SayMessageOnRequest(){
		System.out.println(this.messageOnRequest[ThreadLocalRandom.current().nextInt(0, this.messageOnRequest.length)]);
	}

	public void SayMessageOnDone(){
		System.out.println(this.messageOnDone);
	}

	public void formulateRequest(String action, String object) {
		SayMessageOnRequest();
		System.out.println(doRequest(action, object));
		SayMessageOnDone();
	}

	public void doRequest(Object action, Object object) {
		// ???
		
	}

	public void stopExisting() {
		System.out.println(this.messageOnExplode + this.getId());	
	}

}
