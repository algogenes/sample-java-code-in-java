import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RealCalc{
	
	public static void main(String[] args){

	Scanner obj = new Scanner(System.in);
	String input;
	int inputLength;
	boolean oddtrue, oddfalse; 
	int checkvalue;

	System.out.println("Use the calc by entering the expression ");
	input = obj.nextLine();
	inputLength = input.length();

	//is length greter than 1
	checkvalue = inputLength/2;

	//is length even or odd
	oddtrue = (inputLength%2) == 0;

	System.out.println("Value of odd true is " + oddtrue + "checkvalue is " + checkvalue);

	System.out.println("The length is " + inputLength);

	/* 	if(checkvalue > 1 && ((inputLength%2) == 0)){
	System.out.println("The expression is valid, proceeding to calculate");
	}

	else{
	System.out.println("Syntax error sir ");
	} */



	}
}