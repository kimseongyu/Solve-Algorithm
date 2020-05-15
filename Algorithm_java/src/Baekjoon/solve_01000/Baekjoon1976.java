package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1976 {
	static int[] root;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int M = input.nextInt();
		root = new int[N];
		for(int i = 0; i < N; i++)
		    root[i] = i;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int a = input.nextInt();
				if(a == 1) {
					Union(i,j);
				}
			}
		}
		int a = Find(input.nextInt()-1);
		int b = 0;
		for(int i = 1; i < M; i++) {
			b = Find(input.nextInt()-1);
			if(a != b) {
				System.out.print("NO");
				break;
			}
		}
		if(a == b) {
			System.out.print("YES");
		}
	}
	
	static int Find(int x){
	    if(root[x] == x){
	        return x;
	    } else {
	        return root[x] = Find(root[x]);
	    }
	}
	
	static void Union(int x, int y){
	    x = Find(x);
	    y = Find(y);
	    root[y] = x;
	}
}
