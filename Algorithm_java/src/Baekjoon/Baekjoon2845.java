package Baekjoon;

import java.util.Scanner;

public class Baekjoon2845 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int person = input.nextInt();
		int area = input.nextInt();
		int allPerson = person * area;
		int[] error = new int[5];
		for(int i = 0; i < 5; i++) {
			int num = input.nextInt();
			error[i] = num - allPerson;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(error[i] + " ");
		}
	}
}