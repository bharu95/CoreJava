package com.bhargav;

public class Odd_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12345;
        while (input > 0) {
            if (input % 2 == 0) {
                System.out.println(input % 10 + " is even");
            } else {
                System.out.println(input % 10 + " is odd");
            }
            input = input / 10;
        }
              
	}

}
