// Java Program to count the total number of characters in a string
package com.countcharacter.string;

public class CountCharacter {

	public static void main(String[] args) {
		
		 String name = "Siddiqui Huzefa Muzammil";    
		 
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < name.length(); i++) {  
	        	
	            if(name.charAt(i) != ' ') {
	            	count++;  
	            }
	            	
	       }    
	            
	     //Displays the total number of characters present in the given string    
	       System.out.println("Total number of characters in a string: " + count);    

	}

}
