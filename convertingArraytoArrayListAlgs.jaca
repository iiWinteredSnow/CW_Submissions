public static int checkFor4(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 4) {
                return i;
            }
        }
        return -1;
    }
	
	
	 public static void ridAllFives(ArrayList<Integer> nums) {
	        System.out.println("Before: " + nums);
	        // Using a for loop :(
	        for (int i = 0; i < nums.size(); i++) {
	            if (nums.get(i) == 5) {
	                nums.remove(i);
	                i--; 
	            }
	        }

	        System.out.println("After: " + nums);
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
