package Baekjoon.solve_10000;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon11656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			arr.add(s.substring(i));
		}
		
		arr.sort(null);
		
		for(String st: arr) {
			System.out.println(st);
		}
	}
}
