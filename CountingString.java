/* 
  Assignment No : 19
  Date : 13/12/2022
  Design a method for counting the alphabet, vowels and numbers from String.
  Input should be from user into main method and pass that to methods. 
  And result will print into main method 
 */

package com.velocity.assignment19;

import java.util.Scanner;

public class CountingString {
	
	// Declaring the variables for counting the vowels,alphabets & numbers
	 int countVowels;
	 int countAlphabet;
	 int countNumbers;
	 
	 // Create Return type method for Counting Alphabet
	 public int getCountAlphabet(String userInput) {
		 
		// Iterate the loop for reading the values from input string data
		 for(int a = 0; a < userInput.length(); a++) {
			 
			 // Store String Characters in 'ch' variable
			 char ch = userInput.charAt(a);
			 
			// Get count for alphabet & vowels
			 if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				 
				 countAlphabet++;
			 }
		  }
		      return countAlphabet;
		}
	 
	// Create Return type method for Counting Vowels
	 public int getCountVowels(String userInput) {
		 
		// Iterate the loop for reading the values from input string data
		 for(int b = 0; b < userInput.length(); b++) {
			 
			// Store String Characters in 'ch' variable
			 char ch = userInput.charAt(b);
			 
			 
			 if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
				ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				 
				 
				       countVowels++;
			      }
		      }
		 
		            return countVowels;
	      }
	 
	// Create Return type method for Counting Numbers
	 public int getCountNumbers(String userInput) {
		 
		// Iterate the loop for reading the values from input string data
		 for(int c = 0; c < userInput.length(); c++) {
			 
			// Store String Characters in 'ch' variable
			 char ch = userInput.charAt(c);
			 
			 if(ch >= '0' && ch <= '9') {
				 
				 countNumbers++;
			 }
		  }
		       return countNumbers;
	   }
	
	
	 public static void main(String[] args) {
		 
		 // Create an Object of CountingString Class
		 CountingString cs = new CountingString();
		 
		 
		 // Create Scanner Object
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter String Data");
		 
		 String userValue = scan.nextLine();
		 
		// get alphabets, vowels & numbers counts from input string data
		System.out.println("Alphabets Count in String Data >>> " + cs.getCountAlphabet(userValue));
		System.out.println("Vowels Count in String Data >>> " + cs.getCountVowels(userValue));
		System.out.println("Numbers Count in String Data >>> " + cs.getCountNumbers(userValue));
	}
 }
