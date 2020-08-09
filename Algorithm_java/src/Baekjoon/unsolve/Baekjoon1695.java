package Baekjoon.unsolve;

import java.io.*;
import java.util.*;

public class Baekjoon1695 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int min = n;
		for (int i = 1; i < n - 1; i++) {
			int[] left = Arrays.copyOfRange(arr, 0, i);
			int[] right = Arrays.copyOfRange(arr, i, n);
			for (int j = 0; j < i; j++) {
				int m = n, l = n-i-1;
				for (int k = j; k < i; k++) {
					for (; l >= 0; l--) {
						if (left[k] == right[l]) {
							m -= 2;
							break;
						}
					}
					if (l == -1)
						break;
				}
				min = Math.min(min, m);
			}
		}
		for (int i = 1; i < n - 1; i++) {
			int[] left = Arrays.copyOfRange(arr, 0, i);
			int[] right = Arrays.copyOfRange(arr, i+1, n);
			for (int j = 0; j < i; j++) {
				int m = n-1, l = n-i-2;
				for (int k = j; k < i; k++) {
					for (; l >= 0; l--) {
						if (left[k] == right[l]) {
							m -= 2;
							break;
						}
					}
					if (l == -1)
						break;
				}
				min = Math.min(min, m);
			}
		}
		System.out.print(min);
	}
}
