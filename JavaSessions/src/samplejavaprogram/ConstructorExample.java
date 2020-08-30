package samplejavaprogram;

public class ConstructorExample {
	void Car()
	{
		System.out.println("Innova");
	}
	ConstructorExample()
	{
		int a=100;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		ConstructorExample con = new ConstructorExample();
		con.Car();
	}

}
