package automation_test_selenium_java_testng;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "Motocross";
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println(rev);
	}
}
