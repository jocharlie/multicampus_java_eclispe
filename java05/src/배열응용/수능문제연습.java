package 배열응용;

import java.util.Random;

public class 수능문제연습 {

	public static void main(String[] args) {
//		 수능 10000명의 점수를 처리!
		int[] suneung = new int[10000];
		
	//	랜덤으로 10000명의 넣어주세요. ==> Random필요
		
		// suneung = { 0    , 0    , 0, 0, 0, .....};
		//주소 suneung[0]  suneung[1]
		Random r = new Random(42);
		for (int i = 0; i < suneung.length; i++) {
			suneung[i] = r.nextInt(451);// 0~450
		}
		
		for (int i = 0; i < suneung.length; i++) {
			System.out.println(i + ": "+ suneung[i]);
		}
		// 0~450
			//	0~450
			//	1) 만점자가 몇 명인지?? 누구인지(인덱스)
		//	2) 0점이 몇 명인지??
				int maxCount = 0;
				int zeroCount = 0;
				for (int x : suneung) {
					//점수가 450과 동일한지 체크해서 true이면
					//카운트 증가하게 됨.
					if (x == 450) {
						maxCount++;
					}//if	
					if (x == 0) {
						zeroCount++;
					}
				}//for
				System.out.println("수능만점자" + maxCount);
				System.out.println("수능빵점자" + zeroCount);
			
				//	3) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
				int sum = 0;
				for (int x : suneung) {
					sum = sum + x;
				}
				double avg = (double)sum / suneung.length;
				System.out.println("전체 수험생의 합계는" + (double)sum / suneung.length);
				//	4) 심화)) 평균보다 +-50점 인 학생 카운트(포함)
			//	   >=
				
				int avgPlusMinus = 0 ; //선언! 할때 자바는 변수를 만들어준다.!!!
//				250 <=avg <= 350, avg = 300인 경우
				// avg-50 <= ____ <= avg+50
				for (int x : suneung) {
					if ((avg-50) <= x && (x<= avg+50)) {
						avgPlusMinus++;
					}
				}//for
				System.out.println("평균 범위에 있는 수험생 수는" + avgPlusMinus + "명");
				
				//상위 30%
				
				
				
				
				
				
		

	}

}
