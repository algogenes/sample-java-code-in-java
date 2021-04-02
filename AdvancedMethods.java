public class AdvancedMethods{

static int Add(int x, int y){
	
	return (x + y);

}

static int Subtract(int a, int b){
	
	return (a - b);

}

static int Multiply(int c, int d){
	
	return (c * d);

}

static int Divide(int e, int f){
	
	return (e/f);
}
	

	public static void main(String[] args){

	int g, h, ans, k, l, m, n, o, p;

	g = 3;// add
	h = 4;

	k = 7;// minus
	l = 2;

	m = 5;//multiply
	n = 5;

	o = 144;// divide
	p = 12;
	
	ans = Add(g, h); 

	System.out.println("3 plus 4 equals " + ans );

	ans = Subtract(k, l); 

	System.out.println("7 minus 2 equals " + ans );

	ans = Multiply(m, n); 

	System.out.println("5 times 5 equals " + ans );

	ans = Divide(o, p); 

	System.out.println("144 divide 12 equals " + ans );



	}
}