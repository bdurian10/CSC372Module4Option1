package csc372module4option1;

public class Sphere extends Shape {
	
	private double radius;
	
	public Sphere(double radius) {
		
		this.radius = radius;
		
	}
	//Formula for surface area of sphere:
	// 4 * PI * r^2
	public double surface_area() {
		
		return 4 * Math.PI * radius * radius;
		
	}
	
	//Formula for volume of sphere:
	// 4 / 3 * PI * r^3
	public double volume() {
		
		return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
		
	}
	
	public String toString() {
		//Create strings for each piece of the final string
		String sphere = "Sphere with radius: " + radius;
		String surfaceArea = "Surface Area: " + surface_area();
		String volume = "Volume: " + volume();
		//Combine above strings to return full string
		return sphere + "\n" + surfaceArea + "\n" + volume;
	}
	
	

}
