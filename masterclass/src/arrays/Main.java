package arrays;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] myIntegers = getIntegers(5);
		for(int i = 0; i < myIntegers.length; i++) {
			System.out.println("Index " + i + " value is " + myIntegers[i]);
		}
		
		double average = getAverage(myIntegers);
		System.out.println("and the average is " + average);
	}
	
	public static int[] getIntegers(int numberOfElements) {
		System.out.println("Enter " + numberOfElements + " integer numbers.\r");
		
		int[] values = new int[numberOfElements];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int [] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
}
