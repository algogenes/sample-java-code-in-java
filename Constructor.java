public class Constructor{
	
	String cpu;
	int ram;
	int storage;

	public Constructor(){

	cpu = "mediatek";
	ram = 2;
	storage = 16;

	}

	public static void main(String[] args){

	Constructor ItelS32LTE = new Constructor();

	System.out.println("The CPU is " + ItelS32LTE.cpu);
	System.out.println("The ram is " + ItelS32LTE.ram);
	System.out.println("The storage is " + ItelS32LTE.storage);

	}
}