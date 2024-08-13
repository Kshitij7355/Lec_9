package Lec9;

import java.util.Scanner;

public class Search_a_2D_Matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m =s.nextInt();
		int[][]arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int item =s.nextInt();
		System.out.println(Search(arr,item));
	}
	public static boolean Search(int[][]arr , int item) {
		int r =0;
		int col=arr[0].length-1;
		while(r<arr.length && col>=0) {
			if(arr[r][col]==item) {
				return true;
			}
			else if(arr[r][col]>item) {
				col--;
			}
			else {
				r++;
			}
		}
		return false;
	}

}
