package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		try {
			//아래 코드를 분서개보고, 문제가 생길 여지가 있는 코드가
			//에러가 발생했을 때 실행을 제외시켜버리고
			//프로그램이 중단되지 않도록 해보자!
			
			num[3] = 2; //문제가 생길 여지가 있는 코드!
			
		} catch (Exception e) {
			//문제가 생겼을 때 어떻게 처리할지 써주어야함.
			//문제가 생기지 않으면 실행할 여기에 넣어주면 안됨.!
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("배열에 문제가 있음.");
			
		}
		System.out.println(num.length);
		
		
	}

}
