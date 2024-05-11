// Represents a driver class to demonstrate the usage of various shapes
public class ShapeArray {
	
	// Main method
	public static void main(String[] args) {
		// Creates instances of different shapes
		Sphere sphere = new Sphere(12);
		Cylinder cylinder = new Cylinder(9, 11);
		Cone cone = new Cone(14, 7);
		
		// Array to store the shapes
		Shape[] shapeArray = {sphere, cylinder, cone};
		
		// Iterate through the shapes 
		for (Shape shape : shapeArray) {
			
			// Print out the calculations of the shapes
			System.out.println(shape.toString());
			System.out.println();
		}
	}
}