package Icpc_2020;

import java.util.Scanner;

public class pa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		for(int i = 0; i < (n+1)/2; i++) {
			num = (2*num)%16769023;
		}
		System.out.print(num);
	}
}
