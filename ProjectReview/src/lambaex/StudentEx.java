package lambaex;

import java.util.ArrayList;
import java.util.List;

public class StudentEx  {
	
	public static void main(String args[])
	{
		Student ss= new Student();
		
		ss.setEmail("one@gmail.com");
		ss.setName("one");
		ss.setRoll_no(220);
		
		
		System.out.println(ss.debug());
		
		new Thread(new Runnable()
				{

					@Override
					public void run() {
						
						System.out.println("I am a Thread");
						
					}
		
			
				}).start();
		
		
		new Thread(
				
			
			()->{
				System.out.println("I am thread with the lambda syntax");
			
			}).start();
	
		
		
		
		List<String> pointList = new ArrayList();
		pointList.add("1");
		pointList.add("2");
		pointList.add("3");
		
		
		pointList.forEach(i->{System.out.println(i);});
		
				}
				
				
				
	}


