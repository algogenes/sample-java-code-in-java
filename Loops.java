public class Loops {
	public static void main (String[] args){

			int counter = 1, opt;

			int a = 3, b = 3, c = 3, d = 3;

			System.out.println("Hey lets show you some otps of 4 digits using a while loop");

		while(counter < 6){

			opt = (int) (999 + (Math.random() * 9000 ));

			System.out.println(opt);

			counter++;

		}

		System.out.println("\nnow lets do it again using a do...while loop");

		do{

			opt = (int) (999 + (Math.random() * 9000 ));

			System.out.println(opt);

			counter++;


		}

		while(counter!=11);

		System.out.println("\nHow about a lesson about i++ vs ++i");

		a = a++;

		System.out.println("a = " + a);

		System.out.println("a = " + a);

		System.out.println("a = " + a);

		System.out.println("a = " + a);

		b = ++b;

		System.out.println("b = " + b);

	}

}