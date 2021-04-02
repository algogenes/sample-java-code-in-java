//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFiles{
	
	public static void main(String[] args){
	//File objFile = new File("E:\\TestFiles\\FirstFile.txt");
	

	//if(objFile.exists()){

	try{
		FileWriter objWriter = new FileWriter("E:\\TestFiles\\FirstFile.txt");
	objWriter.write("Guys I just wrote to the file man, remember progressive overload always wins ");
	System.out.println("We are done writing to the file sir ");
	objWriter.close();
	}

	catch(IOException e){
	System.out.println("We couldnt write to the file");
	e.printStackTrace();
	}

	//}
	/*else{
	System.out.println("We couldnt access the file ");
	}*/

	}
}