
public class P1 {
	public static void main(String[] args) {
		int[]  nums = {-2,-3,4,-1,-2,1,5,9};
		int maxiS = maxSum(nums);
		System.out.print(maxiS);
	}
	
	public static int maxSum(int[] arr) {
		int sum = arr[0];
		int maxSum = arr[0];
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];			
			if(sum < 0) {
				sum = 0;
			}
			if(maxSum < sum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}
}

