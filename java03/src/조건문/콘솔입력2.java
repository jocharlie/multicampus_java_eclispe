package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in); //컴퓨터.키보드
		//자바프로그램과 콘솔간에 통로를 만든다.
		//연산통료 == 강물(스트림, Stream)
		//Stream은 내가 닫아주지 않으면 계속 가지고 있게 됨.
		//Stream을 반드시 닫아주자!!!!!!
		System.out.print("나에 대한 정보 이름");
		String name = sc.next();
		System.out.print("나에 대한 정보 나이");
		int age = sc.nextInt();
		System.out.print("나에 대한 정보 취미");
		double height = sc.nextDouble(); //88.8
		System.out.print("저녁을 먹었나요");
		boolean food=sc.nextBoolean();
		System.out.println("올해의 목표는");
		sc.nextLine();
		String life = sc.nextLine();
		
		
		System.out.print("================");
		System.out.print("내 이름은" + name);
		System.out.print("내년 나이는" + (age+1));
		System.out.print("내년 키는"+(height+10));
		if (food) {
		System.out.print("배가 부르시겠군요");
		}else {
		 // 단어
			System.out.print("배가 부르시겠군요");
		}
		sc.close();
	}
	
}
