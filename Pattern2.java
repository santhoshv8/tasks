package com.xworkz.programsapp;

public class Pattern2 {

	public static void main(String[] args) {
		
	/*	 for(int row1=1 ; row1<=4 ; row1++) {
				for(int col1=1 ; col1<=4 ; col1++) {
					if((row1==2 || row1==3) && (col1==2 || col1==3)) {
						System.out.print(" ");
					}else {
						System.out.print("#");	
					} 
				}
			     System.out.println();
			  }
	*/
		for(int row=1 ; row<=4 ; row++) {
			for(int col=1 ; col<=4 ; col++) {
				if(col==1 || col==4 || row==1 || row==4) {
					System.out.print("#"); 
				}else {
					System.out.print(" ");	
				} 
			}
		     System.out.println();
		  }
	}
}  
