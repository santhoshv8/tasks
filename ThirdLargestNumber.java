package com.xworkz.programsapp;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		
		int array[] = {23 ,53 , 8 , 6 , 15};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int temp = 0 ;
				if(array[i]<array[j]) {
					
					temp = array[i] ;
					array[i] = array[j] ;
					array[j] = temp ;
				}
			} 
		}
		System.out.println("Third Largest Number is "+ array[2]);
	}
}
