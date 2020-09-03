package com.javadevelopment.collectionsapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ElimateDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		findDuplicates(scanner.nextLine());

	}

	private static void findDuplicates(String string) {
		String[] s = string.split(" ");
		Map<String, Integer> hashMap = new HashMap<>();
		for (String string2 : s) {
			if (hashMap.get(string2) != null) {
				//System.out.println("Called");
				hashMap.put(string2, hashMap.get(string2) + 1);
			} else {
				hashMap.put(string2, 1);
			}

		}

		//System.out.println(hashMap);
		
		Iterator<String> itr=hashMap.keySet().iterator();
		while(itr.hasNext()) {
			String s1=itr.next();
			if(hashMap.get(s1)>1) {
			System.out.println("The Word "+s1+" is"+ " Repeated "+hashMap.get(s1)+ " times");
			}
		}

	}

}
