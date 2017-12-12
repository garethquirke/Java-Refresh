package Collections;

import java.util.ArrayList;

public class ex2 {

	public static void main(String[] args) {
	
		ArrayList<Person> people = new ArrayList<Person>();
		
		
		Person p1 = new Person("Greg", 18);
		Person p2 = new Person("Amber", 21);
		Person p3 = new Person("Johno", 22);
		
		
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		printNames(people);
		
	}
	


// function to print name from a collection of ppl
	public static void printNames(ArrayList<Person> ppl) {
		for(Person x: ppl) {
			System.out.println(x.getName());
		}
	}

	
	
}