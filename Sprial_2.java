package Lec9;

public class Sprial_2 {

	public static void main(String[] args) {
		int n =3;
		int[][]arr=new int[3][3];
	Sprial(arr,n);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

}
public static void Sprial(int[][]arr, int n) {
    int minr=0;
	int maxr=n-1;
	int minc=0;
	int maxc=n-1;
	int total_Element=n*n;
	int count=1;
    while(count<=total_Element) {
   	 for(int i=minc;i<=maxc && count<=total_Element;i++) {
			arr[minr][i]=count;
			count++;
			
		}
		minr++;
		for(int i=minr;i<=maxr && count<=total_Element;i++) {
			arr[i][maxc]=count;
			count++;
		
		}
		maxc--;
		for(int i=maxc;i>=minc && count<=total_Element;i--) {
			arr[maxr][i]=count;
			count++;
			
		}
		maxr--;
		for(int i=maxr;i>=minr && count<=total_Element;i--) {
			arr[i][minc]=count;
			count++;
			
		}
		minc++;
    }

	}

}
