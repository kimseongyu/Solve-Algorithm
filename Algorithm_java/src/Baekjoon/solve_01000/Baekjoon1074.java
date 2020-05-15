package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1074 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(r(input.nextInt(), n) + c(input.nextInt(), n));
	}
	
	public static int r(int a, int b) {
		for(int i = 0; i < b; i++)
			if(Math.pow(2, i) <= a & a < Math.pow(2, i+1))
				return 2*(int)(Math.pow(2, i)*Math.pow(2, i)) + r(a-(int)Math.pow(2, i),i);
		return 0;
	}
	
	public static int c(int a, int b) {
		for(int i = 0; i < b; i++)
			if(Math.pow(2, i) <= a & a < Math.pow(2, i+1))
				return (int)(Math.pow(2, i)*Math.pow(2, i)) + c(a-(int)Math.pow(2, i),i);
		return 0;
	}
}
