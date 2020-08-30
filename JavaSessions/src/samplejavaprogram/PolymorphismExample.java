package samplejavaprogram;

public class PolymorphismExample {
	void info()
	{
		System.out.println("today is thursday");
	}
	void info(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		PolymorphismExample poly = new PolymorphismExample();
		poly.info();
		poly.info("Kamila");
		

	}

}
