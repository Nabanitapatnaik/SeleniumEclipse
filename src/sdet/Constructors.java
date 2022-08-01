package sdet;

public class Constructors {

	String name;
	//No Arguments
	/*public Constructors()
	
	{
		name = "Apple";
		
		
	}*/
//Parameterized
public Constructors(String Fruits)
	
	{
		name=Fruits;
		System.out.println(name);
	
		
	}
	
	public static void main(String[] args) {
		//Constructors con = new Constructors();
		//System.out.println(con.name);
		Constructors con = new Constructors("Banana");
}
}