package 반복문;

import javax.swing.JOptionPane;

public class for1 {

	public static void main(String[] args) {
		for (; ;) {//무한 루프(반복), while(true)
			System.out.println("잘쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료할까요?? y를입력");
			//== 연산자는 기본데이터만 비교 가능
			//String부품에서 제공하는 기능을 사용해서 비교해주어야함.
			if (data.equals("y")) {
				System.out.println("안녕히가세요!!!");
				break; //for문의 브레이크!!!!!!!!!
			
			}
		}
		System.out.println();
	}

}
