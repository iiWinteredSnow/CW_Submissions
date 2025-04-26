public class ArraySorter {

    // Method to sort left-right, top-down
    public static void sortLeftRightTopDown(double[][] arr) {
        int rows = arr.length;
        int col = arr[0].length;
        double[] flattened = new double[rows * col];

        // Flatten the 2D array into a 1D array
        int index = 0;
        for (double[] row : arr) {
            for (double num : row) {
                flattened[index++] = num;
            }
        }

        // (bubble sort)
        for (int i = 0; i < flattened.length - 1; i++) {
            for (int j = 0; j < flattened.length - 1 - i; j++) {
                if (flattened[j] > flattened[j + 1]) {
                    double temp = flattened[j];
                    flattened[j] = flattened[j + 1];
                    flattened[j + 1] = temp;
                }
            }
        }

        // row by row make 1D to 2D array
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = flattened[index++];
            }
        }
    }

    // Method to sort top-down, left-right
    public static void sortTopDownLeftRight(double[][] arr) {
        int rows = arr.length;
        int col = arr[0].length;
        double[] flattened = new double[rows * col];

        // Flatten the 2D array into a 1D array
        int index = 0;
        for (double[] row : arr) {
            for (double num : row) {
                flattened[index++] = num;
            }
        }

        // (bubble sort) again
        for (int i = 0; i < flattened.length - 1; i++) {
            for (int j = 0; j < flattened.length - 1 - i; j++) {
                if (flattened[j] > flattened[j + 1]) {
                    double temp = flattened[j];
                    flattened[j] = flattened[j + 1];
                    flattened[j + 1] = temp;
                }
            }
        }

        // column by column make 1D to 2D array
        index = 0;
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < rows; i++) {
                arr[i][j] = flattened[index++];
            }
        }
    }
}
