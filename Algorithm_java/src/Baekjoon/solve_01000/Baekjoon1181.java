package Baekjoon.solve_01000;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++)
			arr.add(sc.next());
		
		arr.sort(null);
		for (int i = 1; i < arr.size(); i++) {
			String s = arr.get(i);
			int index = i-1;
			while(index >= 0 && s.length() < arr.get(index).length()) {
				index--;
			}
			arr.add(index+1, s);
			arr.remove(i+1);
		}
		
		System.out.println(arr.get(0));
		for(int i = 1; i < n; i++) {
			if(!arr.get(i).equals(arr.get(i-1))) {
				System.out.println(arr.get(i));
			}
		}
	}
}