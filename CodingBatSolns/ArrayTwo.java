public int[] rotateLeft3(int[] nums) {
		int temp1 = nums[1];
		int temp2 = nums[2];
		nums[2] = nums[0];
		nums[0] = temp1;
		nums[1] = temp2;
		return nums;
}
