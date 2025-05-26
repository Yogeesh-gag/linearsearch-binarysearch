package org.example;

import java.util.Scanner;

public class RotationPointSearch {

    // Method to find index of the smallest element (rotation point)
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary Search loop
        while (left < right) {
            int mid = (left + right) / 2;

            // If midelement is greater than right, rotation point is on the right side
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // If midelement is less than or equal to right, move towards left side
                right = mid;
            }
        }

        // After loop ends, left points to the smallest element
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create array to hold input
        int[] arr = new int[n];

        // Take input from the user
        System.out.println("Enter the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call method to find rotation point index
        int index = findRotationPoint(arr);

        // Display the result
        System.out.println("Rotation point is at index: " + index);
        System.out.println("Smallest element is: " + arr[index]);

        scanner.close();
    }
}
