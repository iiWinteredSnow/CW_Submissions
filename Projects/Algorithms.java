package HelloWorld;

public class AlgorithmsProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1234,764566,43,654,456,234,879,345};
		nums = insertionSort(nums);
		System.out.print(nums[0]+","+nums[1]+","+nums[3]+","+nums[4]+","+nums[5]+",");

	}
	
	
	public static int getSmallestNumber(int[] nums) {
        int snum = nums[0];
        for (int num : nums) {
            if (num < snum) {
                snum = num;
            }
        }
        return snum;
    }
	
	public static int indexOfSmallest(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array must not be null or empty");
		return nums;
        }

        int sindex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[sindex]) {
                sindex = i;
            }
        }

        return sindex;
    }
	
	public static double average(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array must not be null or empty");
		return nums;
        }

        int sum = 0;
        for (int number : nums) {
            sum += number;
        }

        return (double) sum / nums.length;
    }
	
	public static int[] insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
            	nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
	}
	
}

