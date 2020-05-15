package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1475 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		int[] a = new int[10];
		for(int i = 0; i < s.length(); i++)
			a[s.charAt(i) - 49]++;
		a[6] = (a[6] + a[9] + 1)/2;
		int max = a[0];
		for(int i = 1; i < 9; i++)
			max = Math.max(max, a[i]);
		System.out.print(max);
	}
}
