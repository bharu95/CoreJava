package com.bhargav;

public class Assessment {

	public static void main(String[] args) {
		
		int number = 34567;
		int d;
		int r = 0;
		
		while(number>0) {
			
			d = number % 10;
	        r = r * 10 + d;
	        number = number / 10;
		}
		System.out.println(r);
	}

}
