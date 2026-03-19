package automation_test_selenium_java_testng;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSortUsingReverseOrder {

	public static void main(String[] args) {
		
		Integer arr[] = {5, 2, 9, 1, 7};
		
		// Sorting the array in descending order
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		// Descending Order by Sorting and Reversing
		int a[] = {1, 2, 3, 4, 5};
		
		// sort the array in ascending order
        Arrays.sort(a);

        // reverse the array
        reverse(a);

        System.out.println(Arrays.toString(a));
	}
	
	public static void reverse(int[] a) {
		// length of an array
        int n = a.length;

        // swap the first half with the second half
        for (int i = 0; i < n / 2; i++) {

            // Store the first half elements temporarily
            int t = a[i];

            // Assign the first half
            // to the last half
            a[i] = a[n - i - 1];

            // Assign the last half
            // to the first half
            a[n - i - 1] = t;
        }
	}
}
