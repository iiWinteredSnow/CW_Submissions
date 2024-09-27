package objectTutorial;

public class Cylinder {
	//data attributes
		final double pi = 3.14159265;
		private double radius;
		private double height;
		static int dimensions = 3;
		
		public Cylinder(double r, double h)
		{
			radius = r;
			height = h;
		}
		public double getRadius() {
			return radius;
		}
		public double getHeight() {
			return height;
		}
		public static String getShape() {
			return "Cylinder: ";
		}
		public double getVolume() {
			return pi*radius*radius*height;
		}
		public double getSurfaceArea() {
			return (2*pi*radius*height)+(2*pi*radius*radius);
		}
		public double getDiameter() {
			return radius*2;
		}
		
		
		
		
		
		
}
