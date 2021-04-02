public class Threads implements Runnable{

		public void run(){

	System.out.println("Welcome to threads, cant believe am running in the background");

	}
	
	public static void main(String[] args){

	Threads greeting = new Threads();

	Thread greetingObj = new Thread(greeting);

	greetingObj.start();



	}
}