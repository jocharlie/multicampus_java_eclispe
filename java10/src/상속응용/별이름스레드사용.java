package 상속응용;

public class 별이름스레드사용 {

	public static void main(String[] args) {
		//아까 만든 동시에 돌아가게 하는 스레드 부품 2개 사용
		별스레드 별 = new 별스레드();
		이름스레드 이름  = new 이름스레드();
	
		
		//3. 스레드 프로그램 2개 시작
		별.start();
		이름.start();
		
	}
}
