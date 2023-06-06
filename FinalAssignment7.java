package ineuron;

import java.util.Arrays;
import java.util.Scanner;

public class FinalAssignment7 {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int resultIndex = binarySearch(sortedArray, target);

        if (resultIndex != -1) {
            System.out.println("Target value found at index: " + resultIndex);
        } else {
            System.out.println("Target value not found in the array.");
        }

        scanner.close();
    }
}

