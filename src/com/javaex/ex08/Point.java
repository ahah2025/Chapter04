package com.javaex.ex08;

import java.util.Objects;

public class Point {

	//필드
	private int x;
	private int y;

	//생성자
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
		
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //진짜 주소가 같은경우
			return true;
		if (obj == null) //비교할 상대가 없는경우
			return false;
		if (getClass() != obj.getClass()) //다른 종족을 비교할 경우
			return false;
		Point other = (Point) obj;
		return this.x == p.x && this.y == p.y;
	}
 
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
			
		Point p = (Point) obj;
		return this.x == this.x && p.y == this.y;
	} 
	 
	@Override
	public int hashCode() {
		int Code = this.x + this.y;
		return Code;
	}
	*/
}
