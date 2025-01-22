public int[] rotateLeft3(int[] nums) {
		int temp1 = nums[1];
		int temp2 = nums[2];
		nums[2] = nums[0];
		nums[0] = temp1;
		nums[1] = temp2;
		return nums;
}

public int[] reverse3(int[] nums) {
		int temp1 = nums[2];
		int temp2 = nums[1];
		nums[2] = nums[0];
		nums[0] = temp1;
		nums[1] = temp2;
		return nums;
}

public int[] maxEnd3(int[] nums) {
  if(nums[0]>nums[2])
  {
    nums[1] = nums[0];
    nums[2] = nums[0];
  }
  nums[0] = nums[2];
  nums[1] = nums[2];
  return nums;
}

public int sum2(int[] nums) {
  if (nums.length == 0) {
        return 0;
    } else if (nums.length == 1) {
        return nums[0];
    } else {
        return nums[0] + nums[1];
    }
}

public int[] middleWay(int[] a, int[] b) {
  int[] nums = {a[1], b[1]};
  return nums;
}

public int[] makeEnds(int[] nums) {
  int[] newArr = {nums[0], nums[nums.length-1]};
  return newArr;
}
