package objectTutorial;

public class RectangularPrism {
	// data attributes
	private double length;
	private double width;
	private double height;
	static int dimensions = 3;
	
	public RectangularPrism(double l, double w, double h)
	{
		length = l;
		width = w;
		height = h;
	}
	public static String getShape()
	{
		return "Rectangular Prism:";
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	public double getVolume()
	{
		return length*width*height;
	}
	public double getSArea()
	{
		return 2*((width*length)+(height*length)+(height*width));
				//2(wl+hl+hw)
	}
}
