public class methodsIntro {

	public static void main(String[] args) {
		/*1. Create a void method called stateName() that prints out your name. Repeat this task for stateEyeColor(), stateHairStyle(), 
		 * stateBestFriend(), and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().

		2. Create a void method printCircleStats() that is passed a double (meant to represent a circle's radius) 
			and calculates then prints out the radius, diameter, circumference, and area of the circle. Call the method to make sure it works. 

		3. Create a void method printMathStuffs() that is passed two ints and prints their sum, 
			difference, product, quotient, and the remainder (using modulus) of the first number modulus the second number. Call it to make sure it works. */
		
		System.out.print(stateName());
		System.out.print(stateHairStyle());
		System.out.println(stateFavoriteFood());
		double radius = 3;
		System.out.println("radius of this circle is "+radius+".");
		System.out.println("diameter of this circle is "+diameter(radius)+".");
		System.out.println("circumference of this circle is "+circumference(radius)+".");
		System.out.println("area of this circle is "+carea(radius)+".");
		System.out.print(printMathStuffs(4, 2));

	
		
	}
	public static String stateName() {
		return("Jaythan Bucasas, ");
	}
	public static String stateEyeColor() {
		return("Black eyes, ");
	}
	public static String stateHairStyle() {
		return("high fade, ");
	}
	public static String stateBestFriend() {
		return("The voices inside my head, ");
	}
	public static String stateFavoriteFood() {
		return("Alfredo Pasta, ");
	}
	public static String  printCircleStats(double radius) {
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
	
	public static int printMathStuffs(int num1, int num2) {
		int diff = num1-num2;
		int sum = num1+num2;
		int prod = num1*num2;
		int quo = num1/num2;
		int mod = num1%num2;
		
		
		
		
		System.out.println();
		System.out.println(diff);
		System.out.println(sum);
		System.out.println(prod);
		System.out.println(quo);
		System.out.println(mod);
	}
	public static double diameter(double radius) {
		double diameter = radius*2;
		return diameter;
	}
	public static double circumference(double radius) {
		final double pi = 3.14159265;
		double circumference = 2*pi*radius;
		return circumference;
		
	}
	public static double carea(double radius) {
		final double pi = 3.14159265;
		double carea = pi*(radius*radius);
		return carea;
		
	}
}
