package Baekjoon;

import java.util.Scanner;

public class Baekjoon1012 {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		for(int a = 0; a < testCase; a++) {
			int xlength = input.nextInt();
			int ylength = input.nextInt();
			int num = input.nextInt();
			int[] x = new int[num];
			int[] y = new int[num];
			int[][] xy= new int[num][2];
			for(int b = 0; b < num; b++) {
				x[b] = input.nextInt();
				y[b] = input.nextInt();
			}
			for(int c = 0; c < num; c++) {
		        for(int d = 0 ; d < num - c - 1 ; d++) {
		            if(x[d] > x[d+1]) {
		                int xtemp = x[d+1];
		                x[d+1] = x[d];
		                x[d] = xtemp;
		                int ytemp = y[d+1];
		                y[d+1] = y[d];
		                y[d] = ytemp;
		            }
		        }
		    }
			int start = 0; 
			for(int e = 0; e < num; e++) {
				if(e == 0)
					continue;
				if(x[e-1] != x[e] | e == num - 1) {
					for(int f = start; f < e; f++) {
						for(int g = 0; g < e - f - 1; g++) {
							if(y[start + g] > y[start + g + 1]) {
								int temp = y[start + g + 1];
								y[start + g + 1] = y[start + g];
								y[start + g] = temp;
							}
						}
					}
					start = e;
					continue;
				}
			}
			for(int h = 0; h < num; h++) {
				System.out.println(x[h] + " " + y[h]);
			}
			int earthworm = 0;
			for(int h = 0 ; h < num; h++) {
				if(h == 0) {
					earthworm++;
					continue;
				}
				if(x[h-1] != x[h] & y[h-1] != y[h]) {
					earthworm++;
				}
			}
			System.out.println(earthworm);
		}
	}
}