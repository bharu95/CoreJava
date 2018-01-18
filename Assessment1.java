package com.bhargav;

public class Assessment1 {

	public static void main(String[] args) {
		int num = 6;
		int s = 0;
		
		for(int i=1;i<num;i++) {
			if(num % i==0) {
				s=s+1;
			}
			
		}
	
		if(s==num) 
			System.out.println("Perfect");
		else
			System.out.println("Not Perfect");
		
	}

}
