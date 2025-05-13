package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		//배열
		//미리갯수를 결정해야 한다(낭비,수정)
		//갯수가 고정(변동폭이 작을때) 유리하다
		/*
		Point[] pArr = new Point[3]; 
		
		//포인트 만들기
		Point p1 = new Point(2,2);
		Point p2 = new Point(3,3);
		Point p3 = new Point(4,4);
		
		//배열에 포인트 주소 담기
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i]);
		}

		//System.out.println(pArr.toString());
		//System.out.println(Arrays.toString(pArr));
		*/
		
		//리스트(포인트)
		PointList pList = new PointList();
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//리스트에 포인트 주소 추가
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		//리스트(원)
		CircleList cList = new CircleList();  
		
		//원
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		Circle c03 = new Circle(5);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		
	}
	
}
