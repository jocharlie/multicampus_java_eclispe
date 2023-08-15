package 배열응용;

import java.util.Scanner;
import java.util.Stack;

public class 배열정리문제 {
//1번
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = new int[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("숫자입력>>" );
//			num[i] = sc.nextInt();
//		}
//		System.out.println("첫째와 셋째의 합은:"+ (num[0] + num[2]));
//		sc.close();
		//2번
		String[] num2 = new String[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num2.length; i++) {
			System.out.println("글자입력" );
			num2[i] = sc.next();
		}
		System.out.println( (num2[0] +"보다는"+ num2[2]));
		sc.close();
		
		
		

		
		
	}

}
