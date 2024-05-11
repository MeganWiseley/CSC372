
// Extending the abstract shape class
class Sphere extends Shape {
	private double radius;
	
	// Constructor to initialize the sphere with a given radius
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override
	// Calculate the surface area of a sphere
	public double surfaceArea() {
		return 4 * Math.PI * radius *radius;
	}
	
	@Override
	// Calculate the volume of a sphere
	public double volume() {
		return (4 * Math.PI * Math.pow(radius,  3)) / 3;
	}
	
	@Override
	// Returns a string representation of the sphere, including surface area and volume
	public String toString() {
		return "Sephere: \nSurface Area = " + surfaceArea() + "\nVolume = " + volume();
	}
}