package arrays;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//		int[] reversedArray = reverseArray(myArray);
//		System.out.println(Arrays.toString(reversedArray));
		System.out.println(Arrays.toString(myArray));
		reverse(myArray);
		System.out.println(Arrays.toString(myArray));
	}
	
	
	//reverses the array by creating a new array
	public static int[] reverseArray(int[] array) {
		int[] newArray = new int[array.length];
		int arrayLength = array.length - 1;
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[arrayLength];
			arrayLength--;
		}
		return newArray;
	}
	//reverses the array without creating a new array
	public static void reverse(int[] array) {
		int temp;
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for(int i = 0; i < halfLength; i++) {
			temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
}
