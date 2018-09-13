public class P3 {
	public static void main(String[] args) {
		int[]  nums = {1, 4,2,6,7};
        int[] index = subArrayIndex(nums,12);
		System.out.print(index[0]+" "+index[1]);
	}
	
	public static int[] subArrayIndex(int[] nums, int sum) {
    	int start = 0;
    	int total = nums[0];
    	int[] result = {-1,-1};
    	
    	if(nums.length == 0) {
    		return result;
    	}	
    	for(int i = 1; i < nums.length; i++) {
    		total = total + nums[i];
    		
        	while(total > sum && start < i-1) {
        		total = total - nums[start];
        		start++;
        	}
    		if(total == sum) {
    			result[0] = start;
    			result[1] = i;
    		}
    	}
    	return result;
    	
    }
	
	  /**public static int subArraySum(int arr[], int n, int sum) 
	    {
	        int curr_sum = arr[0], start = 0, i;
	 
	        // Pick a starting point
	        for (i = 1; i <= n; i++) 
	        {
	            // If curr_sum exceeds the sum, then remove the starting elements
	            while (curr_sum > sum && start < i-1)
	            {
	                curr_sum = curr_sum - arr[start];
	                start++;
	            }
	             
	            // If curr_sum becomes equal to sum, then return true
	            if (curr_sum == sum) 
	            {
	                int p = i-1;
	                System.out.println("Sum found between indexes " + start
	                        + " and " + p);
	                return 1;
	            }
	             
	            // Add this element to curr_sum
	            if (i < n)
	            curr_sum = curr_sum + arr[i];
	             
	        }
	 
	        System.out.println("No subarray found");
	        return 0;
	    }**/
	 
}
