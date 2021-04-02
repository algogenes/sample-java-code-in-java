import java.util.Scanner;

public class MyScanner{

	public static void main(String[] args){

		String name;
	
	Scanner named = new Scanner(System.in);
	System.out.println("Hello whats your name?");
	name = named.nextLine();
	named.close();

	System.out.println("Oh Hello " + name + " , How are you?");


}

}

