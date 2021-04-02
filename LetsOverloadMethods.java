public class LetsOverloadMethods{


static int Add(int x, int y){

return (x + y);
	

}

static float Add(float a, float b){

return (a + b);
	

}

static double Add(double l, double m){

return (l + m);
	

}
	
	public static void main(String[] args){

	int c, d, ans;
	float  e, f, ansF;
	double g, h, ansD;

	c = 8; //int numbers
	d = 8;

	e = 5.2345f; //float numbers
	f = 8.4321f;

	g = 2.234234121212121; // numbers of type double
	h = 5.234234121212121;

	System.out.println("Lets add some ints ");
	ans = Add(c, d);
	System.out.println("8 plus 8 is: " + ans);

	System.out.println("Lets add some float numbers ");
	ansF = Add(e, f);
	System.out.println("5.2345 plus 8.4321 is: " + ansF);

	System.out.println("Lets add some double type numbers ");
	ansD = Add(g, h);
	System.out.println("2.234234121212121 plus 5.234234121212121 is: " + ansD);

	}
}