package arrayList;

import java.util.ArrayList;


public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printList() {
		System.out.println("You have " + groceryList.size() + " items in your list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println(i+1 + ". " + groceryList.get(i));
			
		}
	}
	
	public void modifyGroceryItem(int index, String newItem) {
		String previousItem = groceryList.get(index);
		groceryList.set(index, newItem);
		System.out.println("Grocery item " + (index + 1) + " was modified from " +
				previousItem + " to " + newItem 
				);
	}
	
	public void removeGroceryItem(int index) {
		String removedItem = groceryList.get(index);
		groceryList.remove(index);
		System.out.println(removedItem + " was removed from grocery list");
	}
	
	public String findItem(String item) {
		int position = groceryList.indexOf(item);
		if(position >= 0) {
			return groceryList.get(position);	
		}
		
		return null;
	}
	
	public void removeItemByName(String item) {
		int position = groceryList.indexOf(item);
		if(position == -1) {
			System.out.println(item + " is not in the list");
			return;
		}
		groceryList.remove(position);
		System.out.println(item + " was removed from grocery list");
				
	}
}
