package csc372module4option1;

public class ShapeArray {
	
	public static void main(String[] args) {
		
		//Instantiate classes for testing
		Sphere sphere = new Sphere(5);
		Cylinder cylinder = new Cylinder(5, 5);
		Cone cone = new Cone(5, 5);
		
		//Create shape array to store instantiated shapes
		Shape[] shapesArray = {sphere, cylinder, cone};
		
		for(Shape shape : shapesArray) {
			
			System.out.println(shape.toString() + "\n");
			
		}
		
	}

}
