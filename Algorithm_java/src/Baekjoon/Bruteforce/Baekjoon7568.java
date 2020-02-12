package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon7568 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int[][] b = new int[a][3];
		for(int i = 0; i < a; i++) {
			b[i][0] = input.nextInt();
			b[i][1] = input.nextInt();
			b[i][2] = 1;
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if(b[i][0] < b[j][0] & b[i][1] < b[j][1])
					b[i][2]++;
			}
		}
		for(int i = 0; i < a; i++)
			System.out.print(b[i][2] + " ");
	}
}
