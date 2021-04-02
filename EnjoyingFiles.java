import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EnjoyingFiles{
	
	public static void main(String[] args){

	File myFile = new File("E:\\TestFiles\\MINE\\input.txt");

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
	long myDate = myFile.lastModified();
	String newDate = sdf.format(myDate);

	System.out.println("File was last modified on " + newDate);

	System.out.println("Last Modified Date: " + sdf.format(myFile.lastModified()));
	}
}