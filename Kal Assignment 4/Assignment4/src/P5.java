
public class P5 {
	public static void main(String[] args) {
		int[]  nums = {0,1,2,0,1,2,0,1,2,1,1};
		sortedArray(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
	}
	
	public static void sortedArray(int[] nums){
		int low = 0;
		int mid = 0;
	    int high = nums.length-1;
	    int temp = mid;
	    while(mid<=high) {
	    	if(nums[mid] == 0) {
		    	temp = nums[low];
		    	nums[low] = nums[mid];
		    	nums[mid] = temp;
		    	low++;
		    	mid++;
		    }else if(nums[mid] == 1) {
		    	mid++;
		    }else{
		    	temp = nums[high];
		    	nums[high] = nums[mid];
		    	nums[mid] = temp;
		    	high--;
		    }
	    }
	    
	}
}
