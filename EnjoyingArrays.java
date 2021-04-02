public class EnjoyingArrays{
	
	public static void main(String[] args){

	int[] numbers = new int[10];
	int[] even = {2,4,6,8,10};

	int[][] nums = new int[4][4];
	int e = 1;


	int b = 0;
	for(int a = 1 ; a < 11; a++ ){
	numbers[b] = a;
	b++;
	}

	System.out.println("Array numbers has elements" + numbers.length + "And listed below");
	for(b = 0; b < 10; b++){
	System.out.println(numbers[b]);
	}

	System.out.println("\r" + "Array even has " + even.length + "elements");

	for(int c = 0; c < 5; c++){
		System.out.println(even[c]);

	}

	even[4] = 20;

	System.out.println("Checking element 5 in array Even " + even[4]);


	for(int c = 0; c < 4; c++){

		for(int d = 0; d < 4; d++){

			nums[c][d] = e;
			e++;

		}
	}


	System.out.println("The content in Array nums is ");
	for(int c = 0; c < 4; c++){

		System.out.println(" ");

		for(int d = 0; d < 4; d++){

			System.out.print(" " + nums[c][d]);

		}
	}


	

	}
}