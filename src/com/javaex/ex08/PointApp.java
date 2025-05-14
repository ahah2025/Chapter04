//중복체크 하기 위해서 Set 이라는것을 사용
package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();
		
		//주소 x+y --> 주소만드는 공식을 잘만들면 횟수를 줄일 수 있다
		Point p01 = new Point(1,2);   //11111 -> 2
		Point p02 = new Point(10,20); //22222 -> 30
		Point p03 = new Point(2,1);   //33333 -> 3
		Point p04 = new Point(1,2);   //44444 -> 3
		
		Point p05 = new Point(0,3);   //55555-> 3  주소 -> x+y
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		System.out.println("------------------------");
		System.out.println(pSet.toString());

		System.out.println("------------------------");
		for(Point p : pSet) {
			//System.out.println(p.getX()+","+p.getY());
			System.out.println(p.hashCode());
			System.out.println(p.toString());
			
		}
		
		
	}
	
}
