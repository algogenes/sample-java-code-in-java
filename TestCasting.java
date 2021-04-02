public class TestCasting {

	public static void main (String[] args){


		int numA = 5, numB = 10; // 2 ints i.e numA and numB we shall use to cast
		float numC = numA;   // casting int to a float i.e automatic aka wide casting
		float numD = 20.8f;   // float we shall use to cast
		int numE = (int) numD;  // casting from float i.e manually to int aka narrow casting

		//printing the values before and after casting
		System.out.println(numA); // numA is int
		System.out.println(numC);  // numC is float
		System.out.println(numD);  // numC is float
		System.out.println(numE);  // numE is int


	}






}