package samplejavaprogram;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String> var = new ArrayList<String>();
		var.add("60");
		var.add("20");
		var.add("60");
		var.add("Kamila");
		var.add("Tabish");
		var.add("Tabish");
		for(String a:var)
		{
			System.out.println(a);
		}

	}

}
