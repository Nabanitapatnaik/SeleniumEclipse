package sdet;

public class Variables {
	String name;  //Instance variable
	static String title;//Class variable
	

//Local variables

	public void local()

	{
		int a=5;
		System.out.println(a);

	}
	
	
	

	public static void main(String[] args) {
		Variables var = new Variables();
		var.local();
		var.name = "Apple";
System.out.println(var.name);
		var.title = "Ripe";
		System.out.println(var.title);	
	}

}
