package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon1904 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int num1 = 1;
        int num2 = 1;
        int result = 0;
        
        if(a <= 1) {
        	System.out.print(1);
        }else {
        	for(int i = 1; i < a; i++){
                result = (num1 + num2)%15746;
                num1 = num2;
                num2 = result;
            }
            System.out.print(result);
        }
	}
}
