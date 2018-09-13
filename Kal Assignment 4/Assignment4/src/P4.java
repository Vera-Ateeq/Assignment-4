import java.util.HashMap;

public class P4 {
	public static void main(String[] args) {
		int[]  nums = {1, 4, 0, 0, 3, 10, 5};
		subArraySum(nums, 13);
	}
	
	public static void subArraySum(int[] nums, int sum)
	{
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();	 
	    int totalSum = 0;	 	    
	    for (int i = 0; i < nums.length; i++){
	    	totalSum = totalSum + nums[i];    	
	        if (totalSum == sum){
	            System.out.println("Sum found between indexes "+ 0 +" to "+ i);
	        }	 
	        if (map.get(totalSum - sum) != null){
	            System.out.println("Sum found between indexes "+ (map.get(totalSum - sum)+1)  +" to " + i);
	        }	 
	        map.put(totalSum, i);
	    }
	    System.out.println("No subarray with given sum exists");
	}
}
