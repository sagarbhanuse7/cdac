package org.assign6;

import java.util.Arrays;

public class Program5 {

	public static void main(String[] args) {
        int[] arr1 = {10, 20, 50};
        int[] arr2 = {20, 50, 40};

        int[] intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection of arrays: " + Arrays.toString(intersection));
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
    	 int[] result = new int[Math.min(arr1.length, arr2.length)];
         int index = 0;

        
         for (int i = 0; i < arr1.length; i++) {
             
             for (int j = 0; j < arr2.length; j++) {
                 if (arr1[i] == arr2[j]) {  
                     
                     boolean isDuplicate = false;
                     for (int k = 0; k < index; k++) {
                         if (result[k] == arr1[i]) {
                             isDuplicate = true;
                             break;
                         }
                     }

                     
                     if (!isDuplicate) {
                         result[index++] = arr1[i];
                     }
                 }
             }
         }

         return Arrays.copyOf(result, index); //Arrays.copyOf() helps us return only the relevant portion of the result array, i.e., the part that contains the common elements.
    }
}
