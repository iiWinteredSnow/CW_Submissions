public boolean firstLast6(int[] nums) {
  if ((nums[0]==6)||(nums[nums.length-1]==6)){
    return true;
    
  }
  return false;
}
public boolean sameFirstLast(int[] nums) {
  if ((nums.length > 0)&&((nums[0])==(nums[nums.length-1]))){
    return true;
  }
  return false;
}
public int[] makePi() {
  int[] digitsPi = {3, 1, 4};
  return digitsPi;
}
public boolean commonEnd(int[] a, int[] b) {
  if((a.length > 0 && b.length > 0) && (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])){
    return true;
  }
  return false;
}
public int sum3(int[] nums) {
 int sum = nums[0];
  for(int i=1; i<(nums.length); i++){
    sum+=nums[i];
  }
  return sum;
}
