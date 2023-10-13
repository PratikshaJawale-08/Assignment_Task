package com.assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        // Create a set to store seen characters
        Set<Character> seenCharacters = new HashSet<>();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        // Iterate through the characters in the input sentence
        for (char c : inputSentence.toCharArray()) {
            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                seenCharacters.add(c);
            }
        }

        // Check if all lowercase letters from 'a' to 'z' are in the set
        boolean isPangram = seenCharacters.size() == 26;

        // Display the result
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        // Close the scanner
        scanner.close();
    }
}
