import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		
		//Creating an ArrayList to store Student objects
		ArrayList<Student> students = new ArrayList<>();
		
		//Adding the student objects to the ArrayList
		students.add(new Student(101, "Amanada", "570 West Marshall"));
		students.add(new Student(102, "Kaitlan", "531 East Hazelhurst"));
		students.add(new Student(103, "Amber", "621 West Maplehurst"));
		students.add(new Student(104, "Kyle", "1300 Diamond Bar Boulevard"));
		students.add(new Student(105, "Mike", "4800 North Amelia Avenue"));
		students.add(new Student(106, "Janet", "1200 East Grand Avenue"));
		students.add(new Student(107, "Erick", "3600 Curtis Road"));
		students.add(new Student(108, "Marc", "170 North Claremont Boulevard"));
		students.add(new Student(109, "Ryan", "1370 Valley Vista Drive"));
		students.add(new Student(110, "Kevin", "2100 Glendora Avenue"));
		
		//Sorting the ArrayList by name using the SelectionSort method
		SelectionSort.selectionSort(students, new java.util.Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) { 
				return s1.name.compareTo(s2.name);
			}
		});
		//Printing the sorted list by student name
		System.out.println("Sorted by name: ");
		for (Student student : students) {
			System.out.println(student);
		}
		//Sorting the ArrayList by roll number using the SelectionSort method
		SelectionSort.selectionSort(students, new java.util.Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.rollNo - s2.rollNo;
			}
		});
		//Printing the sorted list by roll number
		System.out.println("\nSorted by rollNo:");
		for (Student student : students) {
			System.out.println(student);

		}
	}
}
