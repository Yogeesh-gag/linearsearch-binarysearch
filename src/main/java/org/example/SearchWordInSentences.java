package org.example;

import java.util.Scanner;

public class SearchWordInSentences {

    // Method to search for a word in an array of sentences
    public static String findSentenceWithWord(String[] sentences, String word) {
        // Go through each sentence
        for (String sentence : sentences) {
            // Check if the sentence contains the word
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence; // Return the sentence if word is found
            }
        }

        // If no sentence contains the word
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many sentences they want to enter
        System.out.print("Enter the number of sentences: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Create an array to store the sentences
        String[] sentences = new String[n];

        // Read each sentence from the user
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = scanner.nextLine();
        }

        // Ask user for the word to search
        System.out.print("Enter the word to search: ");
        String word = scanner.nextLine();

        // Call the method and get the result
        String result = findSentenceWithWord(sentences, word);

        // Show the result
        System.out.println("Result: " + result);

        scanner.close(); // Close the scanner
    }
}
