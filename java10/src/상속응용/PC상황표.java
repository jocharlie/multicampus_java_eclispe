package 상속응용;

public class PC상황표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		카운트스레드 count = new 카운트스레드();
		타이머스레드 timer = new 타이머스레드();
		이미지스레드 images = new 이미지스레드();
		
		count.start();
		timer.start();
		images.start();
	}

}
