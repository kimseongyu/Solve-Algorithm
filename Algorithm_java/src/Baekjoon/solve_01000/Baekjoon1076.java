package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1076 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] a = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		long v = 0;
		String b = s.next();
		for(int i = 0; i < 10; i++)
			if(a[i].equals(b))
				v += i*10;
		b = s.next();
		for(int i = 0; i < 10; i++)
			if(a[i].equals(b))
				v += i;
		b = s.next();
		for(int i = 0; i < 10; i++)
			if(a[i].equals(b))
				v *= Math.pow(10, i);
		System.out.print(v);
	}
}
