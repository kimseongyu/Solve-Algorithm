package Baekjoon.solve_04000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon4641 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		int c, d;
		while(true) {
			d = 0;
			while(true) {
				c = input.nextInt();
				if(c == 0 || c == -1) {
					break;
				}
				a.add(c);
			}
			if(c == -1) {
				break;
			}
			for(int i = 0; i < a.size(); i++) {
				for(int j = 0; j < a.size(); j++) {
					if((double)(a.get(i))/(double)(a.get(j)) == 2) {
						d++;
					}
				}
			}
			b.add(d);
			a.clear();
		}
		for(int i = 0; i< b.size(); i++) {
			System.out.println(b.get(i));
		}
	}
}
