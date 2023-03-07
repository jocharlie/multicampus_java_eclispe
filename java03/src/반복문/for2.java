package 반복문;

public class for2 {

	public static void main(String[] args) {
		// 3번반복
		//for(초기값; 조건식; 증감식)
		for (int i =0; i < 3; i++) {
			//i = 0, i<3(true), 처리, i++
			System.out.println(i + "내가 반복1");
		}

		//100번 반복 -- > 내가 반복2 >>0
		for (int i =0; i < 100; i++) {
			//i = 0, i<3(true), 처리, i++
			System.out.println("내가 반복2>>"+i);
		}
		//10번 반복 --> 내가 반복3 >> 1번째 실행중
		for (int i =0; i < 10; i++) {
			//i = 0, i<3(true), 처리, i++
			System.out.println("내가 반복3>>"+ (i+1) + "번째 실행중");
		}
		
	}

}
