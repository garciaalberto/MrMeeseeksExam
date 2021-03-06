package org.foobarspam.ProxyPattern.MrMeeseks;

import java.util.ArrayList;

public class App {
	
	public static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrMe){
		if (setMrMe.isEmpty()){
			System.out.println("There are no Meeseeks avaiable now, consider pressing the button if you need one");
		}
		for (MrMeeseeks meeseeks : setMrMe){
			System.out.print(meeseeks.getId() + "\n");
		}
	}
	
	public static void collectIds(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids){
		for (MrMeeseeks meeseeks : setMrMe){
			ids.add(meeseeks.getId());
		}
	}
	
	public static void explodeMrMeeseeks(ArrayList<MrMeeseeks> setMrMe, int id){
		ArrayList<MrMeeseeks> toRemove = new ArrayList<MrMeeseeks>();
		for (MrMeeseeks meeseeks : setMrMe){
			if (id == meeseeks.getId()){
				meeseeks.stopExisting();
				toRemove.add(meeseeks);
			}
		}
		setMrMe.removeAll(toRemove);	
	}
	
	public static void main( String[] args ){
        
		ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
		ArrayList<Integer> ids = new ArrayList<Integer>();
		        
		BoxMrMeeseeks box = new BoxMrMeeseeks();
		       
		box.pushButton(setMrMe);
		System.out.println("Open Jerry's stupid mayonnaise jar");
		box.getMrMe().formulateRequest("Open", "stupid jar");
		System.out.println();
		
		box.pushButton(setMrMe);    
		System.out.println("I wanna be popular at school!");
		box.getMrMe().formulateRequest("Be", "popular at school");
		System.out.println();
		
		box.pushButton(setMrMe);
		System.out.println("I wanna be a more complete woman!");
		box.getMrMe().formulateRequest("Be", "a more complete woman");
		System.out.println();
		
		System.out.println("Estos son los Mr Meeseeks creados:");
		listMrMeeseeks(setMrMe);
		System.out.println();
		
		collectIds(setMrMe, ids);
		
		System.out.println("Adios, Mr Meeseeks...");
		for(Integer id : ids){
			explodeMrMeeseeks(setMrMe, id);   
		}
		System.out.println();
		
		// Esto es un Test sin JUnit para comprobar que la lista está vacía después de haber borrado todos los Meeseeks
		System.out.println("Lista de Meeseeks:");
		listMrMeeseeks(setMrMe);
		System.out.println();
		
		// Esto no es un test
		System.out.println();
		System.out.println("        ___          ");
		System.out.println("    . -^   `--,      ");
		System.out.println("   /# =========`-_   ");
		System.out.println("  /# (--====___====\\ ");
		System.out.println(" /#   .- --.  . --.| ");
		System.out.println("/##   |  * ) (   * ),");
		System.out.println("|##   \\    /\\ \\   / |");
		System.out.println("|###   ---   \\ ---  |");
		System.out.println("|####      ___)    #|");
		System.out.println("|######           ##|");
		System.out.println(" \\##### ---------- / ");
		System.out.println("  \\####           (  ");
		System.out.println("   `\\###          |  ");
		System.out.println("     \\###         |  ");
		System.out.println("      \\##        |   ");
		System.out.println("       \\###.    .)   ");
		System.out.println("        `======/   ");
		System.out.println();
		System.out.println("  |PASS ME THIS EXAM|");
		
	}
}