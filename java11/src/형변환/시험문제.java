package 형변환;

import java.util.LinkedList;

public class 시험문제 {

	public static void main(String[] args) {
		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.println(subject);
		
		subject.remove();
		System.out.println(subject);
		subject.remove();
		System.out.println(subject);
		subject.remove();
		System.out.println(subject);

	}

}
