//Lab 2 - CSSSKL 143 
//Author: Athresh Kiran

public class ShapesPictureDriver {

	//precondition: assumes {Square and Picture} all exist in the same working directory
	//so complete those classes first and then test on this driver file

	public static void main(String[] args) {
		
		Square firstSquare = new Square();
		Square secondSquare = new Square(10,20);

		firstSquare.setX(3);
		firstSquare.setY(4);

		System.out.println( "Drawing the first square : " + firstSquare.toString());

		secondSquare.setSideLength(30);

		System.out.println( "Second square has area : " + secondSquare.getArea());
		System.out.println("First square has area : " + firstSquare.getArea());
		System.out.println("Are the squares equal? " + firstSqaure.equals(secondSquare));
		

		// Write your own Circle Tests for 2 circles (test for area, equals, toString, constructors, setters)


		// Create more squares and circles to test the ObjectList class
		// Create 3 more squares and circles 


		/* Uncomment for Picture Tests
		//now, lets see the bigger picture
		ObjectList picture = new ObjectList();

		picture.addSquare( firstSquare );
		picture.addSquare( secondSquare );
		picture.addCircle( firstCircle );
		picture.addCircle( secondCircle );

		// Add the remaining 3squares and circles to the picture

		System.out.println( "Drawing a Picture using ObjectList with Circles and Squares:\n" );

		System.out.println(picture.toString());
		*/

	}

}
