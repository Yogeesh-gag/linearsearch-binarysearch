package org.example;

// Class to implement binary search in a 2D sorted matrix
public class MatrixBinarySearch {

    // Method to search for a target value in a 2D sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length; // Total number of rows
        if (rows == 0) return false; // Return false if matrix is empty
        int cols = matrix[0].length; // Total number of columns

        // Treat the 2D matrix as a 1D array
        int left = 0;
        int right = rows * cols - 1; // Last index in the flattened array

        // Standard binary search loop
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Convert 1D mid index to 2D indices (row, column)
            int midElement = matrix[mid / cols][mid % cols];

            // Check if the mid element matches the target
            if (midElement == target) {
                return true; // Target found
            }
            // If target is smaller, search the left half
            else if (target < midElement) {
                right = mid - 1;
            }
            // If target is larger, search the right half
            else {
                left = mid + 1;
            }
        }

        return false; // Target not found after binary search
    }

    // Main method to test the searchMatrix function
    public static void main(String[] args) {
        // Define a 2D matrix with sorted rows and increasing first elements
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target = 19; // Value to search for

        // Call the search method and print result
        boolean found = searchMatrix(matrix, target);
        System.out.println("Is target found? " + found); // Output result
    }
}

