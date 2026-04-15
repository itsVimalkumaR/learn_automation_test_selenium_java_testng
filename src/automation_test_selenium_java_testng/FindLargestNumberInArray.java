package automation_test_selenium_java_testng;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {16, 12, 19, 99};
		int max = arr[0];
		
		for(int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);
	}
	
	@Test(retryAnalyzer = IRetryAnalyzer.class)
	public void testLogin() {
		// test code
	}
}
