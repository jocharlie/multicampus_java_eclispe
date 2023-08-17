package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] s = {
				{"국민카드","국민은행","kb캐피탈"},
				{"신한은행","신한카드","신한캐피탈"},
				{"우리은행","우리카드","우리fis"}
				}; // 전체를 프린트
		for (int i = 0; i < s.length; i++) {//행
			for (int j = 0; j < s[i].length; j++) { 
					System.out.println(s[i][j]);
				}//한 행을 다 찍기 위함(열)
				
			}
		
		
	}

}
