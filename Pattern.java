package com.xworkz.programsapp;

public class Pattern {

	public static void main(String[] args) {
		
		for(int row=1; row<=5 ;row++) {
			
			for(int col=1; col<=5 ; col++) {
				if(row==3 && col==2) { 
					System.out.print("X-workz");
				}else {
					System.out.print(col);
				}
			}
			System.out.println();
		} 
	}
} 
