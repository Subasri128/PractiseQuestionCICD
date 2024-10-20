package javabasicprograms;

public class ConstructorExample {

	String name;
	int age;
	String location;
	String city;

	public ConstructorExample(String name, int age, String location, String city) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.city = city;
	}

	public String detailname() {
		return name;
	}

	public int detailage() {
		return age;
	}

	public String detaillocation() {
		return location;
	}

	public String detailcity() {
		return city;
	}
	
	public String stringversion() {
		return("name" +this.detailname()+","+ "age"+this.detailage()+" "+" location"+ this.detaillocation()+" "+"city"+this.detailcity());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample person = new ConstructorExample("Alexa", 23, "Chennai", "Trichy");
		System.out.println(person.stringversion());

	}

}
