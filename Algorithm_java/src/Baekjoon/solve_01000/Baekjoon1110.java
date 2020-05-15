package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1110 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstNum = input.nextInt();
		int nextNum = firstNum;
		int cycle = 0;
		do {
			nextNum = nextNum%10*10 + (nextNum/10 + nextNum%10)%10;
			cycle++;
		}while(firstNum != nextNum);
		System.out.println(cycle);
	}
}
