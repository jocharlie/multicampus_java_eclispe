package 상속응용;

public class 동시프로그램실행2스레드 {

	public static void main(String[] args) {
		//아까 만든 동시에 돌아가게 하는 스레드 부품 2개 사용
		$스레드 달러 = new $스레드();
		골뱅이스레드 골뱅이 = new 골뱅이스레드();
		앤드스레드 앤드 = new 앤드스레드();
		
		//3. 스레드 프로그램 2개 시작
		달러.start();
		골뱅이.start();
		앤드.start();
	}
}
	

