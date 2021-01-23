package arrays;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] reversedArray = reverseArray(myArray);
		System.out.println(Arrays.toString(reversedArray));
	}
	
	public static int[] reverseArray(int[] array) {
		int[] newArray = new int[array.length];
		int arrayLength = array.length - 1;
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[arrayLength];
			arrayLength--;
		}
		return newArray;
	}
}
