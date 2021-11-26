package org.sample;

import java.util.Scanner;

public class Reverse {
      public static void main(String[] args){
          
          String str= "Geeks", nstr="";
          char ch;
         
        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word
         
        for (int i=str.length()-1; i>=0; i--)
        {
        	System.out.println("each word: "+ str.charAt(i));
        
          ch= str.charAt(i); //extracts each character
          
          nstr= nstr +ch; //adds each character in front of the existing string
          
          System.out.println("eachjjjjj word: "+ nstr);
          System.out.println();
        }
        System.out.println("Reversed word: "+ nstr);
      }

	}
		
    

	
	
		
      	
	

