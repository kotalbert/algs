package intro;

import java.util.Arrays;

public class Histogram {

	public static void main(String[] args) {
		int a[] = {0,0,0,0,1,1,1,2,2,3,3,3,4,4,4,4,4};
		int h[] = histogram(a,5);
		
		System.out.print(Arrays.toString(h));
		
		
	}
	
	public static int[] histogram(int[] a, int m) {
		
		int hist[] = new int[m];
		
		for (int i = 0; i < hist.length; i++) {
			hist[i]=freq(a,i);
		}
		
		return hist;
		
		
	}
	
	public static int freq(int[] a, int x){
		
		int freq = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==x) freq++;
		}
		
		
		return freq;
		
	}
	

}
