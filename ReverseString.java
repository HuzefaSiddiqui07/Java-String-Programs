// Java Program to find Reverse of the string.

package com.reversestring.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Huzefa Siddiqui";    
		
        //Stores the reverse of given string    
        String reversedName = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = name.length()-1; i >= 0; i--){    
        	reversedName = reversedName + name.charAt(i);    
        }    
            
        System.out.println("Original string: " + name);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedName);  
		
	}

}
