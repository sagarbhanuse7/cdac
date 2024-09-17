package org.assign6;

public class Program6 {

	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int missingNumber = findMissingNumber(arr, 5);

        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int value : arr) {
            arrSum += value;
        }

        return totalSum - arrSum;
    }
}
