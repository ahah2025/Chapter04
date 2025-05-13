package com.javaex.ex02;

public class MyApp {

	public static void main(String[] args) {
		//*포인트 포인트별로 관리, 원은 원별로 관리
		//포인트(포인트만 관리)
		//포인트 리스트
		MyList pList = new MyList();
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//포인트 리스트에 포인트 (주소) 추가
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//출력
		((Point)pList.get(0)).getX()
		System.out.println(pList.get(0).toString());
		System.out.println(pList.get(1).toString());
		System.out.println(pList.get(2).toString());
		
		
		
		
	}

}
