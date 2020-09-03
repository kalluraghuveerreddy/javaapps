package com.javadevelopment.collectionsapi;

import java.util.ArrayList;
import java.util.Collections;

import myutility.MyUtilities;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>();
		list.add("Raghu");
		list.add("Kajol");
		list.add("Samantha");
		list.add("Mahesh");
		list.add("Ranveer");
		
		MyUtilities.sortingList(list);
		
		Collections.sort(list);
		
		System.out.println("-----After Sorting --------");
		
		MyUtilities.sortingList(list);
		
		
	}

	

}
