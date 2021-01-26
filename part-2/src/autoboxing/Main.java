package autoboxing;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Integer> intArrayList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i ++) {
			
			intArrayList.add(Integer.valueOf(i));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(intArrayList.get(i).intValue());
		}
		
	}
	
	
	
}

