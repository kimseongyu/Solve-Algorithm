package Baekjoon.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1037 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		ArrayList<Integer> b = new ArrayList<>();
		for(int i = a.nextInt(); i > 0; i--)
			b.add(a.nextInt());
		b.sort(null);
		System.out.print(b.get(0)*b.get(b.size()-1));
	}
}
