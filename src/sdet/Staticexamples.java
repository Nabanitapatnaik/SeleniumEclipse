package sdet;

public class Staticexamples {
static int a;
public static void m1()
{
	a=10;
	System.out.println(a);
	int b=12;
	System.out.println(b);
}
public void m2()	
{
	int p=100;
	System.out.println(p);
	int q=120;
	System.out.println(q);
}
	

	
	
	
	
	
	
	public static void main(String[] args) {
		Staticexamples.m1();
		//Staticexamples.m2();//cant access nonstatic methods
		
		Staticexamples exa = new Staticexamples();
		exa.m2();

	}

}
