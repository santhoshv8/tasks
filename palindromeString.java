package com.xworkz.programsapp;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		
		String reverse ="";
		System.out.println("Enter The String");
		Scanner sc = new Scanner(System.in);
		String reverseinput = sc.next();
		char [] resultarray = reverseinput.toCharArray();
		
		for (int i = resultarray.length-1 ; i >=0 ;i--) {
			
			reverse = reverse+resultarray[i];
		}
		if(reverse.equals(reverseinput)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		sc.close();
	}
}
