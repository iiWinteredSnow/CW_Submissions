package tester;

public class LoopsIntro {

	public static void main(String[] args) {
		System.out.println(countLetters( "abqcdqefghqqijk" , 'q' ));
		System.out.println(getFactorial(5));
		int x=5;
		 for(int i = x;i>=1;i--)
		 {
			 x+=i;
			 System.out.println(x+" "+i);
		 }
	

		/* Create a class with a main method. Inside the class, create the following methods:

1. Create a method countLetters() that is passed a String and a char and returns how many times that passed char shows up in the passed String. Examples:

countLetters( "abqcdqefghqqijk" , q ) -----returns----> 4

countLetters ( "aaabaabaab" , b ) ----returns---> 3

2. Create a method getFactorial() that is passed an int and returns the factorial of that int (a factorial is a number multiplied by each number before it. For example, 5! = 5 x 4 x 3 x 2 x 1)

Examples:

getFactorial ( 5 ) ----returns---> 120

3. Create a method printIfRepeats() that will print true if the passed String has two of the same letter next to each other, and prints false if not.

Examples:

printIfRepeats ( "abcde" ) ---prints---> false

printIfRepeats ( "abcce" ) ---prints---> true */
		

	}
	public static int countLetters(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
	 public static int getFactorial(int num) {
	        int factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	 public static void printIfRepeats(String str) {
	        boolean hasRepeats = false;
	        for (int i = 0; i < str.length() - 1; i++) {
	            if (str.charAt(i) == str.charAt(i + 1)) {
	                hasRepeats = true;
	                break;
	            }
	        }
	        System.out.println(hasRepeats);
	    }
	 
}
