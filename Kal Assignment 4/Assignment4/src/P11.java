import java.util.HashMap;
import java.util.PriorityQueue;

public class P11 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,3,4,1,3,2,4};
		sortByFrequency(arr);
        for(int i = 0 ; i < arr.length ; i++) {
        	System.out.print(arr[i]+ "  ");
        }
	}
	
	public static void sortByFrequency(int[] arr) {
		HashMap<Integer, EFO> hm = new HashMap<Integer, EFO>();
		for(int i = 0; i < arr.length; i++) {
			if(!hm.containsKey(arr[i])) {
				EFO efi = new EFO(arr[i], 1, i);
				hm.put(arr[i], efi );
			}else {
				hm.get(arr[i]).frequency++;				
			}
		}
		PriorityQueue<EFO> pq = new PriorityQueue<EFO>();
		for (EFO el: hm.values()) {
			pq.offer(el); 	
		}
		EFO el;
		int arraySize = 0; 
		while(!pq.isEmpty()) {
			el= pq.poll();
			while(el.frequency > 0 && arraySize < arr.length ) {
				arr[arraySize] = el.element;
				arraySize++;
				el.frequency--;
			}
		}

	}

	public static class EFO implements Comparable<EFO>{
		public int element;
		public int frequency;
		public int index;
		
		public EFO(int element, int frequency, int index){
			this.element = element;
			this.frequency = frequency;
			this.index = index;
		}

		@Override
		public int compareTo(EFO arg0) {
			if(arg0.frequency  > this.frequency) {
				return 1;
			}else if(arg0.frequency < this.frequency) {
				return -1;
			}else {
				if(arg0.index > this.index) {
					return -1;
				}else {
					return 1;
				}
			}
		}
		
		
		
		
	}
	 
}

