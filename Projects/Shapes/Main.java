package objectTutorial;

public class Main {

	public static void main(String[] args) {
		
	// 1st triangle
		RightTriangle triOne = new RightTriangle(5.0, 6.0);
		/*declares a new right triangle and its variables a and b in a Pythagorean theorem, or the 
		opposite and adjacent sides of a non-right angle on 
		the triangle in the order: (Opp, Adj) */
		int rt = 0;
		rt++;
		// stores  number classification of each shape and adds everytime each shape is made.
		System.out.println(RightTriangle.getShape()+" #"+rt);
		// calls and prints shape type and number classification of shape using recent  declared variable
		System.out.println("Area: "+triOne.getArea());
		// calculates area of a right triangle and prints the result.
		System.out.println("Opposite Side: "+triOne.getOpp());
		//prints the declared "Opp" side.
		System.out.println("Adjacent Side: "+triOne.getAdj());
		//prints the declared "Adj" side.
		System.out.println("Hypotenuse: "+triOne.getHyp());
		// calculates hypotenuse of a right triangle and prints the result.
		System.out.println("Perimeter: "+triOne.getPerimeter());
		// calculates perimeter of a right triangle and prints the result.
		System.out.println();
		
	// 2nd triangle 
		RightTriangle triTwo = new RightTriangle(33.0, 12.0);
		rt++;
		System.out.println(RightTriangle.getShape()+" #"+rt);
		System.out.println("Area: "+triTwo.getArea());
		System.out.println("Opposite Side: "+triTwo.getOpp());
		System.out.println("Adjacent Side: "+triTwo.getAdj());
		System.out.println("Hypotenuse: "+triTwo.getHyp());
		System.out.println("Perimeter: "+triTwo.getPerimeter());
		System.out.println();
		
	// 3rd triangle
		RightTriangle triThree = new RightTriangle(67.0, 8.4);
		rt++;
		System.out.println(RightTriangle.getShape()+" #"+rt);
		System.out.println("Area: "+triThree.getArea());
		System.out.println("Opposite Side: "+triThree.getOpp());
		System.out.println("Adjacent Side: "+triThree.getAdj());
		System.out.println("Hypotenuse: "+triThree.getHyp());
		System.out.println("Perimeter: "+triThree.getPerimeter());
		System.out.println();
		
	// 1st Cylinder
		Cylinder pipe1 = new Cylinder(4, 12);
		int cy = 0;
		cy++;
		System.out.println(Cylinder.getShape()+" #"+cy);
		System.out.println("Radius: "+pipe1.getRadius());
		System.out.println("Height: "+pipe1.getHeight());
		System.out.println("Diameter: "+pipe1.getDiameter());
		System.out.println("Surface Area: "+pipe1.getSurfaceArea());
		System.out.println("Volume: "+pipe1.getVolume());
		System.out.println();
		
	// 2nd Cylinder
		Cylinder pipe2 = new Cylinder(6, 3);
		cy++;
		System.out.println(Cylinder.getShape()+" #"+cy);
		System.out.println("Radius: "+pipe2.getRadius());
		System.out.println("Height: "+pipe2.getHeight());
		System.out.println("Diameter: "+pipe2.getDiameter());
		System.out.println("Surface Area: "+pipe2.getSurfaceArea());
		System.out.println("Volume: "+pipe2.getVolume());
		System.out.println();
		
	// 3rd Cylinder
		Cylinder pipe3 = new Cylinder(4.2, 2.4);
		cy++;
		System.out.println(Cylinder.getShape()+" #"+cy);
		System.out.println("Radius: "+pipe3.getRadius());
		System.out.println("Height: "+pipe3.getHeight());
		System.out.println("Diameter: "+pipe3.getDiameter());
		System.out.println("Surface Area: "+pipe3.getSurfaceArea());
		System.out.println("Volume: "+pipe3.getVolume());
		System.out.println();
		
	// 1st Square
		Square sq1 = new Square(2);
		int sq = 0;
		sq++;
		System.out.println(Square.getShape()+" #"+sq);
		System.out.println("Side Length: "+ sq1.getSide());
		System.out.println("Area: "+sq1.getArea());
		System.out.println("Perimeter: "+sq1.getPerimeter());
		System.out.println();
		
	// 2nd Square
		Square sq2 = new Square(3.3);
		sq++;
		System.out.println(Square.getShape()+" #"+sq);
		System.out.println("Side Length: "+ sq2.getSide());
		System.out.println("Area: "+sq2.getArea());
		System.out.println("Perimeter: "+sq2.getPerimeter());
		System.out.println();
		
	// 3rd Square
		Square sq3 = new Square(24);
		 
		sq++;
		System.out.println(Square.getShape()+" #"+sq);
		System.out.println(sq3.toString());
	// this wouldve saved me so much time
		System.out.println();
		
	// 1st Rectangular Prism
		RectangularPrism rp1 = new RectangularPrism(1,2,3);
		int rp = 0;
		rp++;
		System.out.println(RectangularPrism.getShape()+" #"+rp);
		System.out.println("Length: "+rp1.getLength());
		System.out.println("Width: "+rp1.getWidth());
		System.out.println("Height: "+rp1.getHeight());
		System.out.println("Volume: "+rp1.getVolume());
		System.out.println("Surface Area: "+rp1.getSArea());
		System.out.println();
		
	// 2nd Rectangular Prism
		RectangularPrism rp2 = new RectangularPrism(5,9,7);
		rp++;
		System.out.println(RectangularPrism.getShape()+" #"+rp);
		System.out.println("Length: "+rp2.getLength());
		System.out.println("Width: "+rp2.getWidth());
		System.out.println("Height: "+rp2.getHeight());
		System.out.println("Volume: "+rp2.getVolume());
		System.out.println("Surface Area: "+rp2.getSArea());
		System.out.println();
		
	// 3rd Rectangular Prism
		RectangularPrism rp3 = new RectangularPrism(1.4,9,12);
		rp++;
		System.out.println(RectangularPrism.getShape()+" #"+rp);
		System.out.println("Length: "+rp3.getLength());
		System.out.println("Width: "+rp3.getWidth());
		System.out.println("Height: "+rp3.getHeight());
		System.out.println("Volume: "+rp3.getVolume());
		System.out.println("Surface Area: "+rp3.getSArea());
		System.out.println();
				
				
				
				
				
				
				
	// 1st circle		
		Circle c1 = new Circle(3.0);
		int cir = 0;
		cir++;
		System.out.println(Circle.getShape()+" #"+cir);
		System.out.println("Radius: "+c1.getRadius());
		System.out.println("Diameter: "+c1.getDiameter());
		System.out.println("Circumference: "+c1.getCircumference());
		System.out.println("Area: "+c1.getArea());
		System.out.println();
		
	// 2nd circle
		Circle c2 = new Circle(20.0);
		cir++;
		System.out.println(Circle.getShape()+" #"+cir);
		System.out.println("Radius: "+c2.getRadius());
		System.out.println("Diameter: "+c2.getDiameter());
		System.out.println("Circumference: "+c2.getCircumference());
		System.out.println("Area: "+c2.getArea());
		System.out.println();		
		
	// 3rd circle
		Circle c3 = new Circle(-4.0);
		cir++;
		System.out.println(Circle.getShape()+" #"+cir);
		System.out.println("Radius: "+c3.getRadius());
		System.out.println("Diameter: "+c3.getDiameter());
		System.out.println("Circumference: "+c3.getCircumference());
		System.out.println("Area: "+c3.getArea());
		System.out.println();			
		
				
		//System.out.println(Circle.getShape());  // this will be an error.
	}

}
