import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadingFiles{
	
	public static void main(String[] args){

	try{
		File objFile = new File("E:\\TestFiles\\FirstFile.txt");
		Scanner readFile = new Scanner(objFile);
	while(readFile.hasNextLine()){
	String words = readFile.nextLine();
	System.out.println("Below is the content of the file" + "\r");
	System.out.println(words);
	}
	readFile.close();
}

catch(FileNotFoundException e){
System.out.println("We couldnt read from the file sir");
e.printStackTrace();
}

	}
}

