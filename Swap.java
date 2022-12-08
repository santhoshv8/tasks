package com.xworkz.programsapp;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		System.out.println("Enter The Values");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a=a+b; 
		b=a-b; 
		a=a-b;
		
		System.out.println(a+" "+b);
		sc.close();
	}
}
  