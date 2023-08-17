package 배열복습;

import javax.print.DocFlavor.STRING;

public class 스트링과배열2 {

	public static void main(String[] args) {
		// 스트링의 일부를 추출, 확인사용하는 메서드
//		String s = "감자, 고구마, 양파";
//		//스트링에 들어있는 문자열을 분리시키고 싶을 때 split(기준), 기준==구분자
//		//분리된 결과는 배열에 들어감.
//		String[] s2 = s.split(",");
//		System.out.println(s2.length);
//		System.out.println(s2[0]);
//		String ss = "감자 고구마 양파";
//		String[] s22 = s.split(" ");
//		System.out.println(s22[2]);
//		
//		String s3 = "    홍길동"; //공백 4 (스페이스)
//		System.out.println(s3.trim()); //공백문자제거
//		String s4 = s3.trim();
//		System.out.println(s4.length());
//		
//		String s5 = s3.replace("    ", "");
//		System.out.println(s5.length());
//		
//		String s6 = "홍길동"; //각각의 글자 하나하나 분리하고 싶을 때!!
//		char[] s7 = s6.toCharArray();
//		System.out.println(s7[0]);
//		System.out.println(s7[1]);
//		System.out.println(s7[2]);
//		System.out.println(s5.length());
		
		
		//전화번호 입력 문제 >> 011-245-1234
		String number = " 011-245-1234 ";
		String number2 = number.trim();
		//1. 양쪽 공백 제거하시오.
		System.out.println(number2);
		System.out.println(number.trim());
		
		//2 - 을 기준으로 분리해내세요!! (String[])
		String[] number3 = number2.split("-");
		System.out.println(number3.length);
		System.out.println(number3[0]);
		System.out.println(number3[1]);		
		System.out.println(number3[2]);
		//3 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 APPLE
		if (number3[0].equals("011")) {
			System.out.println("SK");
		} else if (number3[1].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("APPLE");
		}
		
		//배열의 두번째 문자열을 길이 구분
		if(number3[1].length()>=4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
			
		}
		
		int total = number3[0].length() + number3[1].length() + number3[2].length();
		
		System.out.println(total);
		if (total>=10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지않은 전화번호");
		}
		
		
		int total2 = 0;
		for (int i = 0; i < number3.length; i++) {
			total2 = total2 + number3[i].length();
		}
		System.out.println(total2);
		
		
		
	}

}
