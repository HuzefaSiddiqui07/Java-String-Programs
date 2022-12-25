/*
* Assignment-17
* Date : 07/12/2022
* Write a Java Program for counting the vowels and numbers from file(
abc.txt) .
*/

package com.velocity.assignment17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class VowelCounter {
	
	public static void main(String[] args) {
		
		int vowelCount = 0;
		int numberCount = 0;
		
		// Use try & catch
		
		try {
			
			// Creating Object of FileInputStream to get data from AssignmentNo17.txt
			FileInputStream fis = new FileInputStream("C:\\Users\\Stars\\Desktop\\JavaWorkSpace\\AssignmentNo17.txt");
			
			// Creating Scanner class object and Passing the FileInputStream Object to Scanner for Scanning data
			Scanner scan = new Scanner(fis);
			
			// Run the loop till next line is present in the given file String
			while(scan.hasNextLine()) {
				
				String s = scan.nextLine(); // Storing each line of String into s variable
				
				// Running this loop till characters exits in the string
				for (int a = 0; a < s.length(); a++) {
					
					char ch = s.charAt(a); // Storing each character of String as per Index a
					
					// Checking for vowels using ASCII values
					if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117) {
						
						// If character in a string is vowel then this will increase by one everytime
						                vowelCount++;
				     }
					
					// to check if character in a string is number
					if (ch >= 48 && ch <= 57) {
						
						// if character in a string is number then this will increase everytime by one
						                numberCount++;
					}
				
				}
				
			}
			
			System.out.println("Total Number of Vowels in file are >> " + vowelCount);
			
			System.out.println("Total Number of Numbers in file are >> " + numberCount);
			
			                    scan.close();
			
			        } catch (IOException e) {
				
			             System.out.println(e);
		         }
	         }
        }
