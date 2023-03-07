package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중 짝수만 프린트를 하고싶어요 (2n+1, 2n)
		
		for (int i = 1; i <= 10; i++) {
			
				if ( i ==8 ) {
					//break; for문종료, for문아래에 있는 내용 이어서 실행~~~~!
					System.exit(0);
					//0이 아닌 다른 값 : 비정상종료
				}
				
				if (i % 2 !=0 ) //홀수!!
					//i가 8이 되면 종료!
				continue; //i만 for문 안의 내용을 실행하지 말아라
		
			System.out.println(i);
		}
			System.out.println("휴~ for문 다 끝났다.@@@");
	}

}
