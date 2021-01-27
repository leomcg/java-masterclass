package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Melbourne");
		addInOrder(placesToVisit, "Brisbane");
		addInOrder(placesToVisit, "Perth");
		addInOrder(placesToVisit, "Canberra");
		addInOrder(placesToVisit, "Adelaide");
		addInOrder(placesToVisit, "Darwin");
		
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Darwin");
		
		printList(placesToVisit);
		
	}
	
	public static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext()) {
			System.out.println("Now visiting " + i.next()); // next returns the current item and moves on to the next
		}
		System.out.println("==========================");
	}
	
	public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0) {
				//equal, do not add
				System.out.println(newCity + " is already included as a destination");
				return false;
			} else if (comparison > 0) {
				//new City should appear before this one
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0) {
				//move on to next city
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	
	
	


	
	
	
	
	
	
	
	
	
}