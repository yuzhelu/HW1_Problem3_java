package com.company;


import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String stringOfInt){

        //break statement
        if(stringOfInt.length() == 0 || stringOfInt.length() ==1)
            return true;
        //will recursively return true if it is a palindrome
        if(stringOfInt.charAt(0) == stringOfInt.charAt(stringOfInt.length()-1)){
            return isPalindrome(stringOfInt.substring(1,stringOfInt.length()-1));
        }

        //else returns false
        return false;


    }


    public static void main(String[] args) {
	// write your code here
        String stringOfInt = "";    //initialize string
        //initialize scanner
        Scanner sc = new Scanner(System.in);

        //reading in as a string so we can compare lengths
        while(stringOfInt.length() < 5) {
            System.out.println("Enter your 5 digit integer");
            stringOfInt = sc.nextLine();

            if(stringOfInt.length() < 5){
                System.out.println("Length of integer is less than 5. Please try again");
            }

        }

        //check if palindrome
        if (isPalindrome(stringOfInt)){
            System.out.println(stringOfInt + " is a palindrome");
        }
        else
            System.out.println(stringOfInt + " is not a palindrome");

    }




}
