package streamsexamples;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		
		
		
		List<Integer> values=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			values.add(i);
		}
		
		System.out.println(values.stream().filter(i->i%2==4).findFirst().orElse(12));
		
		
		
		

	}

}
