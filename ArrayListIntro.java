package tester;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList emptyArr = new ArrayList();
		
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		ArrayList<String> strArr = new ArrayList<String>();
		
		intArr.add(1);
		intArr.add(2);
		intArr.add(3);
		strArr.add("Alice");
		strArr.add("Bob");
		strArr.add("Charlie");
		
		
		intArr.add(2, 5);
		strArr.add(1, "Derek");
		
		
		System.out.println(intArr.get(1));
		System.out.println(intArr.get(intArr.size()-1));
		System.out.println(strArr.get(1));
		System.out.println(strArr.get(strArr.size()-1));
		
		
		intArr.set(0, 0);
		strArr.set(0, "Zero");
		System.out.println(intArr.get(0));
		System.out.println(strArr.get(0));
		
		
		System.out.println(intArr.get(intArr.size()-1));
		System.out.println(strArr.get(intArr.size()-1));
		strArr.remove(strArr.size()-1);
		intArr.remove(intArr.size()-1);
		System.out.println(intArr);
		intArr.add(intArr.remove(0));
		System.out.println(intArr);
		
		//Important to shift array 1 left
		intArr.add(intArr.remove(0));
		
		// 2 26 2025
		// arraylist
		 // arr[0] = 2;
		intArr.set(0, 2);
		// System.out.println(arr[2]);
		System.out.println(intArr.get(2));
		/* int temp = arr[i];
		 * arr[i] = arr[i+1];
		 * arr[i+1] = temp; */
		int temp = intArr.get(0);
		intArr.set(0, intArr.get(0+1));
		intArr.set(0+1, temp);
		// or
		intArr.set(0,intArr.set(0+1,intArr.get(0)));
		



	}
	public static int checkFor4(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 4) {
                return i;
            }
        }
        return -1;
    }
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
             
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }
	
	
	

}
