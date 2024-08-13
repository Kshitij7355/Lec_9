package Lec9;

import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m=s.nextInt();
		int[][]arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		ZigZac(arr);
		

	}
	public static void ZigZac(int[][]arr) {
		for(int i=0;i<arr[0].length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j][i]+" ");
				}
			}
			else {
				for(int j=arr.length-1;j>=0;j--) {
					System.out.print(arr[j][i]+" ");
				}
			}
//			System.out.println();
			
		}
	}

}
