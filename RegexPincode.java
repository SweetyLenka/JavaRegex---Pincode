package pincode;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegexPincode{
	
	public static void validatePincode()
	{
		System.out.println("ENTER A VALID PINCODE: ");
		System.out.println("*It is a 6 digits long code\n*It cannot begin with a special characters : [$&+,:;=?@#|'<>.^*()%!-] \n*It cannot begin with a alphabets : [A-Za-z]\n");
		
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length=input.length();
		String regex = "[0-9]{6}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if(length == 6)
		{
		
		char result=input.charAt(length-1);
		System.out.println("PINCODE ends with :"+result);
		//Converting char to string
		String lastdigit=Character.toString(result);
		
		//Pattern for Special Characters
		
		String specialCharacters = "[$&+,:;=?@#|'<>.^*()%!-]";

		//Pattern for alphabets
		String alphabets = "[a-zA-Z]";
		
		if(lastdigit.matches(specialCharacters))
		{
			System.out.println("PINCODE should not end with a special character - INVALID PINCODE");
			
		}
		else if (lastdigit.matches(alphabets))
		{
			System.out.println("PINCODE should not end with a alphabet - INVALID PINCODE");
			
		}
		else
		{
			System.out.println("PINCODE ends with a digit - VALID PINCODE");
		}
		
		}
		else
			System.out.println("PINCODE should be six digit long - INVALID PINCODE");
			

	}
	
	
public static void main(String args[]) {
	System.out.println("WELCOME TO JAVA REGEX - VALIDATING A PINCODE");
	validatePincode();
	
}
}
	
