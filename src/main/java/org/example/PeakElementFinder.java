package org.example;

import java.util.Scanner;

public class PeakElementFinder {

    // Method to find a peak element using binary search
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Continue binary search until left equals right
        while (left <= right) {
            int mid = (left + right) / 2;

            // Handle edge elements separately
            boolean leftIsSmaller = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightIsSmaller = (mid == arr.length - 1 || arr[mid] > arr[mid + 1]);

            // Check if the middle element is a peak
            if (leftIsSmaller && rightIsSmaller) {
                return mid; // Return index of the peak element
            }

            // If left neighbor is greater, peak must be on the left side
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                // Otherwise, go to the right side
                left = mid + 1;
            }
        }

        return -1; // Should never reach here for valid input
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Ask user to enter elements of the array
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the peak element index
        int peakIndex = findPeakElement(arr);

//        System.out.println(arr[peakIndex]);

        // Display the peak element and its index
        if (peakIndex != -1) {
            System.out.println("Peak element found at index: " + peakIndex);
            System.out.println("Peak element value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }

        scanner.close();
    }
}

