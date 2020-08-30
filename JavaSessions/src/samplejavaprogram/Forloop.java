package samplejavaprogram;

public class Forloop {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
        for(int i=30;i<=50;i++)
        {
        	System.out.println(i);
        }
        for(int i=1;i<=20;i++)
        {
        	if(i%2==0)
        	{
        		System.out.println(i);
        	}else {
        		System.out.println("odd number");
        	}
        	
        }
	}

}
