package com.subreversestring;
   public class SubReverseString {

	public static void main(String[] args) {
		
		String string = "velocity";
		System.out.println("Original Main String >>> " + string);
		
		String str1 = "velo";
		System.out.println("Original string (str1) >> " + str1);
		
		String str2 = "city";
		
		//Stores the reverse of given string    
        String reversedStr2 = ""; 
        
      //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = str2.length()-1; i >= 0; i--){    
            reversedStr2 = reversedStr2 + str2.charAt(i);    
        }  
		
        System.out.println("Original string (str2) >> " + str2);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string (str2) >> " + reversedStr2);
        
        System.out.println("Concanate string (str1 & reversedStr2) >> " + str1 + reversedStr2);
     }
  }
