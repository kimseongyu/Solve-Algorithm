package Baekjoon.unsolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2108 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int a = input.nextInt();
		for(int i = 0; i < a; i++)
			list.add(input.nextInt());
		list.sort(null);
	}
}
