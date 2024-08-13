package Lec9;

public class Two_2D_Arrays {

	public static void main(String[] args) {
		int[][]arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][2]);
		int[][]other=arr;
		Display(arr);
		

	}
	public static void Display(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
