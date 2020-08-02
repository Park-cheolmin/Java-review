package com.min.first.review;

import java.util.Scanner;
//객체지향 야구
public class Myball {

	private int[] myArr;
	private Scanner sc;
	
	public void MyBall(int num) {
		init(num);
	}
	
	private void init(int num) {
		myArr = new int[num];
		sc = new Scanner(System.in);
	}
	
	public void setNumbers() {  //사용자 입력 숫자 n개
		
		for(int i =0; i<myArr.length;i++) {
			System.out.printf("숫자 %d :",i+1);
			String val = sc.nextLine();
			
			try {
				myArr[i] = Integer.parseInt(val);
			} catch(Exception e) {
				i--;
				System.out.println("숫자만 입력하세요.");
				continue;
			}
					
			if(myArr[i]<1 || myArr[i]>9) {
				System.out.println("1~9 범위 이내의 숫자를 입력해주세요");
				i--;
				continue;
			}
			
			
			for(int z=0; z<i; z++) {
				if(myArr[i]==myArr[z]){
					System.out.println("중복된 숫자를 입력하셨습니다");
					i--;
					break;
				}
			
			}
		
		}
		
	}
	
	public int get(int idx) {
		return myArr[idx];
	}
	
	
}
