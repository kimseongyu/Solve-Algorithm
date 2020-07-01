package Baekjoon.solve_15000;

import java.util.Scanner;

public class Baekjoon18825 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("풀어야 되는 문제 번호: ");
		int n = sc.nextInt();
		int p = 2;
		n = n + 2;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				p = i;
				System.out.println("n+2를 나누는 가장 작은 소수 p: " + i );
				break;
			}
		}
		int count = 0;
		boolean[] arr = new boolean[p + 1];
		for (int i = 2; i <= p; i += 1) {
			arr[i] = true;
		}

		for (int i = 2; i * i <= p; i += 1) {
			for (int j = i * i; j <= p; j += i) {
				arr[j] = false;
			}
		}
		for (int i = 2; i <= p; i += 1) {
			if (true == arr[i]) {
				count++;
			}
		}
		System.out.println("p이하의 소수의 개수: " + count);
		System.out.println("풀어야되는 문제 번호: " + (999 + count));
	}
}
