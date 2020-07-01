package Baekjoon.solve_05000;

import java.util.Scanner;

public class Baekjoon5386 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int s = sc.nextInt();
			int k = sc.nextInt();
			int min = 0;
			for(int i = 0; Math.pow(k, i) <= s; i++) {
				if(func(s - (int)Math.pow(k, i), k, true)) {
					min = (int)Math.pow(k, i);
					break;
				}
			}
			System.out.println(min);
		}
	}
	
	public static boolean func(int s, int k, boolean turn) {
		for(int i = 0; Math.pow(k, i) <= s; i++) {
			if(func(s - (int)Math.pow(k, i), k, !turn)) {
				return true;
			}
		}
		return turn;
	}
}
