/**
 * This class explains what String objects are and demonstrates the methods
 * in the String class you need to know for the AP Exam. 
 * 
 * Strings can be thought of as a series of characters and each part is treated like 
 * a letter. For example, a String could be assigned a value of "ABC!@#123" 
 * or "ABCDEF" or even "123".
 * 
 * @author josephtrauger
 */
public class StringMethods 
{

	public static void main(String[] args) 
	{
		
		//since a String is a reference data type, meaning it has its own class,
		//we must call its constructor to build a new String object
		String myName = new String("MrTrauger");
		
		//you can actually instantiate a String object 
		//the same way you declare a primitive data type. don't do this,
		//but know that on AP Questions, it could show up
		String myOtherName = "MrTrauger";
		
		/**
		 * Now let's cover some methods. You must know the following methods:
		 * length, substring, indexOf, charAt, equals, and compareTo. 
		 */
		
		//the length method returns how many characters are in the String, including spaces
		int lengthOfString = myName.length();
		System.out.println( lengthOfString ); //prints "9"
		
		//the substring method returns a segment of the String, depending on what part you want.
		//an 'index' describes what position a char is at in a String, and it starts at 0.
		//so, the 0 index of myName has the 'm' char, and the 1 index has the 'y' char.
		
		//if you pass the substring method one int, it will return a String that
		//starts at that index and ends at the end of the String
		String miniString = new String( myName.substring( 3 ) );
		System.out.println( miniString ); //prints out "rauger"
		
		//if you pass it two ints, it will return a String that starts at the first index
		//and ends at the index BEFORE the second int. 
		String minierString = new String ( myName.substring(3, 7) ); // goes from index 3 to index 6
		System.out.println( minierString ); //prints out "raug"
		
		//indexof returns the first index a char or String shows up in a String.
		int eLocation = myName.indexOf('e');
		System.out.println(eLocation); //prints out '7'
		
		//this also works for Strings if you want to do some sort of a word search
		int traugLocation = myName.indexOf("Traug");
		System.out.println(traugLocation); //prints out '2' because that's where it starts
		
		//charAt is similar to indexOf, but backwards. you pass it an int and it returns
		//what char is at that index
		char myLetter = myName.charAt(4); //returns character at index 4
		System.out.println(myLetter); //prints 'a' because it is teh char at the 4th index
		
		//equals is used specifically for if statements. equals will return 'true'
		//if you pass a String with the same value as the String itself.
		
		if (myName.equals("MrTrauger") ) 
		{
			//this line will run because that is the equal to our String
		}
		
		if (myName.equals("mrTrauged") ) 
		{
			//this line will not run, because that is not equal to "MrTrauger" exactly
		}
		

	}

}
