package Lec9;

import java.util.Scanner;

public class Transpose {

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
		Transpose(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	public static void Transpose(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
