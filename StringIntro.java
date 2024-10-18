package HelloWorld;
import java.util.Scanner;
public class StringIntro {

	public static void main(String[] args) {
		/*Complete the following tasks in a single class called StringIntro (with a main method):

Precondition: the scanned String will always be more than 6 characters long.

1. In the main method, instantiate a Scanner object and then instantiate a String object equal to a scanned input. Be sure to close the scanner at the bottom of your main method before testing any code. 

2. Make and test a void method printSecondAndLastLetter that will print the second character and last character in the passed String.  

3. Make and test a method findTheEthat returns the index of the first 'e' character in a passed String. 

4. Make and test a method getLength that returns the amount of characters (the length) of a passed String. 

5. Make and test a void method printFirstAndLastThree that is passed a string and prints the first three and last three characters in a passed String. 

Example input: "Creatures"

Example output:

The second letter is r and the last letter is s.

The first e occurs at index 2.

The String is 9 characters long.

The first three characters are Cre and the last three characters are res.*/
		Scanner myReader = new Scanner(System.in);	
		// allows for you to input characters in the console.
		String input = new String(myReader.next());
		// allows the word or phrase in the console to be used as an instance.
		printSecondAndLastLetter(input);
		System.out.println("the first e is located at index "+findTheE(input));
		System.out.println("the String is "+getLength(input)+" characters long");
		printFirstAndLastThree(input);
		
		
		myReader.close();
	}
	// method that prints the second and last letter of the input word.
	public static void printSecondAndLastLetter(String input)
	{
		
		char letter1 = input.charAt(1);
		char letter2 = input.charAt(input.length()-1);
		System.out.println("The second letter is "+letter1+ " and the last letter is "+letter2+".");
	}
	// i found the e
	public static int findTheE(String input)
	{
		return input.indexOf('e');
	}
	// method gets the length of the typed input word
	public static int getLength(String input)
	{
		 return input.length();
	}
	// method prints the first and last three letters of the input word.
	public static void printFirstAndLastThree(String input)
	{
		System.out.print("The first three letters are "+ input.substring(0, 3));
		System.out.print(", and the last three letters are "+ input.substring(input.length()-3));
	}

}
