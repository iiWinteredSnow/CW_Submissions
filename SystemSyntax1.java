//  8/19/24
// Complete each of the following problems without any online aid.


/* Task 1: Print out your name using the letter "O" in ASCII art.

Example output:

OOOOO    OO   OOOOO   OO    OO
  O     O  O  O         O  O
  O     O  O  OOO        OO
O O     O  O  O          OO
 O       OO   OOOOO      OO 
 */
package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// pain
		System.out.println("     O     OOO    O   O  OOOOO  O   O     OOO    O   O");
		System.out.println("     O    O   O    O O     O    O   O    O   O   OO  O");
		System.out.println("     O   OOOOO     O      O    OOOOO   OOOOO   O O O");
		System.out.println("O    O  O     O    O      O    O   O  O     O  O  OO");
		System.out.print(" OOO   O     O    O      O    O   O  O     O  O   O");
		
	}

}

/*
     O     OOO    O   O  OOOOO  O   O     OOO    O   O
     O    O   O    O O     O    O   O    O   O   OO  O
     O   OOOOO     O      O    OOOOO   OOOOO   O O O
O    O  O     O    O      O    O   O  O     O  O  OO
 OOO   O     O    O      O    O   O  O     O  O   O
*/

/* Task 2: Write code to compute the following math problem:

6.0 x 3.5 - 1.5 x 5
-------------------
    55.6 - 30.2

Example output:

0.531496062992126 */
package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// Math inside!
	System.out.print((6.0 * 3.5 - 1.5 * 5)/(55.6 - 30.2));
		//  = 0.5314960629921259
	}

}


/* Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. (Hint: the value of pi is 3.1519 and it never changes)

Example output: 

The circumference of the circle is 25.2152 and the area of the circle is 50.4304. */

package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
	//declares the radius as a variable
		int radius = 4;
	//uses variable into code, and prints what the circumference and area of the circle is based on radius
	System.out.print("The circumference of a circle is " + 3.1415 * 2 * radius + " and the area of a circle is " + 3.1415 * radius * radius + "." );
    // The circumference of a circle is 25.132 and the area of a circle is 50.264.
	}

}



