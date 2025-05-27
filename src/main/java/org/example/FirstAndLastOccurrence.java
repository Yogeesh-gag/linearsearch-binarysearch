package org.example;

public class FirstAndLastOccurrence {

    // Method to find the first occurrence of the target
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;        // Store index and search left half
                right = mid - 1;
            } else if (target < arr[mid]) {
                right = mid - 1;     // Search in left half
            } else {
                left = mid + 1;      // Search in right half
            }
        }
        return result;
    }

    // Method to find the last occurrence of the target
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;        // Store index and search right half
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;     // Search in left half
            } else {
                left = mid + 1;      // Search in right half
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5,6};
        int target = 5;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        }
    }
}
