package streamsexamples;

public class Person {
	
	private Integer age;
	private String name;
    private Gender gender;
    
    public Person(Integer age,String name,Gender gender)
    {
    	this.age=age;
    	this.name=name;
    	this.gender=gender;
    }
	public Integer getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age+" "+name+" "+gender; 
	}
}
