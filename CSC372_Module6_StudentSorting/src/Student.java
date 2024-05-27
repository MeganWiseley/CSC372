
public class Student {
	// Instance variables to store the roll number, name and address
	int rollNo;
	String name;
	String address;
	
	//Constructor to initialize the Student object with the given information
	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	//This method is automatically called within the Main.java portion
	@Override
	public String toString() {
		return "Student{" +
				"rollNo=" + rollNo +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}

}
