package objectTutorial;

public class Circle {
	//data attributes
		final double pi = 3.14159265;
		private double radius;
		static int dimensions = 2;
		
		public Circle(double r) {
			radius  = r;
			
		}
	// functionality
		public double getRadius() {
			return radius;
		}
		public static String getShape() {
			return "Circle:";
		}
		public double getDiameter() {
			return radius*2;
		}
		public double getArea()
		{
			return pi*radius*radius;
		}
		public double getCircumference()
		{
			return 2*pi*radius;
		}
		public void setRadius(double r) 
		{
			radius=r;
		}
}
