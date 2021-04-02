import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CorrectDate{
	
	public static void main(String[] args){

	LocalDateTime dateNow = LocalDateTime.now();

	System.out.println(dateNow);

	DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");

	String CorrectDate = dateNow.format(formatDate);

	System.out.println(CorrectDate);


	}
}