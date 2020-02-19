package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon1476 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int E = input.nextInt();
		int S = input.nextInt();
		int M = input.nextInt();
		int D = 0;
		while(true) {
			D++;
			if(--E == 0 & --S == 0 & --M == 0)
				break;
			if(E == 0)
				E = 15;
			if(S == 0)
				S = 28;
			if(M == 0)
				M = 19;
		}
		System.out.print(D);
	}
}