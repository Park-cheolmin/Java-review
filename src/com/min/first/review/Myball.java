package com.min.first.review;

import java.util.Scanner;
//객체지향 야구
public class Myball {

	private int[] myArr;
	private Scanner sc;
	
	
	public void Myball(int num) {
		myArr = new int[num];
		sc = new Scanner(System.in);
	}
	
	public void setNumbers() {
		
		for(int i =0; i<myArr.length; i++) {
			System.out.printf("숫자 %d :",i+1);
			int val = sc.nextInt();
		}
	}
	
	
	
}
