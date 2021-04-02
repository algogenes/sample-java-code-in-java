import java.util.LinkedList;

public class Computers{

public static void main(String[] args){

	LinkedList<String> computers = new LinkedList<String>();

	computers.add("Lenovo");
	computers.add("hp");
	computers.add("Apple");
	computers.add("Dell");
	computers.add("Asus");
	computers.add("Toshiba");

	System.out.println(computers);

	computers.addFirst("Fujitsu");
	computers.addLast("Acer");

	System.out.println("Lets replace Dell with Alienware");
	computers.set(4, "Alienware");

	System.out.println(computers.get(0));
	System.out.println(computers.get(7));
	System.out.println("Our Array list has " + computers.size() + " elements");

	System.out.println(computers);

	System.out.println("Dont forget the basic 5 methods i.e add() remove() get() set() clear()");
	

}	

}

