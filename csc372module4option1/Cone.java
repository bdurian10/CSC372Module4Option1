package csc372module4option1;

public class Cone extends Shape{
	
	private double radius;
	private double height;
	
	//Parameterized constructor to set radius and height
	public Cone(double radius, double height) {
		
		this.radius = radius;
		this.height = height;
	}
	
	//Formula for surface area of cone:
	// PI * radius * (r + Sqrt(r^2 + h^2))
	public double surface_area() {
		
		return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
	}
	
	//Formula for volume of Cone:
	// PI * r^2 * h/3
	public double volume() {
		
		return Math.PI * radius * radius * height / 3.0;
	}
	
	public String toString() {
		//Create strings for each piece of the final string
		String cone = "Cone with radius: " + radius + "; height: " + height;
		String surfaceArea = "Surface Area: " + surface_area();
		String volume = "Volume: " + volume();
		//Combine above strings to return full string
		return cone + "\n" + surfaceArea + "\n" + volume;
	}

}
