import java.io.File;
//import java.io.IOException;

public class DeletingFiles{
	
	public static void main(String[] args){

	//try{

File objFile = new File("E:\\TestFiles\\FirstFile.txt");

if(objFile.exists()){
	objFile.delete();
	System.out.println("The file has been deleted sir ");
}
else{
System.out.println("We couldnt find the file sir ");
}
	
//}

/*catch(IOException e){
	System.out.println("We have failed to delete the file sir ");
	e.printStackTrace();

}*/

	}
}

