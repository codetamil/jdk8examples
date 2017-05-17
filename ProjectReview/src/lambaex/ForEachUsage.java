package lambaex;

import java.util.ArrayList;
import java.util.List;

public class ForEachUsage {
	
	
	public static void main(String args[])
	{
		List names=new ArrayList();
		
		//Integer[] numbers= new Integer[]{23,45,56,12,67,89};
		
		
		names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      
	      names.forEach(System.out::println);
	      
	}

}
