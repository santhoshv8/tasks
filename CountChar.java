package com.xworkz.programsapp;

public class CountChar {

	public static void main(String[] args) {
		
	 	String name = "Java Programming" ;
	 	System.out.println(name);
	 	
		//counting a given char
	 	int count1 = 0 ; 
	 	int count2 = 0 ;
	 	for (int i = 0; i <name.length(); i++) {
			if(name.charAt(i)=='a') {
				count1+=1;
			}else {
				count2+=1; 
			}
		}	
	 	System.out.println("count:a= "+count1); 
	 	System.out.println("count = "+count2);  
	} 
}
