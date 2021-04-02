abstract class Abstract{

  public abstract int study(int a, int b); // abstract method

}

 class Student extends Abstract{

  public int study(int a, int b) { // the body of the abstract method is provided here

    int ans;
    ans = a + b;

    return(ans);

	}
}