package com.min.first.review;

import java.util.Scanner;

public class Dan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		for(int i = dan; i<dan+1; i++) {
			
			for(int z = 1; z<10; z++) {
				System.out.printf("%d * %d = %d\n", i,z, i*z);
			}
			
		}
		
	

	}

}
