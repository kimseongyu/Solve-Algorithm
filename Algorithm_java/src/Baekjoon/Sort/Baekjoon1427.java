package Baekjoon.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1427 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		String str = input.next();
		for(int i = 0; i < str.length(); i++) {
			list.add((int) str.charAt(i) - 48);
		}
		list.sort(null);
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}
}
