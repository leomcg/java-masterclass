package arrayList;

import java.util.Scanner;

public class MobilePhone {
	public static Scanner scanner = new Scanner(System.in);
	
	public static Contact contactList = new Contact();
	
	
	public static void main(String[] args) {
		int choice = 0;
		boolean flag = true;
		while(flag) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				showOptions();
				break;
			case 1:
				showContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				modifyContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				flag = false;
				System.out.println("Thank for using our app.");
			}
		}
	}
		
	public static void showOptions() {
		System.out.println("\nPress ");
		System.out.println("\n0 - To print choice options ");
		System.out.println("\n1 - To print the list of contacts ");
		System.out.println("\n2 - To add a contact to your list ");
		System.out.println("\n3 - To modify a contact from your list ");
		System.out.println("\n4 - To remove a contact from yout list ");
		System.out.println("\n5 - To quit the application ");
	}
	
	public static void showContacts() {
		contactList.showContacts();
	}
	
	public static void addContact() {
		System.out.print("Please enter contact name: ");
		contactList.addContact(scanner.nextLine());
	}
	
	public static void modifyContact() {
		System.out.print("Please enter the name of the contact you would like to replace: ");
		String oldContact = scanner.nextLine();
		System.out.print("Please enter the name of the new contact: ");
		String newContact = scanner.nextLine();
		contactList.modifyContact(oldContact, newContact);
		
	}
	
	public static void removeContact() {
		System.out.print("Please enter the name of the contact you would like to remove: ");
		String contact = scanner.nextLine();
		contactList.removeContact(contact);
		System.out.println("contact " + contact + " was removed.");
	}
	
}
