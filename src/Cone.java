// Extending the abstract shape class
class Cone extends Shape {
	private double radius;
	private double height;
	
	// Constructor to initialize the cone with a given radius & height
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	// Calculate the surface area of a cone
	public double surfaceArea() {
		double slantHeight = Math.sqrt(radius * radius + height * height);
		return Math.PI * radius * (radius + slantHeight);
	}
	
	@Override
	// Calculate the volume of a cone
	public double volume() {
		return (Math.PI * radius * radius * height) / 3;
	}
	
	@Override 
	// Returns a string representation of the cone, including surface area and volume
	public String toString() {
		return "Cone: \nSurface Area = " + surfaceArea() + "\nVolumne = " + volume();
	}
}
