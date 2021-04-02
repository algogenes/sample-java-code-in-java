import java.util.Scanner;
public class ThisIs{
	
	public static void main(String[] args){
	Scanner objScanner = new Scanner(System.in);
	int x = 4;
	int yourNumber;

	System.out.println("Enter any number, we add it to 4 and show you the answer ");
	yourNumber = this.nextInt();

	System.out.println("Answer is " + (x + yourNumber));

	}
}