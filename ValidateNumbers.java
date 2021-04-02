import java.util.Scanner;
public class ValidateNumbers{

	static void reject(){
		System.out.println("Sorry, The number has been rejected, please doublecheck and try again");
	}

	public void pass(){
		System.out.println("Nice your number is valid, proceeding to post payment");
	}

	public void postPayment(){
		System.out.println("Payment successfully posted sir");
	}

	public void sanitise(char[] realNumber, int numberLength){
		char[] sanitised = new char[7];

		if(numberLength == 10){
			for(int a = 0, b = 1; a < 7; a++){
				sanitised[a] = realNumber[b];
				b++;
			}
		}
		else if(numberLength == 12){
			for(int a = 0, b = 2; a < 7; a++){
				sanitised[a] = realNumber[b];
				b++;
		}
	}
		else{
			reject();
			System.out.println("sanitise has rejected it");
		}

		System.out.println("The number had more than 9 digits but was sanitised");

	}

	public String isInputValid(char[] realNumber, int numberLength, String done){
		//System.out.println("The real number has length " + numberLength);
		boolean yeah = true;
		if(numberLength > 9 && numberLength < 13){
			pass();
			done = "yes";
		}
		else{
			reject();
			done = "no";
		}

		for(int q = 0; q < numberLength; q++){
			yeah = Character.isDigit(realNumber[q]);
			if(yeah == true){
					done = "yes";
			}
			else{
				System.out.println("You entered a character instead of a number somewhere, we are exiting sir");
				done = "no";
				break;
			}
		}

		return done;

	}

	public String categoriseInput(char[] realNumber, int numberLength, String done){
		switch(numberLength){
			case 9:
			System.out.println("The number has 9 digits");
			if(realNumber[0] == '7'){

				pass();
				done = "yes";
				System.out.println("The number has passed");
			}
			else{
				reject();
				done = "no";
				System.out.println("It has been rejected coz first value isnt 7");
			}
			break;
			case 10:
			System.out.println("The number has 10 digits");
			if((realNumber[0] == '0') && (realNumber[1] == '7')){
				pass();
				sanitise(realNumber, numberLength);
				postPayment();
				done = "yes";
				System.out.println("The number has passed");
			}
			else{
				reject();
				done = "no";
				System.out.println("It has been rejected coz first value isnt 0 and second value isnt 7");
			}
			break;
			case 12:
			System.out.println("The number has 12 didgits");
			if(realNumber[0] == '2' && realNumber[1] == '5' && realNumber[2] == '6' && realNumber[3] == '7'){
				pass();
				sanitise(realNumber, numberLength);
				postPayment();
				done = "yes";
				System.out.println("The number has passed");
			}
			else{
				reject();
				done = "no";
			}
			break;
			default: reject();
			done = "no";
		}

		return done;
	}
	
	public static void main(String[] args){
	Scanner getNumber = new Scanner(System.in);
	String number;
	int numberLength;
	String done = "Starting";
	ValidateNumbers now = new ValidateNumbers();

	System.out.println("Enter your number and we will validate it for you");
	number = getNumber.nextLine();
	numberLength = number.length();

	char[] realNumber = number.toCharArray();
	
	done = now.isInputValid(realNumber, numberLength, done);
	System.out.println("After isInputValid the value of done is " + done + "\n\n");

	// CODE GOES HERE

	if(done == "yes"){
		System.out.println("Before categoriseInput the value of done is " + done + "\r");
		done = now.categoriseInput(realNumber, numberLength, done);
		System.out.println("After categoriseInput the value of done is " + done + "\r");

		if(done == "yes"){
			now.pass();
			now.postPayment();
		}
		else{
			now.reject();
		}
	}
	else{
		now.reject();
	}

	}
}

/* System.out.println("The real number has length " + numberLength + " digits and is ");

	for(int a = 0; a < numberLength; a++){
		System.out.print(realNumber[a]);
	}

	System.out.println("Checking if this xter is a digit " + Character.isDigit(realNumber[2])); */


/* */
