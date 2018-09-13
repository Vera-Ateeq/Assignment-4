
public class P2 {
	public static void main(String[] args) {
		int[]  nums = {6,4,5,3,1};
		int missing = missingNumber(nums);
		System.out.print(missing);
	}
	
    public static int missingNumber(int[] nums) {
    	int sum = 0;
    	int expectedSum = ((nums.length +1 )*(nums.length + 2))/2;
    	for(int i = 0; i < nums.length; i++) {
    		sum = sum + nums[i];
    	}
    	return sum - expectedSum;
    }
}
