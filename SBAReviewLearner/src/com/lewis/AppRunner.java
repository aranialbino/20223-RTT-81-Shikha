package com.lewis;

public class AppRunner {
	
	public static void main(String [] args) {
/*	   
		Gymnastic obj = new Gymnastic();
		
		int [] a = {26, 32, 36, 33, 24, 31, 30, 35, 36, 21, 28};
		
		obj.calculateAvgAge(a);
		
		obj.retirePlayer(3);
		
		obj.playerTransfer(10000000,7);
*/     
		
		String [] a = {"abcd","1234"};  //basic array
        
		MyArrayToList obj = new MyArrayToList();
		obj.conversion(a);
		obj.replacement(1);
		System.out.println(obj.toString());
		obj.remove();
		System.out.println(obj.toString());
		
		
	}
}
