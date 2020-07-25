package com.min.first.blackjack;

public class Card {
	public final static String[] PATTERNS = {"하트", "다이아", "스페이드", "클로버"};
	private final String pattern;
	private final String denomination;
	private final int point; 
	
	
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	
	public  String getPattern() { //set을 안넣으면 수정을 못한다.
		return pattern;
	}
	

	public  String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {// 숫자는 원래의 숫자값 j,q,k는 10점을 위한 point
		return point;
	}
	
	@Override
	public String toString() {
		
		return String.format("p: %s, d: %s", pattern, denomination);
	}	
}
