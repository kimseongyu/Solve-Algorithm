package Baekjoon.solve_02000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2750 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int a = input.nextInt();
		for(int i = 0; i < a; i++)
			list.add(input.nextInt());
		list.sort(null);
		for(int i = 0; i < a; i++)
			System.out.println(list.get(i));
	}
}