package collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		if(languages.containsKey("Java")) {
			System.out.println("Java is already in the map");
		} else {
			languages.put("Java", "Java is a class-based, object-oriented programming language.");
			System.out.println("Java added to the map");
		}
		languages.put("Python", "Python is an interpreted, high-level and general-purpose programming language.");
		languages.put("COBOL", "COBOL is a compiled English-like computer programming language designed for business use.");
		languages.put("C#", "C# is a general-purpose, multi-paradigm programming language");
		
		if(languages.containsKey("Java")) {
			System.out.println("Java is already in the map");
		} else {
			languages.put("Java", "Java is a class-based, object-oriented programming language.");
			System.out.println("Java added to the map");
		}
		
		System.out.println(languages.get("Java"));
		
		
		for(String key : languages.keySet()) {
			System.out.println(key + " : " + languages.get(key)); 
		}
		
	}
	
	
}
