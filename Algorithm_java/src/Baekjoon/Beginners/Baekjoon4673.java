package Baekjoon.Beginners;

import java.util.LinkedList;
import java.util.List;

public class Baekjoon4673 {
	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<>();
		
		for(int i = 1; i <= 10000;i++) {
			arr.add(i);
		}
		for(int i = 1; i <= 10000;i++) {
			int selfnum = i;
			for(int j = 0; j < (int)(Math.log10(i)+1); j++) {
				selfnum += (i%((int)(Math.pow(10, j+1))))/((int)(Math.pow(10, j)));
			}
			if(arr.indexOf(selfnum)>0) {
				arr.remove(arr.indexOf(selfnum));
			}
		}
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}		
	}
}
