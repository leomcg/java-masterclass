package arrays;

import java.util.Scanner;

public class Arrays {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myArray = createArray(3);
		
		int[] mySortedArray = sortArray(myArray);
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(mySortedArray[i]);
		}
	}
	
	public static int[] createArray(int elements) {
		int[] array = new int[elements];
		System.out.println("Please enter " + elements + " integers:\r");
		for(int i = 0; i < elements; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	
	public static int[] sortArray(int[] array) {
		int[] sortedArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		int temp;
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 0; i < sortedArray.length - 1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}
}
