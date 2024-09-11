
public class methodsIntro {

	public static void main(String[] args) {
		/*1. Create a void method called stateName() that prints out your name. Repeat this task for stateEyeColor(), stateHairStyle(), 
		 * stateBestFriend(), and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().

		2. Create a void method printCircleStats() that is passed a double (meant to represent a circle's radius) 
			and calculates then prints out the radius, diameter, circumference, and area of the circle. Call the method to make sure it works. 

		3. Create a void method printMathStuffs() that is passed two ints and prints their sum, 
			difference, product, quotient, and the remainder (using modulus) of the first number modulus the second number. Call it to make sure it works. */
		
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(2);
		
	}
	public static void stateName() {
		System.out.print("Jaythan Bucasas, ");
	}
	public static void stateEyeColor() {
		System.out.print("Black eyes, ");
	}
	public static void stateHairStyle() {
		System.out.print("high fade, ");
	}
	public static void stateBestFriend() {
		System.out.print("The voices inside my head, ");
	}
	public static void stateFavoriteFood() {
		System.out.print("Alfredo Pasta, ");
	}
	public static void printCircleStats(double radius) {
		final double pi = 3.14159265;
		double diameter = 2*radius;
		double circumference = 2*pi*radius;
		double carea = pi*(radius*radius);
		System.out.println();
		System.out.println();
		System.out.println("Circle Stats:");
		System.out.println("radius of this circle is "+radius+".");
		System.out.println("diameter of this circle is "+diameter+".");
		System.out.println("circumference of this circle is "+circumference+".");
		System.out.println("area of this circle is "+carea+".");
	}
	
	public static void printMathStuffs() {
		
	}
	
}
