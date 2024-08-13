package lec9;
import java.util.*;
public class Max_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(max(arr));
		
		

	}
	public static int max(int[]arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
//	public static int max_2(int[]arr) {
//		int max = Integer.MIN_VALUE;//-2^31
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		return max;
//	}
//	public static int min_2(int[]arr) {
//		int min = Integer.MAX_VALUE;//-2^31-1
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		return min;
}
	

