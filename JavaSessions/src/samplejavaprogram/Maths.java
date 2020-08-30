package samplejavaprogram;

public class Maths {
	
void add() {
	int a = 60;
	int b = 70;
	int c = a + b;
	System.out.println(c);
}
void sub() {
	 int a =40;
	 int b= 50;
	 int c= a-b;
	 System.out.println(c);
}
void mul() {
	 int a = 60;
	 int b= 10;
	 int c = a*b;
	 System.out.println(c);
}
	public static void main(String[] args) {
	System.out.println("today is tuesday");	
	Maths mat=new Maths();
	mat.add();
	mat.sub();
	mat.mul();
	mat.add();

	}

}
