package Baekjoon.solve_02000;

import java.util.Scanner;

public class Baekjoon2798 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int[] c = new int[a];
		for(int i = 0; i < a; i++) {
			c[i] = input.nextInt();
		}
		int max = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				for(int k = 0; k< a; k++) {
					if(i != j & i != k & j != k) {
						int sum = c[i] + c[j] + c[k];
						if(b >= sum & max < sum) {
							max = sum;
						}
					}
				}
			}
		}
		System.out.print(max);
	}
}
