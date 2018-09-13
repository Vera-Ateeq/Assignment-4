
public class P9 {
	public static void main(String[] args) {
	    int[][] a = { {1,  2,  3,  4,  5,  6},
	    			  {7,  8,  9,  10, 11, 12},
	                  {13, 14, 15, 16, 17, 18} };
	     
	        spiralPrint(a);
	}
	
	public static void spiralPrint(int[][] a) {
		int t = 0;
		int b = a.length-1;
		int l = 0;
		int r = a[0].length-1 ;
		int dir = 0;
		while(t <= b && l <= r) {
			if(dir == 0) {
				for(int i = l; i <= r; i++) {
					System.out.print(" " + a[t][i]);
				}
				t++;
				dir++;
			}else if(dir == 1) {
				for(int i = t; i <= b; i++) {
					System.out.print(" " + a[i][r]);
				}
				r--;
				dir++;
			}else if(dir == 2) {
				for(int i = r; i >= l; i--) {
					System.out.print(" " + a[b][i]);
				}
				b--;
				dir++;
			}else if(dir == 3) {
				for(int i = b; i >= t; i--) {
					System.out.print(" " + a[i][l]);
				}
				l++;
				dir = 0;
			}
		}
	}
}
