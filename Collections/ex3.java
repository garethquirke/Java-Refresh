package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ex3 {

	public static void main(String[]args) {
		
		ArrayList<String> firstnames = new ArrayList<String>();
		ArrayList<String> lastnames = new ArrayList<String>();
		
		firstnames.add("Gareth");
		firstnames.add("Ben");
		firstnames.add("Carl");
		
		lastnames.add("Quirke");
		lastnames.add("Timposn");
		lastnames.add("Simspo");
		
		
		
		// add from the two collections into full names
		// seperate the strings by a space
		
		ArrayList<String> fullnames = new ArrayList<String>();
		fullnames = GenerateFullNames(firstnames,lastnames);
		
		for(String x: fullnames) {
			System.out.println(x);
		}
		
	}
	
	public static ArrayList<String> GenerateFullNames(ArrayList<String> firstnames, ArrayList<String> lastnames) {
		
		ArrayList<String> fullnames = new ArrayList<String>();		
		if(firstnames.size() == lastnames.size()) {	
			for(int i = 0; i < firstnames.size(); i++) {
				fullnames.add(firstnames.get(i) + " " + lastnames.get(i));
			}
		}
		return fullnames;
	}
}