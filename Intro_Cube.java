
public class Intro_Cube {

	public static void main(String[] args) {
		double slength = 3.1415;
		double sarea = 6*slength*slength;
		double vol = slength*slength*slength;
		/* declares the side length as an double and
		 declares the formulas for the surface area and volume of a cube */
		System.out.print("The sidelength of the cube is " + (int)slength + ", its "
				+ "volume is " + (int)vol + " and its surface area is " + (int)sarea + ".");
		/* calculates volume and surface area through calling the 
		variables and prints them in a sentence. Also turns all variables into an int */
		// Inputting 6 as a side length makes the volume = surface area.
	}

}
