package arrayList;

import java.util.Scanner;



public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static GroceryList list = new GroceryList();
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				list.printList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				System.out.println("Thank you for using our Grocery List app");
				quit = true;
				break;
			}
		}
	}
	
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\n0 - To print choice options ");
		System.out.println("\n1 - To print the list of grocery items ");
		System.out.println("\n2 - To add an item to the grocery list ");
		System.out.println("\n3 - To modify an item in the list ");
		System.out.println("\n4 - To remove an item from the list ");
		System.out.println("\n5 - To search for an item in the list ");
		System.out.println("\n6 - To quit the application ");
	}
	
	public static void addItem() {
		System.out.print("Please enter the grocery item: ");
		list.addGroceryItem(scanner.nextLine());
	}
	
	public static void modifyItem() { 
		System.out.print("Enter item number: ");
		int itemNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter new item: ");
		list.modifyGroceryItem(itemNumber - 1, scanner.nextLine());
	}
	
	public static void removeItem() {
		System.out.print("Enter item number: ");
		int itemNumber = scanner.nextInt();
		scanner.nextLine();
		list.removeGroceryItem(itemNumber - 1);
	}
	
	public static void searchForItem() {
		System.out.print("Enter item name: ");
		String itemName = scanner.nextLine();
		if(list.findItem(itemName) != null) {
			System.out.println("Found " + itemName + " in our list");
		} else {
			System.out.println("item not found");
		}
	}
	
	
	
}
