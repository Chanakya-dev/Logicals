package Strings;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);    
    String text=in.nextLine();
        boolean result = reverseWords(text);
        System.out.println("Operation successful: " + result);
    }

    public static boolean reverseWords(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        String rev = "";
        String[] words = text.split(" ");
    for (String word : words) {
        String reversedWord = "";
        for (int j = word.length() - 1; j >= 0; j--) {
            reversedWord += word.charAt(j);
        }
        rev += reversedWord + " ";
    }
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + rev); 
        return true; 
}}
