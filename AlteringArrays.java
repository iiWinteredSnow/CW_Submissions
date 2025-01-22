package tester;

public class AlteringArrays {
	public static void main(String[] args) {
		int[] nums = {5, 0, 8, 20};
		subtract5FromAll4(nums);
	}
	public static void subtract5FromAll4(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i]-=5;
			System.out.print(nums[i]+"  ");
		}
		
		
	}

}
