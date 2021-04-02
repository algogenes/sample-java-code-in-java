public class MathsTest {

	public static void main (String[] args){

		int otp, otp4, otp6, otp2, counter, a, b, c, d;

		String countOpt;

		otp = (int)(Math.random());

		System.out.println("Show any random number"+"\r");

		System.out.println(Math.random() + "\r\n\n");


		System.out.println("Show random number of 2 digits"+"\r");

		otp2 = 9 + (int)(Math.random()*91);

		System.out.println(otp2 + "\r");

		countOpt = String.valueOf(otp2);

		System.out.println("Checking value of string after convert" + "\r");

		System.out.println(countOpt + "\r");

		System.out.println("Count the digits in string \"countOpt\" and compare to digits of otp2" + "\r\n");

		counter = countOpt.length();

		System.out.println("Counter holds number of xters in string and the number is " + counter + "\r\n");

		System.out.println("lets see if we really have 2 digits for our otp2 \r\n" + (counter == (countOpt.length())) + "\r\r\r" );


		System.out.println("Show random number of 4 digits"+"\r\n\n");

		otp4 = (int)(Math.random()*10000);

		System.out.println(otp4 + "\r");


		System.out.println("Show random number of 6 digits"+"\r");

		otp6 = (int)(Math.random()*1000000);

		System.out.println(otp6 + "\r\n\n\n");



		System.out.println("All below is a test for nos. 5 between 30 , sth is weird"+"\r");

		a = 5 + (int)(Math.random() * 30);  
        b = 5 + (int)(Math.random() * 30);  

		System.out.println(a + "\r");
		System.out.println(b + "\r");

		a = 5 + (int)(Math.random() * 30);  
        b = 5 + (int)(Math.random() * 30); 

		System.out.println(a + "\r");
		System.out.println(b + "\r\n\n\n");



		System.out.println("My personal correction for the above test error"+"\r");

		c = 5 + (int)(Math.random() * 25);  
        d = 5 + (int)(Math.random() * 25);  

		System.out.println(c + "\r");
		System.out.println(d + "\r");

		c = 5 + (int)(Math.random() * 25);  
        d = 5 + (int)(Math.random() * 25); 

		System.out.println(c + "\r");
		System.out.println(d + "\r");

	}
}