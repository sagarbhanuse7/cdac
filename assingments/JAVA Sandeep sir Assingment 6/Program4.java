package org.assign6;

import java.util.Arrays;

public class Program4 {

	public static void main(String[] args) {
        int[] arr = {10,20,30,10,10,20};
        int[] result = removeDuplicates(arr);

        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
