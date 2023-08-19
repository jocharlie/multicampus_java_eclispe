package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환확인문제 {

	public static void main(String[] args) {
		//클래스 형변환 == 참조형 형변환
		// 상속! 관계일때만 형변환이 가능!!!!!
		
		ArrayList me = new ArrayList();
		// 자동형변환(업캐스팅)
		me.add(1000);  //Object(큰) <- Integer(작)
		me.add(189.1); //Object(큰) <- Double
		me.add(false);//Object(큰) <- Boolean(작)
		me.add('남');	//Object <- Character <- char
		me.add(new JButton("나는 버튼")); //Object(큰) <- JButton(작)
		
		
		//ArrayList는 toString()가 재정의
		//list라는 참조형이기 때문에 list를 프린트하면 주소!가 프린트
		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
		//list를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		System.out.println(me);
		
		int money = (Integer)me.get(0);
		System.out.println(money + 2000);
		
		double height = (Double)me.get(1);
		System.out.println(height + 10);
		
		boolean food = (Boolean)me.get(2);
		
		if (food) {
			System.out.println("배불러요");
		}else {
		System.out.println("배고파요");
		}
		
		char gender = (char)me.get(3); //char <- Character <- Object
		
		if (gender == '남') {
			System.out.println("주민번호는 1,3이예요");
		} else {
			System.out.println("주민번호는 2,4이예요");
		}
	}
}
