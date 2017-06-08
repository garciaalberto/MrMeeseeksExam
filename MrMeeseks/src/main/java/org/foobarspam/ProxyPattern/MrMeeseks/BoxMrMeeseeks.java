package org.foobarspam.ProxyPattern.MrMeeseks;

import java.util.ArrayList;

public class BoxMrMeeseeks {
	
	private MrMeeseeks meeseeks;
	
	public void pushButton(ArrayList<MrMeeseeks> listOfMeeseeks){
		createMrMeeseeks(listOfMeeseeks);
	}
	
	public void createMrMeeseeks(ArrayList<MrMeeseeks> listOfMeeseeks){
		this.meeseeks = new MrMeeseeks();
		listOfMeeseeks.add(getMrMe());
		getMrMe().sayMessageOnCreate();
	}
	
	public MrMeeseeks getMrMe(){
		return this.meeseeks;
	}
}
