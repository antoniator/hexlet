/*
Write a function that takes a single string as input and returns T if the string is a palindrome,
and F otherwise. A palindrome is a word, phrase, number, or other sequence of characters
which reads the same backward or forward. Allowances may be made for adjustments to capital letters,
punctuation, and word dividers.
 */

package self_study.strings.e001;

import java.io.*;
import java.util.*;

public class Exercise {
    //COMPLETE THIS FUNCTION
    private static void process(String input) {
        String output = input.replaceAll("\\W+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(output);
        sb.reverse();
        String reversed = sb.toString();
        if (output.equals(reversed)) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }
    }

    //you do not need to edit any code below this line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        process(input);
    }
}
