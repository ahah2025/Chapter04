package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {
	
	public static void main(String[] args) {
		//*포인트는 포인트별로 관리, 원은 원별로 관리
		
		//포인트 관리////////////////////////////////
		//포인트 리스트
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//포인트리스트에 포인트(주소)를 넣는다
		//메모리를 낭비없이 관리한다
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		Point p = pList.get(0);
		System.out.println(p.toString());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		
		System.out.println("-----------------------------------");
		
		//원 관리////////////////////////////////
		//원 리스트
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		//원리스트 포인트주소를 추가하면 안된다
		Circle c01= new Circle(10);
		Circle c02= new Circle(20);
		
		//원리스트에 원(주소)를 넣는다
		//메모리를 낭비없이 관리한다
		cList.add(c01);
		cList.add(c02);
		//cList.add(p01); //Circle 이외의 다른것은 넣을 수 없다
		
		for(int a=0; a<cList.size() ; a++) {
			System.out.println(cList.get(a).toString());
		}
		System.out.println("------------------------");
		
		Circle c03 = new Circle(30);
		cList.add(c03);
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		System.out.println("-----------------------");
		
		cList.remove(1);   //1번방을 지워라
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		System.out.println("-----------------------");
		
		System.out.println(cList.toString());
		
	}

}
