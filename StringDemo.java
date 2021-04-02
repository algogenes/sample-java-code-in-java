import java.io.*;
public class StringDemo {

   public static void main(String args[]) {

   		boolean check;
      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      char[] hello = new char[13];
      String comeOn = "";
      String myName = "Nyenje Simon Peter";
      String name2;
      String Str1 = new String("Welcome to Tutorialspoint.com");
      String Str3 = new String("   Welcome    to    Tutorialspoint.com   ");
      String helloString = new String(helloArray);  
      System.out.println( helloString );

           myName = myName.replaceAll("e", "o");

      System.out.println(myName);

      //check = helloArray.isLetter();
      //System.out.println(check);


/*   */

System.out.println("Before copying comeOn is " + comeOn);
      comeOn = comeOn.copyValueOf(helloArray);
      System.out.println("After copying comeOn is " + comeOn);

      System.out.println(comeOn.endsWith("o."));

      System.out.println(myName.equals(comeOn));

      try
      { 
      	Str1.getChars(8, 9, hello, 0);
      	myName = new String(hello);
      	System.out.println(myName);
      	System.out.println("My code up");

      }
      catch(Exception ex)
      { 
      	System.out.println("We got an error copying sir");
      }

      try {
         Str1.getChars(2, 9, hello, 0);
         System.out.print("Copied Value = " );
         System.out.println(hello);
      } catch ( Exception ex) {
         System.out.println("Raised exception...");
      }

      System.out.println(Str1.indexOf("c"));

      System.out.println(Str3.trim());


      







   }
}