public class Arrays{
	
	public static void main(String[] args){

	int[] evenNums = new int[10];

	int i = 0;

	for(int a = 0; a < 10; ++a){ // the loop is assigning and printing at the same time and doing this for 10 values or 10 times

	evenNums[a] = i;  // when i = 0 a is also "0" meaning index and value start at the same point
	System.out.println(evenNums[a]);
	i = i + 2;  // Before we increase index a to 1 we have to make sure our i is 2 and we keep adding 2 to itself

	} 

	}
}