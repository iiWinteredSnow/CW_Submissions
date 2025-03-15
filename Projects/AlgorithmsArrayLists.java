import java.util.ArrayList;

public class AlgorithmsProj {

    public static void main(String[] args) {
        // Original array logic adapted to ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1234);
        nums.add(764566);
        nums.add(43);
        nums.add(654);
        nums.add(456);
        nums.add(234);
        nums.add(879);
        nums.add(345);

        nums = insertionSort(nums);
        System.out.print(nums.get(0) + "," + nums.get(1) + "," + nums.get(3) + "," + nums.get(4) + "," + nums.get(5) + ",");
    }

    public static int getSmallestNumber(ArrayList<Integer> nums) {
        int snum = nums.get(0);
        for (int num : nums) {
            if (num < snum) {
                snum = num;
            }
        }
        return snum;
    }

    public static int indexOfSmallest(ArrayList<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            System.out.println("ArrayList must not be null or empty");
            return -1;
        }

        int sindex = 0;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(sindex)) {
                sindex = i;
            }
        }

        return sindex;
    }

    public static double average(ArrayList<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            System.out.println("ArrayList must not be null or empty");
            return 0;
        }

        int sum = 0;
        for (int number : nums) {
            sum += number;
        }

        return (double) sum / nums.size();
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int key = nums.get(i);
            int j = i - 1;

            // Move elements of nums[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && nums.get(j) > key) {
                nums.set(j + 1, nums.get(j));
                j--;
            }
            nums.set(j + 1, key);
        }
        return nums;
    }

    public static boolean allEven(ArrayList<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean threeInARow(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 2; i++) {
            if (nums.get(i).equals(nums.get(i + 1)) && nums.get(i + 1).equals(nums.get(i + 2))) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrences(ArrayList<Integer> nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void reverseArray(ArrayList<Integer> nums) {
        int left = 0, right = nums.size() - 1;
        while (left < right) {
            int temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right, temp);
            left++;
            right--;
        }
    }

    public static void shiftRight(ArrayList<Integer> nums) {
        if (!nums.isEmpty()) {
            int last = nums.get(nums.size() - 1);
            for (int i = nums.size() - 1; i > 0; i--) {
                nums.set(i, nums.get(i - 1));
            }
            nums.set(0, last);
        }
    }
}
