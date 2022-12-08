package com.xworkz.programsapp;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int rev = 0 ;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num ;
		
		while(num>0) {
			
			int rem = num % 10 ;
			rev = rev*10+rem ;
			num = num/10;
		}
		
		if(temp == rev) {
			System.out.println("The number is a Palindrome");
		}else {
			System.out.println("The number is not a Palindrome");
		}
		sc.close();
	}
}
