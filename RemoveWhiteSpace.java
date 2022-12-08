package com.xworkz.programsapp;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		System.out.println("Enter The Name");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 0 ;
		
		char c[] = str.toCharArray();
		
		for(int i=0 ; i<c.length;i++) {
			if(c[i] == ' ') {
				
				count+=1 ; 
				//continue;
			}else {
				System.out.print(c[i]); 
			}
			
		}
		System.out.println();  
		System.out.println("Number of white space = "+count);
		sc.close();
	}
}
