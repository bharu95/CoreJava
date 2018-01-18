package com.bhargav;

public class OddPalindrome {
	
	public static boolean checkAllDigitsOdd(int num) {
		
		int digit;
		int count = 0;
		
		while(num > 0) {
			digit = num % 10;
			if(digit % 2 == 0)
				count++;
				num = num / 10;
	}
		if(count==0)
			return true;
		else
			return false;
	}
	
	public static int reverse(int num) {
		int digit;
		int rev = 0;
		
		while(num > 0) {
			digit = num % 10;
			rev   = rev * 10 + digit;
			num   = num / 10;
		}
		return rev;
		
	}
	
	public static boolean checkPalindrome(int num,int rev) {
			if(num == rev) 
				return true;
			else
				return false;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1551;
		int reverse1;
		if(checkAllDigitsOdd(num) == true) {
			reverse1 = reverse(num);
			if(checkPalindrome(num,reverse1))
				System.out.println(num+" is odd palindrome");
			else
				System.out.println(num+" is not odd palindrome");
		}
		else
			System.out.println(num+" is not odd palindrome");
	}

}
