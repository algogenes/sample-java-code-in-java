import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class OrganiseTransactions{
	
	public static void main(String[] args){

    String[] newWords = new String[1258];
    int a = 0;
    int counter = 0;
	try{
		File objFile = new File("E:\\TestFiles\\MINE\\input.txt.txt");
		Scanner readFile = new Scanner(objFile);
		System.out.println("Below is the content of the file" + "\r");
	while(readFile.hasNextLine()){
	String words = readFile.nextLine();
	newWords[a] = words;
	counter++;
	System.out.println(newWords[a]);
	a++;
	}
	readFile.close();
}

catch(FileNotFoundException e){
System.out.println("We couldnt read from the file sir");
e.printStackTrace();
}

System.out.println("Our String newWords has " + counter + "words");

try{
		FileWriter objWriter = new FileWriter("E:\\TestFiles\\MINE\\output.txt.txt");
	for(int b = 0; b < counter; b++){
	objWriter.write("\"" + newWords[b] + "\"," + " ");
	}

	System.out.println("We are done writing to the file sir ");
	objWriter.close();
	}

	catch(IOException e){
	System.out.println("We couldnt write to the file");
	e.printStackTrace();
	}

	}
}



