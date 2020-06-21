package com.min.first.review;

import java.util.Scanner;

public class Misson1 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력해주세요 :  (남/여)");
		String sex = sc.next();
		
		System.out.println("키를 입력해주세요 : ");
		int height = sc.nextInt();
		
		sc.close();
		
		if("남".equals(sex)) {
			if(height<160) {
				System.out.println("평균 미만입니다.");
			} else if(height==160){
				System.out.println("평균 입니다.");
			} else {
				System.out.println("평균 초과입니다.");
			}
		} else if("여".equals(sex)){
			if(height<150) {
				System.out.println("평균 미만입니다.");
			} else if(height==150) {
				System.out.println("평균 입니다.");
			} else {
				System.out.println("평균 초과입니다.");
			}
			//아아아
		}
		
	}
}
