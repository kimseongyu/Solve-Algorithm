package Baekjoon.Bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2309 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> tall = new ArrayList<>();
		for(int i = 0; i < 9; i++)
			tall.add(input.nextInt());
		for(int i = 0; i < 9; i++) {
			int sum = 0;
			for(int j = 0; j < 9; j++) {
				sum = 0;
				List<Integer> a = new ArrayList<>();
				a.addAll(tall);
				if(i == j)continue;
				a.set(i, 0); a.set(j, 0);
				for(int k = 0; k < 9; k++) {
					sum += a.get(k);
				}
				if(sum == 100) {
					tall = a;
					break;
				}
			}
			if(sum == 100) break;
		}
		tall.sort(null);
		for(int i = 0; i < 9; i++) {
			if(tall.get(i) != 0) {
				System.out.println(tall.get(i));
			}
		}
	}
}
