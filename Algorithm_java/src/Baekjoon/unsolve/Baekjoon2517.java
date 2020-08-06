package Baekjoon.unsolve;

import java.io.*;
import java.util.*;

public class Baekjoon2517 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			int rank = 1;
			for(int p : set) {
				if(num < p) {
					rank++;
				}
			}
			set.add(num);
			bw.write(rank + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
