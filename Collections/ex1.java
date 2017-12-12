package Collections;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		
		
		// array of strings into an arraylist of strings
		String[] items = {"hi","my","name","is","a", "jeff"};
		List<String> list1 = new ArrayList<String>();
		
		String[]items2 = {"im", "negan", "name"};
		List<String>list2 = new ArrayList<String>();
		
		
		// add items to list1 and list 2
		for(String x:items) {
			list1.add(x);
		}
		
		for(String x:items2) {
			list2.add(x);
		}
		
		// output both lists
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("");
		
		for(int i = 0; i <list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		
		// remove matching items from list 2 and list 1
		editList(list1,list2);
		System.out.println("");
		
		
	    // output the result
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
	}
	
	
	public static void editList(Collection<String> list, Collection<String> otherlist) {
		// goes through list item by item
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(otherlist.contains(it.next())) {
				it.remove();
			}
		}
		
		
	}
}
