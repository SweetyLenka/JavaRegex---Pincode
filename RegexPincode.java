package pincode;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegexPincode{
	
public static void main(String args[]) {
	System.out.println("WELCOME TO JAVA REGEX - VALIDATING A PINCODE");
	System.out.println("ENTER A VALID PINCODE : ");
	
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	String regex = "\\d";
	
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(input);
	
	int count=0;
	while(matcher.find())
	{
		count++;
	}
	if(count == 6)
	System.out.println("YOU HAVE ENTERED A VALID PINCODE");
	else
		System.out.println("PLEASE ENTER A 6-DIGIT PINCODE");

	
	

 }
}