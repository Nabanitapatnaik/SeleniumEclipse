package sdet;

public class ClassA extends Variables {
	
	
		int a=10;
		int b=20;
		int c;
		
	public void m1() 
	{
		 c = a+b;
		 System.out.println(c);
		
	}

		
		
		
	
	

	
	

	public static void main(String[] args) {
		ClassA an = new ClassA();
	 an.local();
	 an.m1();
		
	}

}
