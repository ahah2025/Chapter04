package com.javaex.ex02;

public class MyList {

	// 필드
	private Object[] oArr; // 상상 추가하면 늘어나면 삭제하면 줄어든다
	private int crtPos; // 현재위치 -->화살표

	// 생성자
	public MyList() {
		oArr = new MyList[3]; // 상상 추가하면 늘어나면 삭제하면 줄어든다
		crtPos = 0;
	}

	// 메소드 gs

	// 메소드 일반
	public void add(MyList p) {
		this.oArr[crtPos] = p;
		this.crtPos++;
	}

	public Object get(int i) {
		return oArr[i];
	}

	public int size() {
		return crtPos;
	}

}
