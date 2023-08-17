package 메서드연습;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력반환값체크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random r = new Random();
			int data1 = r.nextInt(5);
			String data2 = JOptionPane.showInputDialog("이름입력");
			String data3 = JOptionPane.showMessageDialog(null, data2);//void
			
	}

}
