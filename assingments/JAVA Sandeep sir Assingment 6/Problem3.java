package org.assign6;

public class Problem3 {
	 public static int findMax(int[] arr) {
	        int max = arr[0];
	        for (int value : arr) {
	            if (value > max) {
	                max = value;
	            }
	        }
	        return max;
	    }

	    public static int findMin(int[] arr) {
	        int min = arr[0];
	        for (int value : arr) {
	            if (value < min) {
	                min = value;
	            }
	        }
	        return min;
	    }
	    
	    public static void main(String[] args) {
			
	    	 int[] arr = {15, 20, 2, 50, 6};

	         int max = findMax(arr);
	         int min = findMin(arr);

	         System.out.println("Maximum value: " + max);
	         System.out.println("Minimum value: " + min);
		}
}
