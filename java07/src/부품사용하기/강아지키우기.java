package 부품사용하기;

import 부품만들기.강아지;

public class 강아지키우기 {

	public static void main(String[] args) {
		//전화기를 만들어보자. 2개를 만들어보자.
		
		강아지 p1 = new 강아지();
		//퍼블릭을 붙여주지 않으면 안보인다....!!!!!!!!!!!! 퍼블릭은 다른패키지에서도 아무곳이나 접근가능하다. 접근제어자
		
		p1.dog = "누렁이";
		p1.species = "요크셔테리어";
		p1.산책을하다();
		System.out.println("개의 이름은" + p1.dog);
		System.out.println("개의 종은" + p1.species);
		
		
		강아지 p2 = new 강아지();
		p2.dog = "개껌";
		p2.species = "강아지용스테이크";
		p2.먹이를주다();
		System.out.println("베리가 가장좋아하는메뉴는? " + p2.dog);
		System.out.println("베리가 가장 좋아하는 메뉴 두번째는?" + p2.species);
	}
}
