package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon1912 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int[] b = new int[a];
		int[] c = new int[a];
		for(int i = 0; i < a; i++)
			b[i] = input.nextInt();
		int d = b[0];
		c[0] = b[0];
		for(int i = 1; i < a; i++) {
			c[i] = Math.max(b[i], b[i] + c[i-1]);
			d = Math.max(d, c[i]);
		}
		System.out.print(d);
	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		int a = input.nextInt();
//		int[] b = new int[a];
//		for(int i = 0; i < a; i++)
//			b[i] = input.nextInt();
//		int c = 0;
//		for(int i = 0; i < a; i++) {
//			for(int j = 0; j < a-i; j++) {
//				int d = 0;
//				for(int k = 0 ; k <= i; k++) {
//					d += b[j+k];
//				}
//				c = Math.max(c, d);
//			}
//		}
//		System.out.print(c);
//	}
}