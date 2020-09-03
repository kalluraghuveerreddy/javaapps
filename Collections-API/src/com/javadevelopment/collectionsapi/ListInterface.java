package com.javadevelopment.collectionsapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> object = new ArrayList<>();

		object.add(12);
		object.add(13);
		object.add(null);
		object.add(12);
		object.add(null);
		object.add(null);
		object.add(13);
		

		object.set(0, 22);
		
		/*Iterator< Integer> iterator=object.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		for (Integer integer : object) {
			System.out.println(integer);
		}
		//System.out.println(object);
	}
}
