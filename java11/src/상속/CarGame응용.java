package 상속;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame응용 extends JFrame {

	public static void main(String[] args) {
		CarGame응용 f = new CarGame응용();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
	}

	public CarGame응용() {
		setTitle("세계의 기차들의 경주게임");
		setSize(700, 800);

		MyThread car1 = new MyThread("신칸센.png", 200,100);
		MyThread car2 = new MyThread("ktx.png", 200, 400);
		MyThread car3 = new MyThread("TGV.png", 200, 700);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
		
		
	}

	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 200); // jframe에 붙은 위치 지정
			add(label);
		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x을 늘려주는 것.!
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0~49
				x = x + move; // 100 + 45
				label.setBounds(x, y, 200, 200); // 다시 위치 지정
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}