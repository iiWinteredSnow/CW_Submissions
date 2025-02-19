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

public boolean double23(int[] nums) {
  if (nums.length<2){
    return false;
  }
  if (nums[0]==2&&nums[1]==2){
    return true;
  }
  if (nums[0]==3&&nums[1]==3){
    return true;
  }
  return false;
}


public int[] fix23(int[] nums) {
  for (int i = 0; i<nums.length; i++){
    if(nums[i]==2&&nums[i+1]==3){
      nums[i+1]=0;
      return nums;
    }
  }
  return nums;
}

public int start1(int[] a, int[] b) {
  int count = 0;
  if (a.length>0){
    if (a[0]==1){
    count++;
    }
  }
  if (b.length>0){
    if (b[0]==1){
    count++;
    }
  }
  return count;
}




