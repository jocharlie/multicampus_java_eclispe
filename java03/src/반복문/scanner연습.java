package 반복문;

import java.util.Scanner;

public class scanner연습 {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in); //컴퓨터.키보드
		//자바프로그램과 콘솔간에 통로를 만든다.
		//연산통료 == 강물(스트림, Stream)
		//Stream은 내가 닫아주지 않으면 계속 가지고 있게 됨.
		//Stream을 반드시 닫아주자!!!!!!
		System.out.println("나에 대한 정보 이름");
		String name = sc.next();
		System.out.println("나에 대한 정보 나이");
		int data = sc.nextInt();
		System.out.println("나에 대한 정보 취미");
		String hobby = sc.next();
		
		
		System.out.print("나의 이름은");
		String data2 = sc.next(); // 단어
		System.out.println("난 내일 " + data2 + "를 할거야");
		
		sc.close();
	}
	
}