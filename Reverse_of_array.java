package lec9;
import java.util.*;
public class Reverse_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int [n];
		for(int i =0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Reverse(arr);
		for(int j = 0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
			
		}
	

	}
	public static void Reverse(int[]arr) {
		int i =0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
