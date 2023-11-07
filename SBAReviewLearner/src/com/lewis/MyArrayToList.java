package com.lewis;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayToList implements MyArrayList {
	
	private String artist;
	
	
	
	public ArrayList<String> arrayToList; 
	
	public MyArrayToList() {
		this.arrayToList = new ArrayList<String>();
	}
                                             
	@Override
	public void conversion(String[] a) {
		for(int i=0; i< a.length; i++) {
			arrayToList.add(a[i]);
			System.out.println("I have added the string: " + a[i] + " at the index: " + i);
		}
	}

	@Override
	public void replacement(int idx) {
		String stringToReplace = arrayToList.get(idx);
		arrayToList.set(idx, "");
		System.out.println("I have replaced the string: "+ stringToReplace + " with a null string" );
	}

	@Override
	public ArrayList<String> remove() {
		arrayToList.removeAll(Arrays.asList("",null));
		return arrayToList;
	}

	@Override
	public String toString() {
		return "MyArrayToList [arrayToList=" + arrayToList + "]";
	}

	
}
