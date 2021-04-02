import java.io.File;
import java.io.IOException;

public class WorkingFiles{
	
	public static void main(String[] args){
	File objFile = new File("E:\\TestFiles\\FirstFile.txt");
	try{
objFile.createNewFile();
if(objFile.exists()){
System.out.println("The name of the file is " +objFile.getName());
System.out.println("The file path is " + objFile.getAbsolutePath());
}

else{
System.out.println("Couldnt get file name, check why");
}

}
catch(IOException e){
System.out.println("Something went wrong, File wasnt created");
e.printStackTrace();
}

	}
}

