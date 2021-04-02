import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class PollysAssignment{
	
	public static void main(String[] args){

	File newFile = new File("E:\\TestFiles\\Polly.txt");
	Scanner objScanner = new Scanner(System.in);
	
	try{
	newFile.createNewFile();

	if(newFile.exists()){
	System.out.println("The file was created successfully. File name is " + newFile.getName());
	System.out.println("The file path is " + newFile.getAbsolutePath());
	System.out.println("The file size is " + newFile.length());
	}
	else{
	System.out.println("The file doesnt exist sir");
	}

	}

	catch(IOException e){
	System.out.println("We couldnt create the file sir ");
	e.printStackTrace();
	}

	//Writing to the file

	if(newFile.exists())
{
		try{
	FileWriter writeObj = new FileWriter("E:\\TestFiles\\Polly.txt");
	String words;
	System.out.println("Enter your sentences sir, anything apart from words isnt allowed");
	words = objScanner.nextLine();
	writeObj.write(words);
	writeObj.close();
	System.out.println("We have succesfully written to the file");
	}

	catch(IOException e){
	System.out.println("We couldnt write to the file sir ");
	e.printStackTrace();
	}
	
}

else{
	System.out.println("The file doesnt exist sir so we cant write to it");
}

	}
}

