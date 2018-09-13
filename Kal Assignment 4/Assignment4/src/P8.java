import java.util.PriorityQueue;

public class P8 {
	public static void main(String[] args) {
		int[]  nums = {9,3,12,4,6,0,5,33};
		int result = kSmallest(nums, 3);
		System.out.println(result);
	}
	
	public static int kSmallest(int[] nums, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<nums.length;i++){
			pq.offer(nums[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}
}
