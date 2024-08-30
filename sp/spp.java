
public class Intro_Sphere {

	public static void main(String[] args) {
		double r = 6;
		final double pi = 3.14159265;
		double sarea = 4*pi*r*r;
		double vol = (4/3)*pi*r*r*r;
		/* declares the radius as an double and pi
		 declares the formulas for the surface area and volume of a sphere */
		System.out.print("The radius of the sphere is " +(int)r+ ", its "
				+ "volume is " + (int)vol + " and its surface area is " + (int)sarea + ".");
		/* calculates volume and surface area of the sphere through calling the 
		variables and prints them in a sentence. Also turns all variables into an int */
		
	}

}
