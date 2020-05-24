package Baekjoon.unsolve;

import java.util.*;

public class Baekjoon2812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int i = 0;
		String s = sc.next();
		Queue<Character> q = new LinkedList<>();
		q.offer(s.charAt(i++));
		while(--n > 0) {
			if(q.peek() > s.charAt(i)) {
				i++;
				k--;
			}else {
				q.offer(s.charAt(i++));
			}
		}
		while(--k > 0) {
			q.poll();
		}
		while(q.size() != 0) {
			System.out.print(q.poll());
		}
	}
}
