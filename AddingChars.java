public class AddingChars{
	public static void main(String[] args){

	char a = 'a';
	char b = 'z';
	int c;

	c = a + b;
	System.out.println((char)(c));

	System.out.println((int) (b+'a'-'z'-1));
	}
}