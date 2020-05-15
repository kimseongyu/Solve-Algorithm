package Baekjoon.unsolve;

import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon4195 {
	public static int[] root;
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++) {
			int friend = input.nextInt();
			root = new int[2*friend];
			for(int j = 0; j < 2*friend; j++)
				root[j] = j;
			String[] name = new String[2*friend];
			for(int j = 0; j < 2*friend; j++) {
				name[j] = input.next();
			}
			HashMap<String,Integer> hm = new HashMap<>();
			for(int j = 0; j < 2*friend;j++)
				for(String s: hm.keySet())
					if(!name[j].equals(s))
						hm.put(s, hm.size());
			for(int j = 0; j < 2*friend;) {
				Union(hm.get(name[j++]),hm.get(name[j++]));
				int a = Find(root[j-2]);
				int count = 0;
				for(int k = 0; k < 2*friend;k++) {
					if(a == Find(k)) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
	
	public static int Find(int x){
	    if(x == root[x]){
	        return x;
	    }else{
	        int y = Find(root[x]);
	        root[x] = y;
	        return y;
	    }
	}
	
	public static void Union(int x, int y){
	    x = Find(x);
	    y = Find(y);
	    root[y] = x;
	}
}
