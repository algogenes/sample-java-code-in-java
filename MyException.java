import java.util.Scanner;

public class MyException{
	
	public static void main(String[] args){

	Scanner name = new Scanner(System.in);
	int newName;

	try{
	System.out.println("Enter a number and not a name ");
	newName = name.nextInt();
	System.out.println("Your name is " + newName );

	}
	catch(Exception e){

	System.out.println("You entered something invalid, like not a number");

	System.out.println("my thread created" + this);


	}


	}
}