package com.cogent.assignments.day01.Q6;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        stringDisplayPalindrome();
    }

    static void stringDisplayPalindrome() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string");

        String str = scanner.nextLine();

        System.out.println("string size: " + str.length());
        System.out.println("string Uppercase: " + str.toUpperCase());

        str = str.toLowerCase();

        int counter = 0;
        int i = str.length() - 1;

        boolean isPalindrome = true;

        while(i > str.length()/2 - 1) {
            if(Character.isLetterOrDigit(str.charAt(i))
                    && Character.isLetterOrDigit(str.charAt(counter))) {
                if(str.charAt(counter) == str.charAt(i)) {
                    counter++;
                    i--;
                }
                else {
                    isPalindrome = false;
                    break;
                }
            }
            if(!Character.isLetterOrDigit(str.charAt(counter)))
                counter++;
            if(!Character.isLetterOrDigit(str.charAt(i)))
                i--;
        }
        System.out.println("string is palindrome: " + isPalindrome);
    }

}
