import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoreRegex {
  public static void main(String args[]) throws Exception {
    String duplicatePattern = "\\b(\\w+) \\1\\b";
    Pattern p = Pattern.compile(duplicatePattern);
    
    int matches = 0;
    String phrase = "Hello hello Hello there there past pastures ";
    Matcher m = p.matcher(phrase);
    String val = null;
    while (m.find()) {
      val = ":" + m.group() + ":";
      System.out.println(val);
      matches++;
    }
  }
}