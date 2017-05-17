package comparingobjects;

import java.util.Arrays;

import functionalInterfaces.FuncInterface;
import functionalInterfaces.LoginInterface;
import functionalInterfaces.MyfirstFunctionalInterface;



public class CheckEquality {

	public static void main(String[] args) {
		Employee[] employee={new Employee("David"),new Employee("XXXX"),new Employee("YYYY")};
		
		
		System.out.println("   "+Arrays.toString(employee));
		
		
		Arrays.sort(employee,Employee::nameCompare);
		
		MyfirstFunctionalInterface myfirstfunction=()->{
			
			System.out.println("Do this job");
			
		};
		
		myfirstfunction.dofirstWork();
		
	FuncInterface result	=()-> 1000.89;
	
	
	System.out.println(result.checkBalance());
	
	
	
	LoginInterface login =(x,y)->x*y;
		
		System.out.println(login.add(23, 45));

	}

	

}
