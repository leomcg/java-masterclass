package arrayList;

import java.util.ArrayList;

public class Contact {
	private ArrayList<String> contactList = new ArrayList<String>();
	
	public void showContacts() {
		System.out.println("You have " + contactList.size() + " contacts in your phone.");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println((i+1) + ". " + contactList.get(i));
		}
	}
	
	public void addContact(String contact) {
		contactList.add(contact);
	}
	
	public void removeContact(String contact) {
		int contactIndex = contactList.indexOf(contact);
		if(contactIndex != -1) {
			contactList.remove(contactIndex);
			System.out.println(contact + " was removed from your list.");
		} else {
			System.out.println("Contact not found.");
		}
	}
	
	public void modifyContact(String contact, String newContact) {
		int contactIndex = contactList.indexOf(contact);
		if(contactIndex != -1) {
			contactList.set(contactIndex, newContact);	
		} else {
			System.out.println("Contact not found");
		}
	}
		
}
