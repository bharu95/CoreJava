package com.bhargav;

public class StringDemo {

	public static void main(String[] args) {
		String name = "bhargav depuru hhh jjj";
		char c='a';
		int letter=c;
		/*int index=name.indexOf(" ");
		int index1=name.lastIndexOf(" ");*/
		String[] index2=name.split(" ");
		/*System.out.println(letter);
		System.out.println(name.length());
		System.out.println(name.substring(0, index));
		System.out.println(name.substring(index+1, index1));
		//System.out.println(name.substring( index1+1));*/
		System.out.println(index2[index2.length - 2]);
		
		for(int i=0;i<index2.length;i++)
			System.out.println(index2[i]);
 	}

}
