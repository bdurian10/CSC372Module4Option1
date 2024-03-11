package csc372module4option1;

public class Circle extends Shape{
	//Declare variable for radius
	private double radius;
	
	//Parameterized constructor sets radius
	public Circle( double raduis) {
		
		this.radius = raduis;
		
	}
	
	public double surface_area() {
		
		return Math.PI * radius * radius;
		
	}
	//Volume of a 2D shape is 0
	public double volume() {
		
		return 0;
	}
	
	public String toString() {
		
		return "Circle with radius: " + radius + "\nSurface Area: " + surface_area() + "\nVolume: " + volume();
		
	}

}
