package com.javadevelopment.collectionsapi;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> object = new LinkedHashSet<>();
		object.add("e");
		object.add("a");
		object.add("e");
		object.add("b");
		object.add("f");
		object.add("g");

		for (String s : object) {
			System.out.println(s);
		}
	}

}
