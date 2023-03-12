package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		
		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("NO/title/content/writer순으로 입력하세요.");
		int NO = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.insert(NO, title, content, writer); //
	}

}
