package ThinkProgramming;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i = 0; i < n; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			long z = gcd(x,y);
			a[i] = x/z;
			b[i] = y/z;
		}
		
		long x = a[0];
		for(int i = 1; i < n; i++) {
			x = gcd(x, a[i]);
		}
		
		long y = 0;
		long z = b[0];
		for(int i = 1; i < n; i++) {
			y = gcd(z, b[i]);
			z = (z * b[i]) / y;
		}
		
		y = gcd(x, z);
		x = x/y;
		z = z/y;
		
		System.out.print(x + " " + z);
		
	}
	
	public static long gcd(long a, long b) {
		if(a<b){
			long tmp = a;
	        a = b;
	        b = tmp;
	    }
		while(b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
