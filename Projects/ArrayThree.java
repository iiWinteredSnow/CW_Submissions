public boolean has23(int[] nums) {
  for (int i=0;i<nums.length;i++)
  {
    if ((nums[i]==2)||(nums[i]==3))
    {
      return true;
    }
  }
  return false;
}


public boolean no23(int[] nums) {
  for (int i=0;i<nums.length;i++)
  {
    if ((nums[i]==2)||(nums[i]==3))
    {
      return false;
    }
  }
  return true;
}

public int[] makeLast(int[] nums) {
  int temp1 = nums[nums.length-1];
  int[] numArr = new int[nums.length*2];
  numArr[numArr.length-1] = temp1;
  return numArr;
}

