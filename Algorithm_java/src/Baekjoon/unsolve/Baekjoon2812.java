package Baekjoon.unsolve;

import java.util.*;

public class Baekjoon2812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		for(int i = 1; i < n; i++) {
			if(st.lastElement() < s.charAt(i)) {
				st.pop();
				k--;
			}
			st.push(s.charAt(i));
			if(k == 0) {
				for(i = i+1; i < n; i++) {
					st.push(s.charAt(i));
				}
			}
		}
		for(int i = 0; i < st.size()-k; i++) {
			System.out.print(st.get(i));
		}
	}
}
