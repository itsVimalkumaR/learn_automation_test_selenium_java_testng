package automation_test_selenium_java_testng;

public class CountVowelsInString {

	public static void main(String[] args) {
		String str = "automation";
		int count = 0;
		
		for (char c : str.toCharArray()) {
			if("aeiou".contains(String.valueOf(c))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
