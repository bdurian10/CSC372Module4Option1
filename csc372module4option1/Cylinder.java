package csc372module4option1;

public class Cylinder extends Shape{
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		
		this.radius = radius;
		this.height = height;
		
	}
	
	public double surface_area() {
		
		//Formula for surface area of cylinder:
		//2PIr^2 + 2PIrh
		return 2.0 * radius * radius * Math.PI + 2.0 * Math.PI * radius * height;
	}
	
	public double volume() {
		
		//Formula for volume of cylinder:
		//PIr^2 * h
		return Math.PI * radius * radius * height;
	}
	
	public String toString() {
		//Create strings for each piece of the final string
		String cylinder = "Cylinder with radius: " + radius + "; height: " + height;
		String surfaceArea = "Surface Area: " + surface_area();
		String volume = "Volume: " + volume();
		//Combine above strings to return full string
		return cylinder + "\n" + surfaceArea + "\n" + volume;
	}

}
