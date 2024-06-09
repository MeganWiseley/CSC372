//Student class representing student name, address and GPA. Implementing the Comparable interface to sorting purposes 
public class Student implements Comparable<Student> {
	//Private fields to store the name, address and gpa
	private String name;
	private String address; 
	private double GPA;
	
	//Constructor to initialize a new student object
	public Student(String name, String address, double GPA) {
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	
	//The following three items, gets the requested information and returns that information back
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	//Compares this student with another student to order by name
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	
	//Returns a string representation of the student 
	@Override
	public String toString() {
		return "Name: " + name + ", Address: " + address + ", GPA: " + GPA;
	}
		
}
