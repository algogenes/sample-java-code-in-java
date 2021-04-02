public class Cars{

	int handling;
	int speed;
	int acceleration;
	int fuel;

	public static void main(String[] args){

	Cars harrier = new Cars();
	Cars nissanGTR = new Cars();
	Cars jeep = new Cars();
	Cars benzGLE = new Cars();

	harrier.handling = 50;
	harrier.speed = 180;
	harrier.acceleration = 11;
	harrier.fuel = 60;

	System.out.println("A harrier is a sedan car ");
	System.out.println("The car has a handling of : " + harrier.handling + " Top speed of : " + harrier.speed + " Acceleration of : " + 
	 harrier.acceleration + " And fuel tank of litres : " + harrier.fuel + "\r");
	System.out.println("\n");


	nissanGTR.handling = 90;
	nissanGTR.speed = 320;
	nissanGTR.acceleration = 3;
	nissanGTR.fuel = 65;

	System.out.println("A nissanGTR is a sports car ");
	System.out.println("The car has a handling of : " + nissanGTR.handling + " Top speed of : " + nissanGTR.speed + " Acceleration of : " + 
	 nissanGTR.acceleration + " And fuel tank of litres : " + nissanGTR.fuel + "\r");
	System.out.println("\n");




	}
}