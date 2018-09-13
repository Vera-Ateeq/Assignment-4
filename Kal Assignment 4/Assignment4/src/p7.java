
public class p7 {
	public static void main(String[] args) {
		int[]  nums = {0,2,1,2,3,4,6,7,-4,-2,-1};
		leaders(nums);
	}
	
	public static void leaders(int[] nums){
		int lead = nums[nums.length -1];
		System.out.println(lead);
		for(int i = nums.length - 2; i >= 0; i--) {
			if(nums[i] > lead) {
				lead = nums[i];
				System.out.println(nums[i]);
			}
		}
	}
}
