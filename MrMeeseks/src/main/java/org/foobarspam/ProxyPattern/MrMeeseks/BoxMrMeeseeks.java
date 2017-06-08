package org.foobarspam.ProxyPattern.MrMeeseks;

import java.util.ArrayList;

public class BoxMrMeeseeks {
	
	private MrMeeseeks meeseeks;
	
	public void pushButton(ArrayList<MrMeeseeks> listOfMeeseeks){
		createMrMeeseeks(listOfMeeseeks);
		getMrMe().sayMessageOnCreate();
	}
	
	public void createMrMeeseeks(ArrayList<MrMeeseeks> listOfMeeseeks){
		this.meeseeks = new MrMeeseeks();
		listOfMeeseeks.add(getMrMe());
	}
	
	public MrMeeseeks getMrMe(){
		return this.meeseeks;
	}
}
