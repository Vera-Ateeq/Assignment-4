
public class P6 {
	public static void main(String[] args) {
		int[]  nums = {-2,-1,3,4,0};
		int result = equilbruimPt(nums);
		System.out.println(result);
	}
	
	public static int equilbruimPt(int[] nums){
		int tSum = 0;
		int lSum = 0;
		for(int i = 0; i < nums.length; i++) {
			tSum = tSum + nums [i];
		}
		for(int i = 0; i < nums.length; i++) {
			if((tSum - lSum - nums [i]) == lSum){
				return i;
			}
			lSum = lSum + nums[i];
		}
		return -1;
	}
}
