package interfacesAndAbstractClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Player link = new Player("Link", 100, 35);
		System.out.println(link);
		saveValues(link);
		
		link.setHitPoints(8);
		System.out.println(link);
		link.setWeapon("Master sword");
		saveValues(link);
		loadValues(link);
	}
	
	public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
	
	public static void saveValues(ISaveable valuesToSave) {
		for(int i = 0; i < valuesToSave.write().size(); i++) {
			System.out.println("Saving " + valuesToSave.write().get(i) + " to storage device");
		}
	}
	
	public static void loadValues(ISaveable valuesToLoad) {
		ArrayList<String> values = readValues();
		valuesToLoad.read(values);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
