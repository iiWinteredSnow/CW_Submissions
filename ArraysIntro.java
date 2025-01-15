package tester;

public class ArraysIntro {
	/* Today you will be declaring variables that store an array of elements. Create code that accomplishes the following tasks and submit it via github:

1. Create an empty array that is meant to represent doubles. Name it doubArr.Repeat this for arrays that represent ints, booleans, String objects, and Circle objects. 

2. Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.

3. Create an array that represents 5 String objects with default values. Name the array fruitsArr. In the comment for this task, state what each element's default value is. State what the default value for ints, doubles, booleans, and any reference data type is as well. 

4. Change the 2nd element in fruitsArr to "Bapple" .

5. Change the last element in fruitsArr to "Zanana" . Accomplish this without typing the number "4" and instead accessing the arrays length.

6. To verify you did number 4 correctly, print out the second element of fruitsArr.

7. Create a loop that one by one prints out each element in fruitsArr. */

	public static void main(String[] args) {
		// #1
		double[] doubArr;
		Circle[] circArr;
		boolean[] boolArr;
		int[] intArr;
		String[] strArr;
		
		// #2
		int[] randomNums = {7, -12, 88, -88, 0, 5, 2000};
		
		// #3
		// each object's default value is null.
		String[] fruitsArr = new String[5];
		
		// #4
		fruitsArr[1] = "Bapple";
		
		// #5
		fruitsArr[fruitsArr.length-1] = "Zanana";
		
		// #6
		System.out.println(fruitsArr[(fruitsArr.length-1)]);
		System.out.println();
		
		// #7
		for(int i = 0; i < fruitsArr.length; i++) {
			System.out.println(fruitsArr[i]);
		}
		
		
		
		

	}
	

}
