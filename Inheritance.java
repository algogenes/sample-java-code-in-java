public class Inheritance{

public String showFirstName(){

String firstName = "Simon";

return (firstName);

}
	

}

 class Yeah extends Inheritance{

public String showSecondName(){
	
	String secondName = "Peter";

	return (secondName);
}


	public static void main(String[] args){

	Yeah men = new Yeah();

	System.out.println("Isnt your name " + men.showFirstName() + " " + men.showSecondName());


	}
	

}