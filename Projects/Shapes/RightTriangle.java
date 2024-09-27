package objectTutorial;

public class RightTriangle {
	private double oppo;
	private double adja;
	private double hyp;
	static int dimensions = 2;
	
	public RightTriangle(double opp, double adj) 
	{
		hyp = Math.sqrt((opp*opp)+(adj*adj));
		// a^2+b^2=c^2 uses pythagorean theorem to find hypotenuse
		oppo = opp;
		
		adja = adj;
	}
	public static String getShape() 
	{
		return "Right Triangle:";
	}
	public double getHyp()
	{
		return hyp;
	}
	public double getArea() 
	{
		return (oppo*adja)*.5;
		//formula for area on a right triangle: 1/2(b)(h)
	}
	public double getPerimeter()
	{
		return hyp+oppo+adja;
		// all sides added up is the perimeter
	}
	public double getOpp() 
	{
		return oppo;
	}
	public double getAdj()
	{
		return adja;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
