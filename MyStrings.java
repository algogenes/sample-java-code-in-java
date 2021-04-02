public class MyStrings{

	public static void main(String[] args){

		String myName = "NYENJE SIMON PETER";
		String smallName;
		String bigName;

		System.out.println("Count letters in myName\r");
		System.out.println(myName.length()+"\r");

		System.out.println("Convert myName from Capital to Small letters\r");
		System.out.println(myName.toLowerCase()+"\r");

		System.out.println("Convert myName from Small to Capital letters\r");
		System.out.println(myName.toUpperCase()+"\r");

		//converting and storing in variables
		smallName = myName.toLowerCase();

		System.out.println(smallName+"\r");

		bigName = myName.toUpperCase();

		System.out.println(bigName+"\r");

		System.out.println(myName);


	}
}