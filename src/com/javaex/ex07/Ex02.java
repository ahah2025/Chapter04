//로또 번호 랜덤 생성
package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		//번호 계속 생성 
		//번호가 6개 되면 끝 --> Set 의 갯수가 6개면 끝
		
		//로또 번호 프로그램 작성
		//Set
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(true) { //반복문
			if(iSet.size() == 6) {  //iSet 에 숫자 6개면 끝
				break; //iSet 숫가 6개 끝나면 멈춤
			}
		//19 라인부터 21 라인까지 //*조건문	
			
			int no = (int)(Math.random()*45)+1;
			iSet.add(no);  //중복이면 안들어간다
			System.out.println(no);
			
		}
		
		System.out.println("-----------------------------------------");
		//출력
		for( int no : iSet ) {
			System.out.print(no+"\t");
		}
		
	}

}
