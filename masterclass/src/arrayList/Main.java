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
			case 5:
				searchForItem();
			case 6:
				quit = true;
				break;
			}
		}
	}
}
