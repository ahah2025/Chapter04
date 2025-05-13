package com.javaex.ex01;

public class CircleList {

	// 필드
	private Circle[] cArr; // 상상 추가하면 늘어나면 삭제하면 줄어든다
	private int crtPos; // 현재위치 -->화살표

	// 생성자
	public CircleList() {
		cArr = new Circle[3]; // 상상 추가하면 늘어나면 삭제하면 줄어든다
		crtPos = 0; //현재위치 0으로 맞춤
	}

	// 메소드 gs

	// 메소드 일반
	public void add(Circle c) {
		this.cArr[crtPos] = c;
		this.crtPos++;
	}

	public Circle get(int i) {
		return cArr[i];
	}

	public int size() {
		return crtPos;
	}
}
