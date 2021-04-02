public class Ifelse {
	
	public static void main (String[] args){

		int time = 19;
		String result;

		if (time < 10){

			System.out.println("Good morning" + "\r\n");

		}

		else if (time < 20){

			System.out.println("Good day" + "\r\n");

		}

		else {

			System.out.println("Good evening" + "\r\n");

		}

		System.out.println("My stuff to check when time is 5 " + "\r\n");

		time = 5;

		if (time < 10){

			System.out.println("Good morning" + "\r\n");

		}

		else if (time < 20){

			System.out.println("Good day" + "\r\n");

		}

		else {

			System.out.println("Good evening" + "\r\n");

		}


			System.out.println("Using short hand if else \" ?\"" + "\r\n");

		result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);




	}

}