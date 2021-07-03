import java.util.Scanner;
public class ValidPalindrome125 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the line : ");
		String inputStr = input.nextLine();
		validPalindrom(inputStr);
	}
	
	public static void validPalindrom(String inputStr) {
		String str= inputStr.replaceAll("[^a-zA-Z0-9]+", "");
		//System.out.println(str);
		StringBuilder sb= new StringBuilder(str);
		StringBuilder reverse= sb.reverse();
		String reverseStr= reverse.toString();
		if (reverseStr.equalsIgnoreCase(str)) {
			System.out.println("it is a Palindrom");
		}
		else
			System.out.println("it is not a Palindrom");

	}

}
