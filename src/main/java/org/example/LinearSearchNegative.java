package org.example;

import java.util.Scanner;

public class LinearSearchNegative {

    // Method to find the index of the first negative number in the array
    public static int findFirstNegative(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return index if a negative number is found
            }
        }
        return -1; // Return -1 if no negative number found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of given size
        int[] numbers = new int[size];

        // Read array elements from the user
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call the method to find the first negative number
        int index = findFirstNegative(numbers);

        // Display the result
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
            System.out.println("Value: " + numbers[index]);
        } else {
            System.out.println("No negative number found in the array.");
        }

        scanner.close(); // Close the scanner
    }
}

