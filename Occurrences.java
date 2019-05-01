import java.util.*;
import java.io.*;


/**
 * Program occurrences will take an array of characters and count the occurrences.
 * Problem: No way to keep track how many times char c occurs
 * Solution: Use a HashSet with a character as the key, and an integer as the value. 
 *  -Add the array chars.
 *  -Check if the map contains the character(key), if it does, increment the value, otherwise
 *    set the value to one for that character(key)
 * @author Mark
 *
 */
public class Occurrences {

	public static void main(String[] args) {

		Character[] arr = {'a','b', 'b', 'e','e','g','a','t'};
		Map<Character, Integer> map = new HashMap<>();
		countOccurences(arr, map);
		
		System.out.println("Printing values via map operations:");
		//Option one of printing with for each
		for(Character c: map.keySet()) {
			System.out.print("Key: " + c.toString() + ": Value: " + map.get(c) +"\n");
		}
		System.out.println("Print values via entries:");
		//Option two of printing with for each using the Map.Entry interface
		//Returns a Set of entries, each is a object that is a Map.Entry object.
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println("Key: " +entry.getKey() +": Value: " + entry.getValue());
		}
		
		System.out.println("Sneaky lambda way to print:");
		//Sneaky lambda way to print
		map.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " +v));
		
		//Note: There are many other ways to print values too!
	}


	public static void countOccurences(Character[] arr, Map<Character, Integer> map) {


		// 'a','b', 'b', 'e','e','g','a','t'
		for(int i =0; i < arr.length; i++) 
			if(map.containsKey(arr[i])) 
				
				map.put(arr[i], map.get(arr[i]) + 1);
			
			else map.put(arr[i], 1);

//----------If you were trying to use the iterator and the map's entry set, don't.
//----------The entry set will be empty and not work until there is at least one entry
			//			
			//					for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			//			

		}
	


}
