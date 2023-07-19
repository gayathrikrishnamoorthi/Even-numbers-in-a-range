package sample;

import java.util.Scanner;

public class Numrange {
	public static void eveNum(int arr[], int arr1[]) {
		
		int k[] = new int[arr.length + 1];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i - 1]%2 == 0) {
				k[i] = k[i - 1]+1;
			}
			else {
				k[i] = k[i - 1];
			}
		}
		int result [] = new int[arr1.length];
		for (int i=0; i<arr1.length; i++) {
			int[][] ar = null;
			int a=ar[i][0];
			int b=ar[i][1];
			int[] p;
			int r;
			result[i] = k[i+1] - k[1];
			
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		int x = 0;
		int[][] arr1 = new int[x][2];
		for (int i=0; i<x; i++) {
			for(int j=0; j<2; j++) {
				arr1[i][j] = sc.nextInt();
			}

		
		System.out.println("arr.toString(value)");
	
	}

}

}

}
