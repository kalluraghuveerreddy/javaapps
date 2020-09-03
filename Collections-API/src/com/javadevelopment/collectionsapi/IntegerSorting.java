package com.javadevelopment.collectionsapi;

import java.util.ArrayList;
import java.util.Collections;

import myutility.MyUtilities;

public class IntegerSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(1);
		list.add(3);
		list.add(56);

		MyUtilities.sortingList(list);

		Collections.sort(list);

		System.out.println("-----After Sorting --------");

		MyUtilities.sortingList(list);

	}

}
