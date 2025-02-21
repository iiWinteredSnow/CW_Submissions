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

public int[] biggerTwo(int[] a, int[] b) {
  int sum= a[0]+a[1]-b[0]-b[1];
	if(sum>=0){
		return a;
	}
	return b;
}

public int[] makeMiddle(int[] nums) {
    int middle = nums.length / 2;
    return new int[] {nums[middle - 1], nums[middle]};
}

public int[] plusTwo(int[] a, int[] b) {
  int[] copyArr = {0,0,0,0};
  copyArr[0]=a[0];
  copyArr[1]=a[1];
  copyArr[2]=b[0];
  copyArr[3]=b[1];
  return copyArr;
}

public int[] swapEnds(int[] nums) {
  int temp1 = nums[0];
  int temp2 = nums[nums.length-1];
  nums[0] = temp2;
  nums[nums.length-1] = temp1;
  return nums;
}

public int maxTriple(int[] nums) {
  int first = nums[0];
    int middle = nums[nums.length / 2];
    int last = nums[nums.length - 1];
    return Math.max(first, Math.max(middle, last));
	//yes ik what math max does
}

public int[] frontPiece(int[] nums) {
  int length = nums.length;
  if (length <=1){
    return nums;
  }
  int[] newArr = {nums[0],nums[1]};
  return newArr;
}


public boolean unlucky1(int[] nums) {
  int l = nums.length;
  if (l<2) {
    return false;
  }
  for (int i = 0; i<2;i++){
    if(nums[i]==1&&nums[i+1]==3){
      return true;
    }
  }
  for (int i = nums.length-1; i>nums.length-2;i--){
    if(nums[i]==3&&nums[i-1]==1){
      return true;
    }
  }
  return false;
}


public int[] make2(int[] a, int[] b) {
  int[] newArr = new int[2];
  int index = 0;
  if (a.length>0){
    for(int i = 0; index<2&&i<a.length; i++){
      newArr[index++] = a[i];
    }
  }
  if (b.length>0){
    for(int i = 0; index<2&i<b.length; i++){
      newArr[index++] = b[i];
    }
  }
  return newArr;
}
// pain i didnt know u could do that

public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0) {
        return new int[] {};
    } else if (a.length == 0) {
        return new int[] {b[0]};
    } else if (b.length == 0) {
        return new int[] {a[0]};
    }
  return new int[] {a[0], b[0]};
}
	2
