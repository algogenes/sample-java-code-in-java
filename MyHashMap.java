import java.util.HashMap;

public class MyHashMap{
	
	public static void main(String[] args){

	HashMap<String, Integer> people = new HashMap<String, Integer>();

	people.put("John", 15);
	people.put("Jack", 18);
	people.put("James", 23);
	people.put("Julius", 25);
	people.put("Justun", 34);

	System.out.println(people);

	System.out.println(people.get("James"));

	//people.set("Jack" 55);

	people.remove("Julius");
	System.out.println("After removing Julius");
	System.out.println(people);






	}
}