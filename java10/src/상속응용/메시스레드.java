package 상속응용;

public class 메시스레드 extends Thread {
	
	@Override
public void run() {
	// TODO Auto-generated method stub
		String[] images2 = {"messi.png"};
		for (int i = 0; i < images2.length; i++) {
			System.out.println("이미지>> " + images2[i]);
			try {
				Thread.sleep(5000); //5초재워라! //ms(밀리세컨즈)
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}