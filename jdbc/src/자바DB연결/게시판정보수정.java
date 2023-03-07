package 자바DB연결;

import java.util.Scanner;

public class 게시판정보수정 {

	public static void main(String[] args) {
		
		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 제목을 입력하세요.");
		
		int NO = sc.nextInt();
		String title = sc.next();
		
		
		BbsDAO dao = new BbsDAO();
		dao.update(title, NO); //
	}

}
