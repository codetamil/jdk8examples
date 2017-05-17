package streamsexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonList {
	
	
	public static List<Person> createPeople()
	{
		
		return Arrays.asList(
				new Person(23,"XXX",Gender.MALE),
				new Person(32,"YYY",Gender.MALE),
				new Person(24,"ZZZ",Gender.FEMALE),
				new Person(42,"AAA",Gender.MALE),
				new Person(17,"PPP",Gender.MALE)
				
				
				);
		
		
		
	}
	
	public static void main(String args[])
	{
		List<Person> people= createPeople();
		
		//Normal ways
		List<String> names=new ArrayList<>();
		
		for(Person person:people)
		{
			if(person.getAge()>18){
				names.add(person.getName().toUpperCase());
			}
		}
		System.out.println("Normal ways "+names);
		
		//Streams in java8
		List<String> names2=people.stream()
				            .filter(person -> person.getAge() > 18)
				            .map(person ->person.getName())
				            .map(name -> name.toUpperCase()).collect(Collectors.toList());
				            
				            System.out.println("Streams "+names2);
				     
				            //This expression will return all names who are MALE
				            
				   people.stream().filter(person -> person.getGender()== Gender.MALE)
				   .forEach(System.out::println);
				   
				   //sum of all ages
				   
				   System.out.println("Sum of all ages "+people.stream().mapToInt(Person::getAge).sum());
				   
				   //Count the persons less than 18
				   
				   System.out.println("Persons age less than 18 "+people.stream().filter(person -> person.getAge() < 18).count());
				            
				            
	}

	

}
