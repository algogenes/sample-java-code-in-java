public class ForLoops{
	
	public static void main (String[] args){

	System.out.println("Lets see some odd numbers that are less than 10");

	for (int a = 1; a < 10; a = a + 2){

	System.out.println(a);

	}

	System.out.println("Lets see another use of break or continue");

	for (int i = 0; i < 10; i++) {

  	/*if (i == 4) {
    continue;
 	 }*/
  	System.out.println(i);

	}

	System.out.println("Another banga using For loop");

	for (int k = 2; k < 8; k++){

		System.out.println(" ");

		for (int l = 1; l < k; l++){

			System.out.print("*");

		}
		
	}

	}
}