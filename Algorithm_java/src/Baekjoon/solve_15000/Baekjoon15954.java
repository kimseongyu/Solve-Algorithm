package Baekjoon.solve_15000;

import java.util.Scanner;

public class Baekjoon15954 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int K = input.nextInt();
		int[] array = new int[N];
		double min = 100000000;
		for (int i = 0; i < N; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < N - K + 1; i++) {
			int count = K;
			while (i + count <= N) {
				double average = 0;
				double result = 0;
				for (int j = 0; j < count; j++)
					average += array[i + j];
				average = average / count;
				for (int j = 0; j < count; j++) {
					result += (array[i + j] - average) * (array[i + j] - average);
				}
				result = Math.sqrt(result / count);
				min = Math.min(min, result);
				count++;
			}
		}
		System.out.println(String.format("%.12f", min));
	}
}