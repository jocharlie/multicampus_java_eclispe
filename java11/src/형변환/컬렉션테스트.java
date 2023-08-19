package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {

		//많은 양의 데이터를 다루는 부품류를 콜렉션(collection)
		//==> 종류가 많다.
		//==> 많은 양의 데이터들도 특징이 있고, 그 특징에 따라 콜렉션의 종류가 많음.
		// == > 배열 + 사이즈조절 + 타입 아무거나 넣을 수 있는 ArrayList
//		ArrayList list = new ArrayList();   //꺽쇠있고없고의 차이는 <> 나중에 !
//		list.add("홍길동");
//		list.add(100);
//		list.add(11.2);
//		list.add(true);
//		//toString()재정의되어있어서 가르키는 값들이 프린트!!
//		System.out.println(list);  //주소가 안나오고 그 주소의 값들이 나오고 있다.
//		System.out.println(list.get(0));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
//		System.out.println(list.get(1));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
//		System.out.println(list.get(2));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
//		System.out.println(list.get(3));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
//		
//		//중간에 삽입
//		list.add(0, "김길동");
//		System.out.println(list);
//		//제거
//		list.remove(0); //파괴함수? 비파괴함수?  원본을 파괴시켜버리는 메서드는 파괴함수 (원본이 변형, ram에 있는 데이터 변경)
//		//비파괴함수: 원본은 파괴되지 않고 ram에 있는 데이터 불변
//		System.out.println(list);
//		//변경
//		list.set(0, "정길동"); // 파괴함수(o)
//		System.out.println(list);
//		
//		int index = list.indexOf(true);
//		System.out.println(index);
//		
//		//포함여부 확인
//		boolean result = list.contains(11.2);
//		System.out.println(result);
		
		
		
		//컬렉션 선택 후 구현
		
		ArrayList list1 = new ArrayList();   //꺽쇠있고없고의 차이는 <> 나중에 !
		list1.add("박스키");
		list1.add("송스키");
		list1.add("김스키");
		list1.add("정스키");
		
		System.out.println(list1);  //주소가 안나오고 그 주소의 값들이 나오고 있다.
		System.out.println(list1.get(0));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
		System.out.println(list1.get(1));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
		System.out.println(list1.get(2));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
		System.out.println(list1.get(3));  //주소가 안나오고 그 주소의 값들이 나오고 있다.
		// 2등 반칙!
		list1.remove(1);
		System.out.println(list1);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println((i+1) + ":등 " + list1.get(i));
			
		}
		
		System.out.println(list1.contains("김연아"));
		System.out.println(list1.size());
		
		
		ArrayList list2 = new ArrayList();
		list2.add("이스키");
		list2.add("박스키");
		list2.add("양스키");
		list2.addAll(list2); // 파괴형함수
		System.out.println(list2);
		
		System.out.println(list2.isEmpty());
		System.out.println(list2);
		list2.clear();
		System.out.println(list2);
		
		
	}

}
