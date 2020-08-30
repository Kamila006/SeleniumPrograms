package samplejavaprogram;

public class Samplemaths {
	void div() {
		int x=50;
		int y=100;
		int z=x/y;
		System.out.println(z);

	}
	void mod() {
		int x=100;
		int y=70;
		int z=x%y;
		System.out.println(z);
	}
	void add() {
		int K=60;
		int l=60;
		int m=K+l;
		System.out.println(m);
	}

	public static void main(String[] args) {
		Samplemaths sample = new Samplemaths();
		sample.div();
		sample.mod();
		sample.add();

	}

}
