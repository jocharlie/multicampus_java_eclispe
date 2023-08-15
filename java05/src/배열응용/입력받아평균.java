package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력을 여러번 여러개 받아서
		// 저장공간에 젛고 싶을 때 ==> 배열을 사용!
		//1. 배열을 만들어주세요.
		int[] jumsu = new int[5];
		
		//배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문사용해야함.
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력");
			
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu ) {
			System.out.println(x + "");
			
		}
		System.out.println();
		
		//1. 전체 합계구해서, 평균구해보세요.
		//==> 평균 = 합계/ 전체갯수
		//2. 300이상되는 숫자만 찾아서, 합계를 구해보세요.
		//3. 심화문제, 300이상 되는 위치인 index를 프린트
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 300 ) {
				count++;	
				sum = sum + jumsu[i];
		}
	}	
		System.out.println(count);
		System.out.println(sum / count);
		//3. 심화문제, 300이상 되는 위치인 index를 프린트
		//==> 해당인덱스의 값이 300이상인지 조건 체크 -- > i
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 300 ) {
				System.out.println(i);
		}
	}	
		
		
	}

}
