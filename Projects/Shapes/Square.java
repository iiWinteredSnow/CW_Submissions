package objectTutorial;

public class Square {
	//data attributes
		private double side;
		static int dimensions = 2;
		
		public Square(double s)
		{
			side = s;
		}
		public double getArea()
		{
			return side*side;
		}
		public double getSide()
		{
			return side;
		}
		public static String getShape()
		{
			return "Square:";
		}
		public double getPerimeter() 
		{
			return side*4;
		}
		public String toString()
		{
			return "This is a square with a side length of "+side+" and an Area of "+getArea()+" and a perimeter of "+getPerimeter();
		}
		public void setSide(double side) {
			this.side = side;
		}
		
			
			
			
			
}
