import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyRegEx{
	
	public static void main(String[] args){

	Pattern objPattern = Pattern.compile("benz", Pattern.CASE_INSENSITIVE);
	Matcher objMatch = objPattern.matcher("Mercedes benz is not very reliable");

	boolean answer = objMatch.find();

	System.out.println(answer);
	}
}