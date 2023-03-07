package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.getContentPane().setBackground(Color.green);
	
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		
		JButton b1 = new JButton();
		b1.setText("별10개");
		JButton b2 = new JButton();
		b2.setText("커피*5");
		JButton b3 = new JButton();
		b3.setText("커피*우유3개");
		JButton b4 = new JButton();
		b4.setText("1:짱");
		
		Font font = new Font("D2Coding", 1 , 45);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		//1) 버튼에다가 액션기능을 추가하겠다고 설정
		//2) 클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩해주면 됨.
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b1을 클릭했음");
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b2을 클릭했음");
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
					
				}
				System.out.println();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b3을 클릭했음");
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
					
				}
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b4을 클릭했음");
				for (int i = 0; i < 3; i++) {
					System.out.println(i+1 + ":짱!");
					
				}
			}
		});
		
		
		f.setVisible(true);


	}

}
