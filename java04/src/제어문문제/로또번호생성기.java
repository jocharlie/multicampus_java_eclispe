package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		
		// 가짜 랜덤을 만들어주는 부품.
		Random r = new Random(10); //씨앗값, seed
		for (int i = 0; i < 6; i++) {
		System.out.println("로또번호:" + r.nextInt(10));  //10집어 넣으면0~9
		
			
		}
		//?? random한 바뀌어서??
		// 내가 잘해서 속도가 바뀌어서???
		
	}

}
