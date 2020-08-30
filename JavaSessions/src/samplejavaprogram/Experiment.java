package samplejavaprogram;

public class Experiment {
	
	void today()
	{
		System.out.println("today is wednesday");
	}
 public int add(int a1,int a2)
 {
	 int c=a1+a2;
	 return c;
 }
 public int sub(int b1,int b2)
 {
	 int d=b1-b2;
	 return d;
 }
 
	public static void main(String[] args) {
		Experiment exp= new Experiment();
		exp.today();
		int result = exp.add(10, 20);
		System.out.println(result);
		int fin= exp.sub(50, 70);
		System.out.println(fin);
		

	}

}
