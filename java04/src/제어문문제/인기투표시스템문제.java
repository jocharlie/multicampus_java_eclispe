package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Tr = 0;
		int kim = 0;
		int yun = 0;
		
		Scanner sc = new Scanner(System.in);
		int count = 0; //변수할당. 쓰레기 값 초기화
		while (true) {
			System.out.println("독재자투표1)트럼프2)김정은3)윤석열 4)종료");
			System.out.print("선택번호>>");
			count++;
			int choice = sc.nextInt();
			if( choice == 4) {
				System.out.println("독재자투표를 종료합니다.");
				System.out.println("독재자투표횟수는" + count + "표");
				System.out.println("트럼프: " + Tr + "표");
				System.out.println("김정은: " + kim + "표");
				System.out.println("윤석열: " + yun + "표");
				
				break;//
				
				
			}
			if ( choice == 1) {
				Tr++;
			} else if (choice == 2){ 
				kim++;
			} else if (choice == 3){ 
					yun++;
			} else {
				System.out.println("없는번호입니다.");
			}
		}
		sc.close();
		System.out.println("독재자투표1)트럼프2)김정은3)윤석열 4)종료");
		
	}

}
