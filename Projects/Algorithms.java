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
            throw new IllegalArgumentException("Array must not be null or empty");
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
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int number : nums) {
            sum += number;
        }

        return (double) sum / nums.length;
    }

