
// Extending the abstract shape class
class Cylinder extends Shape {
	private double radius;
	private double height;
	
	// Constructor to initialize the cylinder with a given radius & height
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	// Calculate the surface area of a cylinder
	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
	
	@Override
	// Calculate the volume of a cylinder
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
	@Override
	// Returns a string representation of the cylinder, including surface area and volume
	public String toString() {
		return "Cylinder: \nSurface Area = " + surfaceArea() + "\nVolume = " + volume();
	}
}