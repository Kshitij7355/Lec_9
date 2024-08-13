package lec9;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int item = s.nextInt();
		System.out.print(Search(arr,item));
		;
		
	}
	public static int Search(int[]arr,int item) {
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
		
		
		
	}

}
