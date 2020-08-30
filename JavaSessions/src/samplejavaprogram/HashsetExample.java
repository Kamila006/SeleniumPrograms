package samplejavaprogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		Set <String> var = new HashSet<String>();
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
