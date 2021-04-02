import java.util.ArrayList;

public class MyArrayList{
	
	public static void main(String[] args){

	ArrayList<String> names = new ArrayList<String>();

	names.add("Simon");
	names.add("Peter");
	names.add("Paul");
	names.add("Arthur");
	names.add("Pius");

	System.out.println("All elements in the Array list are ");
	for(String a: names){
	System.out.println(a);
	}

		System.out.println("After removing Peter and Arthur then elements in the Array list are ");
		names.remove(1);
		names.remove(3);

		System.out.println("The array now has " + names.size() + " Elements");
	for(String a: names){
	System.out.println(a);
	}

		System.out.println("after Adding back elements in the Array list are ");
		names.set(0, "Peter");
		names.set(2, "Arthur");
	for(String a: names){
	System.out.println(a);
	}
	
	System.out.println("After emptying the array list elements in the Array list are ");
		names.clear();
	for(String a: names){
	System.out.println(a);
	}

	names.add("Simone");
	names.add("Peter");
	names.add("Pauline");
	names.add("Arthur");
	names.add("Pius");

	System.out.println("getting the size of the list so we can get the last two items ");
	System.out.println(names.size());
	int sizee = names.size();

	System.out.println("getting the size of the list so we can get the last two items ");
	System.out.println("Last element is" + names.get(sizee -1));
	System.out.println("Second last element is " + names.get(sizee -2)); 

	System.out.println("All elements in the Array list are ");
	for(String a: names){
	System.out.println(a);
	}


	}
}