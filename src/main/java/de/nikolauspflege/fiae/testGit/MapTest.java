package de.nikolauspflege.fiae.testGit;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public MapTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<Integer, String> verein1 = new HashMap<Integer, String>();
		verein1.put(1, "hugo boss");
		verein1.put(2, "Adelbert Schleier");
		
		
	System.out.println("Der Spieler Name ist: " + verein1.get(1));
     verein1.get(1);
	}

}
