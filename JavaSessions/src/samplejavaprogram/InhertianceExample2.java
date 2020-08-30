package samplejavaprogram;

public class InhertianceExample2 extends InhertianceExample1 {
	int a = 10000;
	int b = a+bonus;
	

	public static void main(String[] args) {
		InhertianceExample2 exp2 = new InhertianceExample2();
		System.out.println(exp2.a);
		System.out.println(exp2.b);
		exp2.day();

	}

}
