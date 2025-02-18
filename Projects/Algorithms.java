    public static int getSmallestNumber(int[] nums) {
        int snum = nums[0];
        for (int num : nums) {
            if (num < snum) {
                snum = num;
            }
        }
        return snum;
    }
