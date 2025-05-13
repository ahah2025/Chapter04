package com.javaex.ex03;

public class Myapp {

	public static void main(String[] args) {
		//*포인트 포인트별로 관리, 원은 원별로 관리
		
		//포인트 관리/////////////////////////////
		//포인트 리스트
		MyList<Point> pList = new MyList<Point>(); //object -->Point 전용
		
		//포인트
		Point p01 = new Point(2,2); 
		Point p02 = new Point(3,3); 
		Point p03 = new Point(4,4); 
	
		//포인트리스트에 포인트(주소)를 넣는다
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		///원 관리
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(20);
		Circle c03 = new Circle(30);

		//출력
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(0).toString());
			//업캐스팅 되지 않았다
		}
		
		//다운캐스팅 하지 않아도 된다
		System.out.println(cList.get(0).getRadius());
		
	}

}
