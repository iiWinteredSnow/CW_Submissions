package tester;

public class SearchingArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean checkFor4(int[] array) {
        for (int num : array) {
            if (num == 4) {
                return true;
            }
        }
        return false;
    }
	public static int countFor4(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 4) {
                count++;
            }
        }
        return count;
    }
	public static boolean checkForFour4(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 4) {
                count++;
            }
        }
        return count == 4;
    }
	

}
