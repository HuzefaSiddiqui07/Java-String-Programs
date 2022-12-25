// Java Program to remove all the white spaces from a string

package com.removewhitespace.string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		  String space ="Remove white spaces";    
          
	        //Removes the white spaces using regex    
		  space = space.replaceAll("\\s+", "");    
	            
	        System.out.println("String after removing all the white spaces : " + space);    

	}

}
