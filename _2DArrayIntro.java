package HelloWorld;

public class _2DArrayIntro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums = new int[4][6];
		/* 2. Instantiate a 2-D array with the following values:

		4   5    7

		2  -1   8

		0  1   3
		*/
		int[][] newGrid = {
				{ 4, 5, 7},
				{2, -1, 8},
				{0, 1, 3}
			};
		// For the following problems, print out those elements before and after to verify it worked.  System.out.println();
		// 3. For both of those arrays, change the element in the first row, first column to a 17.
		newGrid[0][0] = 17;
		gridNums[0][0] = 17;
		System.out.println("gridNums: " +gridNums[0][0] + " newGrid: " + newGrid[0][0]);
		// 4. For both of those arrays, change the element in the second row, third column into a 20. 
		newGrid[1][2] = 20;
		gridNums[1][2] = 20;
		System.out.println("gridNums: " +gridNums[1][2] + " newGrid: " + newGrid[1][2]);
		// 5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
		newGrid[0][newGrid[0].length-1] = -5;
		gridNums[0][gridNums[0].length-1] = -5;
		System.out.println("gridNums: " +gridNums[0][gridNums[0].length-1] + " newGrid: " + newGrid[0][newGrid[0].length-1]);
		// 6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length
		newGrid[newGrid.length-1][0] = -7;
		gridNums[gridNums.length-1][0] = -7;
		System.out.println("gridNums: " +gridNums[gridNums.length-1][0] + " newGrid: " + newGrid[newGrid.length-1][0]);
		// 7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		newGrid[newGrid.length-1][newGrid[0].length-1] = -30;
		gridNums[gridNums.length-1][gridNums[0].length-1] = -30;
		System.out.println("gridNums: " +gridNums[gridNums.length-1][gridNums[0].length-1] + " newGrid: " + newGrid[newGrid.length-1][newGrid[0].length-1]);
		
		
	}

	    // 8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	    public static void printFirstRow(int[][] array) {
	        for (int num : array[0]) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    // 9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	    public static void printFirstColumn(int[][] array) {
	        for (int[] row : array) {
	            System.out.print(row[0] + " ");
	        }
	        System.out.println();
	    }

	    // 10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order.
	    public static void printRowMajorOrder(int[][] array) {
	        for (int[] row : array) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println();
	    }

	    // 11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major 
	    public static void printColumnMajorOrder(int[][] array) {
	        int rows = array.length;
	        int cols = array[0].length;
	        for (int col = 0; col < cols; col++) {
	            for (int row = 0; row < rows; row++) {
	                System.out.print(array[row][col] + " ");
	            }
	        }
	        System.out.println();
	    }
	}
