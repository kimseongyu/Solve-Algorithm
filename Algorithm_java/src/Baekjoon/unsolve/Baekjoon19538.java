package Baekjoon.unsolve;

import java.io.*;
import java.util.*;

public class Baekjoon19538 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		boolean[][] arr = new boolean[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int m;
			while ((m = Integer.parseInt(st.nextToken())) != 0) {
				arr[i][m] = true;
			}
		}
		int[] num = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			num[i] = -1;
		}

		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		

		for (int i = 1; i <= n; i++) {
			bw.write(num[i] + " ");
		}
		bw.flush();
		bw.close();
	}
}
