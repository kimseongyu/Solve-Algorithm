package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		if(n % 2 == 1) {
			arr = a(n, 1);
		}else if(n % 4 == 0) {
			arr = b(n);
		}else {
			arr = c(n);
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] a(int n, int num) {
		int[][] arr = new int[n][n];
		int i = 0, j = n/2;
		while(true) {
			arr[i][j] = num++;
			if(arr[(n+i-1)%n][(n+j+1)%n] == 0) {
				i = (n+i-1)%n; j = (n+j+1)%n;
			}else {
				i = (i+1)%n;
				if(arr[i][j] != 0) break;
			}
		}
		return arr;
	}

	public static int[][] b(int n) {
		int[][] arr = new int[n][n];
		int num = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i % 4 == 0 | i % 4 == 3) & (j % 4 == 0 | j % 4 == 3)) {
					arr[i][j] = num;
				}
				if((i % 4 == 1 | i % 4 == 2) & (j % 4 == 1 | j % 4 == 2)) {
					arr[i][j] = num;
				}
				num++;
			}
		}
		num = 1;
		for(int i = n-1; i >= 0; i--) {
			for(int j = n-1; j >= 0; j--) {
				if(arr[i][j] == 0) {
					arr[i][j] = num;
				}
				num++;
			}
		}
		return arr;
	}

	public static int[][] c(int n) {
		int m = (n-2)/4;
		int[][] arr = new int[n][n];
		int[][] small = a(n/2, 1);
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < n/2; j++) {
				arr[i][j] = small[i][j];
			}
		}
		
		small = a(n/2, 2*(2*m+1)*(2*m+1)+1);
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < n/2; j++) {
				arr[i][j+n/2] = small[i][j];
			}
		}
		
		small = a(n/2, 3*(2*m+1)*(2*m+1)+1);
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < n/2; j++) {
				arr[i+n/2][j] = small[i][j];
			}
		}
		
		small = a(n/2, (2*m+1)*(2*m+1)+1);
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < n/2; j++) {
				arr[i+n/2][j+n/2] = small[i][j];
			}
		}
		
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < m; j++) {
				int temp = arr[i+n/2][j];
				arr[i+n/2][j] = arr[i][j];
				arr[i][j] = temp;
			}
		}
		
		for(int i = 0; i < n/2; i++) {
			for(int j = n-m+1; j < n; j++) {
				int temp = arr[i+n/2][j];
				arr[i+n/2][j] = arr[i][j];
				arr[i][j] = temp;
			}
		}
		
		int temp = arr[n/4][m-1];
		arr[n/4][m-1] = arr[n/4+n/2][m-1];
		arr[n/4+n/2][m-1] = temp;
		
		temp = arr[n/4][m];
		arr[n/4][m] = arr[n/4+n/2][m];
		arr[n/4+n/2][m] = temp;
				
		return arr;
	}
}
