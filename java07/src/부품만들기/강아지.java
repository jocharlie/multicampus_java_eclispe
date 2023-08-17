package 부품만들기;

public class 강아지 {

		// public은 아무데서나   접근제어자
	public	String dog; // 멤버변수는 자동초기화!!!!!!(0)
	public	String species ; //기본형이 아닌 경우(참조형) null로 초기화

			//동작: 멤버메서드(함수와 동일), 동적인 기능을 수행
			//		인터넷하다. 카톡하다.
		public void 산책을하다() {
			//기능 처리하는 방법을 나열
			System.out.println("짖는다.");
			System.out.println("으르렁거린다..");
		}
		public void 먹이를주다() {
			System.out.println("오늘의 메뉴는 개껌이다.");
			System.out.println("오늘의 메뉴는 멍멍이용 스테이크다.");
			
		}

}
