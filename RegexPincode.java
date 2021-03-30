package pincode;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegexPincode{
	
	public static void validatePincode()
	{
		System.out.println("ENTER A VALID PINCODE: ");
		
		
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length=input.length();
		String regex = "[0-9\s]{6,7}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.find())
		System.out.println(input+" is a valid pincode");
		else
		System.out.println(input+" is not a valid pincode");
	}
	
	
public static void main(String args[]) {
	System.out.println("WELCOME TO JAVA REGEX - VALIDATING A PINCODE");
	validatePincode();
	
}
}
	
