package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = new int[1000];
		
		Random r = new Random();
		
		//2부터 20까지 임의로 만들어서
		//배열에 넣어보세요.!
		//int jumsu2 = r.nextInt(20) + 1; //0~3
		//	System.out.println(jumsu2);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(19) +2;
			
		}	
		//전체프린트
			for (int x : jumsu) {
				System.out.println(x);
			}	
			
			
		
		//3이상인 숫자 몇 개 인지 프린트!  <- 안풀린 문제...!!!!!!!!!!
			int count = 0;
			int sum = 0;
			for (int i = 0; i < jumsu.length; i++) {
				if(jumsu[i] >= 10) {
					count++;	
					sum = sum + jumsu[i];
			}
		}	
			System.out.println(count);
			System.out.println(sum);
			
			
		
			
			
			
	}

}
