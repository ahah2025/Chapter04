package com.javaex.ex03;

public class MyList <T> {

	// 필드
	private T[] oArr; // 상상 추가하면 늘어나면 삭제하면 줄어든다
	private int crtPos; // 현재위치 -->화살표

	// 생성자
	public MyList() {
		oArr = (T[])new Object[3]; // 상상 추가하면 늘어나면 삭제하면 줄어든다
		crtPos = 0;
	}

	// 메소드 gs

	// 메소드 일반
	public void add(T p) {
		this.oArr[crtPos] = p; //업캐스팅 되지 않는
		this.crtPos++;
	}

	public T get(int i) {
		return oArr[i];
	}

	public int size() {
		return crtPos;
	}

}
