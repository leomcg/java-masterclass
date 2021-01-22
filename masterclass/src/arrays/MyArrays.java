package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MyArrays {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myArray = createArray(3);
		
		int[] mySortedArray = sortArray(myArray);
		
		int minValue = findMinValue(myArray);
		
		
		System.out.println("Sorted Array: " + Arrays.toString(mySortedArray));
		System.out.println("Smallest value: " + minValue);
		
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
	
	public static int findMinValue(int[] array) {
		int minValue = array[0];
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i+1] < array[i]) {
				minValue = array[i+1];
			}
		}
		return minValue;
	}
}
