import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//StudentDataEntry class is used to collect student data from the user
public class StudentDataEntry {
	public static void main(String[] args) {
		//Using a LinkedList to store the student objects
		LinkedList<Student> students = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		boolean moreData = true;
		
		//Using a while loop to gather the student data from the user, until to user decides to stop
		while (moreData) {
			String name = "";
			//Another while loop used to ensure data is entered and not left blank
			while (true) {
				System.out.print("Enter Student's Name: ");
				name = scanner.nextLine();
				if (name.trim().isEmpty()) {
					System.out.println("Name Field Cannot be Left Empty. Enter a Student's Name.");
				} else {
					break;
				}
			}
			//Another while loop used to ensure data is entered and not left blank
			String address = "";
			while (true) {
				System.out.print("Enter Student's Address: ");
				address = scanner.nextLine();
				if (address.trim().isEmpty()) {
					System.out.println("Address Field Cannot be Left Empty. Enter a Valid Student's Address.");
				} else {
					break;
				}
			}
			//Another while loop used to ensure data is entered and not left blank
			double GPA = 0;
			while (true) {
				System.out.print("Enter Student's GPA: ");
				String gpaInput = scanner.nextLine();
				try {
					GPA = Double.parseDouble(gpaInput);
					if (GPA < 0.0 || GPA > 4.0) {
						System.out.println("Enter Student's GPA Between 0.0 & 4.0");
					} else {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid GPA Input. Try Again with a Numeric Value.");
				}
			}
			//Adding the new students to the list
			students.add(new Student(name, address, GPA));
			
			//Asking the user if more students need to be added, if yes the loop continues, if no the loop ends and text file is created
			System.out.println("Do You Want to Add Another Student? (Enter Yes or No): ");
			String response = scanner.nextLine();
			if (response.equalsIgnoreCase("No")) {
				moreData = false;
			}
		}
		//Closing scanner
		scanner.close();
		
		//Sorting the list by student name
		students.sort(null);
		
		//Writing the list that is sorted to a data file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
			ListIterator<Student> iterator = students.listIterator();
			while (iterator.hasNext()) {
				writer.write(iterator.next().toString());
				writer.newLine();
			}
			System.out.println("Student Data Has Been Written to File, students.txt");
		} catch (IOException e) {
			System.err.println("Error Writing to File: " + e.getMessage());
		}
	}

}
