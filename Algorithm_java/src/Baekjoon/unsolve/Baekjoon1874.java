package Baekjoon.unsolve;

import java.util.*;

public class Baekjoon1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		Queue<Character> q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			s.push(i);
			q.offer('+');
			while(!s.isEmpty() && a[p] == s.peek()) {
				s.pop();
				q.offer('-');
				p++;
			}
		}
		
		if(s.isEmpty()) {
			while(!q.isEmpty()) {
				System.out.println(q.poll());
			}
		}else {
			System.out.print("No");
		}
	}
}
